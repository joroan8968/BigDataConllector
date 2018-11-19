package com.gavin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientUserinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientUserinfoApplication.class, args);
    }
}
