package com.dung.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AscendServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AscendServiceApplication.class, args);
    }

}
