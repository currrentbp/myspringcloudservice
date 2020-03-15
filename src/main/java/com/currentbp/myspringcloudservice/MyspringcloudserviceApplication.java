package com.currentbp.myspringcloudservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MyspringcloudserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyspringcloudserviceApplication.class, args);
    }

}
