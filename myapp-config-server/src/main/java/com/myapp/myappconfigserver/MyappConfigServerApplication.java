package com.myapp.myappconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyappConfigServerApplication {

    public static void main(String[] args) {
	SpringApplication.run(MyappConfigServerApplication.class, args);
    }

}
