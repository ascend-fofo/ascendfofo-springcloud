package com.dung.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AscendEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AscendEurekaApplication.class, args);
    }

}
