package com.example.AppPortfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppPortfolioApplication {
	@GetMapping("/test")
	public String home() {
		return "Hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(AppPortfolioApplication.class, args);
	}

}
