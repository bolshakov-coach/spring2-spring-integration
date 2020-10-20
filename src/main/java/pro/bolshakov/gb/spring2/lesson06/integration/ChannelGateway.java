package pro.bolshakov.gb.spring2.lesson06.integration;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import pro.bolshakov.gb.spring2.lesson06.domain.Product;

@MessagingGateway
public interface ChannelGateway {
    @Gateway(requestChannel = "channel")
    void process(Product product);
}
