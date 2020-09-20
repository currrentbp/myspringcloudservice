package com.currentbp.myspringcloudservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyspringcloudserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyspringcloudserviceApplication.class, args);
    }

}
