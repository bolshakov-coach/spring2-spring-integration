package pro.bolshakov.gb.spring2.lesson06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import pro.bolshakov.gb.spring2.lesson06.domain.Product;
import pro.bolshakov.gb.spring2.lesson06.integration.ChannelGateway;

import java.util.Arrays;

@SpringBootApplication
@IntegrationComponentScan
public class SpringIntegrationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringIntegrationApplication.class, args);

		ChannelGateway channelGateway = context.getBean(ChannelGateway.class);
		channelGateway.process(new Product("Milk", 34.34));
		channelGateway.process(new Product("Chocolate", 114.34));


	}

}
