package com.deusleyDev.api_publication;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiStarter {

	public static void main(String[] args) {
		SpringApplication.run(ApiStarter.class, args);


	}

}
