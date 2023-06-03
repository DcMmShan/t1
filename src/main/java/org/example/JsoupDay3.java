package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.mapper")
public class JsoupDay3 {
    //主方法
    public static void main(String[] args) {
        SpringApplication.run(JsoupDay3.class,args);
    }
}
