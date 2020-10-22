package pro.bolshakov.gb.spring2.lesson06.integration;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.http.outbound.HttpRequestExecutingMessageHandler;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import pro.bolshakov.gb.spring2.lesson06.domain.News;

import java.util.Map;

@Component
public class FirstServiceActivator {

    @ServiceActivator(inputChannel = "channel")
    public void listenChannel(@Payload String payload,@Headers Map<String,Object> headers){
        System.out.println("********************");
        headers.forEach((k,v) -> System.out.println(k + " -> " + v));
        System.out.println("Payload -> " + payload);
        System.out.println("********************");
    }

    @ServiceActivator(inputChannel = "newsChannel")
    public void listenNewsChannel(@Payload News payload, @Headers Map<String,Object> headers){
        System.out.println("********** NEWS **********");
        headers.forEach((k,v) -> System.out.println(k + " -> " + v));
        System.out.println("Payload -> " + payload);
        System.out.println("********** NEWS **********");
    }
}
