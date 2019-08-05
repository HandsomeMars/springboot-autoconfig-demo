package com.zyj;

import com.zyj.auto.EnableCustomAutoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableCustomAutoConfig
public class SpringbootAutoconfigTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAutoconfigTestApplication.class, args);
    }

}
