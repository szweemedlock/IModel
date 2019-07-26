package com.hgt.desktop.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author karl xavier
 * @version 0.1
 * @see "write something..."
*/
@SpringBootApplication(scanBasePackages = "com.hgt.desktop")
@MapperScan(basePackages = "com.hgt.desktop.dao.mapper")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
