package pro.bolshakov.gb.spring2.lesson06;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pro.bolshakov.gb.spring2.lesson06.controller.ProductController;

import java.util.Collections;

@SpringBootApplication(scanBasePackageClasses = {ProductController.class})
public class SpringProductsClient {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringProductsClient.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
        ConfigurableApplicationContext context = app.run(args);
    }
}
