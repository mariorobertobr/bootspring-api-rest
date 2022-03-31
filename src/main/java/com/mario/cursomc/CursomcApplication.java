package com.mario.cursomc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class CursomcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

}
