package com.sky.SkyFlights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SkyFlightsApplication {

	@Bean
	public WebClient localApiClient() {
		return WebClient.create("https://api.tequila.kiwi.com");
	}

	public static void main(String[] args) {
		SpringApplication.run(SkyFlightsApplication.class, args);
	}

}
