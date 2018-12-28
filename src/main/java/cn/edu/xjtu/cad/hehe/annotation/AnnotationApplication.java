package cn.edu.xjtu.cad.hehe.annotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("cn.edu.xjtu.cad.hehe.annotation.dao")
@ComponentScan({"cn.edu.xjtu.cad.hehe.annotation.controller",
        "cn.edu.xjtu.cad.hehe.annotation.service",
        "cn.edu.xjtu.cad.hehe.annotation.aop",
        "cn.edu.xjtu.cad.hehe.annotation.config",
        "cn.edu.xjtu.cad.hehe.annotation.resolver"})
public class AnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnnotationApplication.class, args);
    }

}

