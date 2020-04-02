package com.cool.kai;

//import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//exclude={DruidDataSourceAutoConfigure.class}
@SpringBootApplication
@MapperScan(value = "com.cool.kai.dao")
public class KaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaiApplication.class, args);
    }

}
