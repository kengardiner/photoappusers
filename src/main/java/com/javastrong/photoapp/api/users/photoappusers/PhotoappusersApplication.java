package com.javastrong.photoapp.api.users.photoappusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;

@EnableDiscoveryClient
@SpringBootApplication
public class PhotoappusersApplication {
    public static void main(String[] args) {
        SpringApplication.run(PhotoappusersApplication.class, args);
    }

}
