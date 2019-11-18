package com.accp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.accp.mapper")
public class DianpuApplication {

	public static void main(String[] args) {
		SpringApplication.run(DianpuApplication.class, args);
	}

}
