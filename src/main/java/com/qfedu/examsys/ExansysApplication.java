package com.qfedu.examsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.qfedu.examsys.dao")
@ServletComponentScan("com.qfedu.examsys.aftercontroller")
public class ExansysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExansysApplication.class, args);
    }

}
