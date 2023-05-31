package com.demo.skooltime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SkoolTimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkoolTimeApplication.class, args);
	}

}
