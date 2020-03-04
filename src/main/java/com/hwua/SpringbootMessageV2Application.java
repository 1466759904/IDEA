package com.hwua;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.hwua.mapper"})
public class SpringbootMessageV2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMessageV2Application.class, args);
    }

}
