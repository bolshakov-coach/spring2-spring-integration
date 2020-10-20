package pro.bolshakov.gb.spring2.lesson06.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;

@Configuration
public class IntegrationConfig {

    @Bean("channel")
    public DirectChannel channel(){
        return new DirectChannel();
    }

}
