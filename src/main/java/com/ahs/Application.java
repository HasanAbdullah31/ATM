package com.ahs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        //BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        //System.out.println(encoder.encode("123"));
    }
}
