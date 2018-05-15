package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.jk.dao")
@ImportResource(value = {"classpath:dubbo-provider.xml"})
public class AntclassroomProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntclassroomProviderApplication.class, args);
	}
}
