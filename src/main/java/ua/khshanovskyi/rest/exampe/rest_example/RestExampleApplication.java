package ua.khshanovskyi.rest.exampe.rest_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class RestExampleApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(RestExampleApplication.class);
        application.setDefaultProperties(Collections.singletonMap("server.port", 8083));
        application.run(args);
    }

}
