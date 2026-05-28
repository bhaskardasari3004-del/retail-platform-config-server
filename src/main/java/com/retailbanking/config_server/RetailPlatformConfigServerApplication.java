package com.retailbanking.config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class RetailPlatformConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailPlatformConfigServerApplication.class, args);
	}

}
