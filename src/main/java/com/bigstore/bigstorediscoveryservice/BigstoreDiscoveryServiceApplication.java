package com.bigstore.bigstorediscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BigstoreDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigstoreDiscoveryServiceApplication.class, args);
    }

}
