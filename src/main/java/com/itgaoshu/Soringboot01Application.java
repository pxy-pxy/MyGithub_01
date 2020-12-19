package com.itgaoshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableCaching
@MapperScan("com.itgaoshu.mapper")
public class Soringboot01Application {

	public static void main(String[] args) {
		SpringApplication.run(Soringboot01Application.class, args);
	}

}
