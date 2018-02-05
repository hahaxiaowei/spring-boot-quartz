package com.huntkey.rx.springbootquartzmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@SpringBootApplication
@EnableSwagger2
@ComponentScan("com.huntkey.rx.springbootquartzmanage")
public class SpringBootQuartzManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootQuartzManageApplication.class, args);
	}
}
