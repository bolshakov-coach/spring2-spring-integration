package pro.bolshakov.gb.spring2.lesson06.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("integration/http-products-gateway.xml")
public class ProductIntegrationConfig {
}
