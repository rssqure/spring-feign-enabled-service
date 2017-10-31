package com.rs2.eureka.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringFeignEnabledServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignEnabledServiceApplication.class, args);
	}
}
