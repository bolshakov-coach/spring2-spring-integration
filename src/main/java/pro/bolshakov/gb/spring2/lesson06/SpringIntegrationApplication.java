package pro.bolshakov.gb.spring2.lesson06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Arrays;

@SpringBootApplication
@IntegrationComponentScan
public class SpringIntegrationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringIntegrationApplication.class, args);

		Message<String> message = MessageBuilder
				.withPayload("It is a body")
				.setHeader("StringHeader", "Value")
				.setHeader("IntHeader", 1)
				.setHeader("ListOfStrings", Arrays.asList("String1", "String2"))
				.build();

		DirectChannel channel = context.getBean(DirectChannel.class);
		channel.send(message);


	}

}
