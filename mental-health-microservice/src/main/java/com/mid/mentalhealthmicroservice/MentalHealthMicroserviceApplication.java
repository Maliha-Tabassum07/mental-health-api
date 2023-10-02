package com.mid.mentalhealthmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MentalHealthMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentalHealthMicroserviceApplication.class, args);
	}

}
