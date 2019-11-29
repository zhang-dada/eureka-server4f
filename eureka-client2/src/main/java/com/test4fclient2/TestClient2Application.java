package com.test4fclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestClient2Application {
    public static void main(String[] args) {
        SpringApplication.run(TestClient2Application.class);
    }
}
