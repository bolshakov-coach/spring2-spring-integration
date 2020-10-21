package pro.bolshakov.gb.spring2.lesson06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.Message;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.MessageBuilder;
import pro.bolshakov.gb.spring2.lesson06.domain.Product;
import pro.bolshakov.gb.spring2.lesson06.integration.ChannelGateway;

@SpringBootApplication
@IntegrationComponentScan
public class SpringIntegrationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringIntegrationApplication.class, args);

        ChannelGateway channelGateway = context.getBean(ChannelGateway.class);
		channelGateway.process(new Product("Milk", 34.34));
		channelGateway.process(new Product("Chocolate", 114.34));

		DirectChannel invokeCallGetProducts = context.getBean("invokeCallGetProducts", DirectChannel.class);
		invokeCallGetProducts.send(MessageBuilder.withPayload("").build());

		PollableChannel productsChannel = context.getBean("get_products_channel", PollableChannel.class);
		Message<?> receive = productsChannel.receive();
		System.out.println(receive);
		System.out.println(receive.getPayload());


	}

}
