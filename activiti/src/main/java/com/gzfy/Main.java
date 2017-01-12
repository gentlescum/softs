package com.gzfy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Created by gac on 2017/1/10.
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude={SecurityAutoConfiguration.class})
public class Main extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(Main.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
