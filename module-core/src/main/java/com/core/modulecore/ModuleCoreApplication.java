package com.core.modulecore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.core.modulecore", "com.dao.moduledao"})
public class ModuleCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleCoreApplication.class, args);
    }

}
