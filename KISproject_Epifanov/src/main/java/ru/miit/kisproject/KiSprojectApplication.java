package ru.miit.kisproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {"ru.miit.kisproject"})
//@MapperScan("ru/miit/kisproject/mapper")
@MapperScan({"ru.miit.kisproject.mapper"})
@EnableScheduling
public class KiSprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(KiSprojectApplication.class, args);
    }

}
