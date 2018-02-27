package com.lottery.eureka.servier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LotteryEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LotteryEurekaServerApplication.class, args);
	}
}
