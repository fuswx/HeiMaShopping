package com.fuswx.heimashopping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.fuswx.heimashopping.Mapper")
public class HeiMaShoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeiMaShoppingApplication.class, args);
    }

}
