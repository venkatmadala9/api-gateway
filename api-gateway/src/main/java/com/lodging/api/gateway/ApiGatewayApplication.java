package com.lodging.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@SpringBootApplication
@EnableEurekaClient
@CircuitBreaker(name = "CircuitBreaker")
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
