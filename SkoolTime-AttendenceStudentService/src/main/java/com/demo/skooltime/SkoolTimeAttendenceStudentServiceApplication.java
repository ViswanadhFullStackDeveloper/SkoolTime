package com.demo.skooltime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SkoolTimeAttendenceStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkoolTimeAttendenceStudentServiceApplication.class, args);
	}

}
