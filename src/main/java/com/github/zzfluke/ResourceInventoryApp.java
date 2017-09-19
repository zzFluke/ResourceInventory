package com.github.zzfluke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ResourceInventoryApp {

    public static void main(String[] args) {
        SpringApplication.run(ResourceInventoryApp.class, args);
    }
}
