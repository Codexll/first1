package com.example.accessp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.accessp.Mapper")
public class AccesspApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccesspApplication.class, args);
	}

}
