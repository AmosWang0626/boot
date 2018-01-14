package cn.amos.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author DaoyuanWang
 */
@Configuration
@ComponentScan("cn.amos")
@MapperScan("cn.amos.dao.mappers")
@EnableAutoConfiguration
public class BootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootWebApplication.class, args);
    }
}
