package com.basic.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class BasicBackend2Application {

    public static void main(String[] args) {
        SpringApplication.run(BasicBackend2Application.class, args);
    }

}
