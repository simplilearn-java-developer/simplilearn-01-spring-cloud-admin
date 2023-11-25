package com.simplilearn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class Simplilearn01SpringCloudAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Simplilearn01SpringCloudAdminApplication.class, args);
    }

}
