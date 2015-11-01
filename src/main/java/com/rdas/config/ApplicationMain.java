package com.rdas.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by rdas on 30/10/2015.
 */
@SpringBootApplication
public class ApplicationMain {
    private static final Logger log = LoggerFactory.getLogger(ApplicationMain.class);

    public static void main(String[] args) {
        log.info("\n\n{} \n\n", "Spring Boot MVC start!!!!");
        SpringApplication.run(new Object[]{ApplicationMain.class}, args);
    }
}
