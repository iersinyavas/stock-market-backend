package com.artsoft.shareorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShareOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareOrderServiceApplication.class, args);
	}

}
