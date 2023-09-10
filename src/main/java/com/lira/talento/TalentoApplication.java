package com.lira.talento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class TalentoApplication {

	@GetMapping
	public String getHomeTest() {
		return "Já disse que te amo hoje?";
	}

	public static void main(String[] args) {
		SpringApplication.run(TalentoApplication.class, args);
	}

}
