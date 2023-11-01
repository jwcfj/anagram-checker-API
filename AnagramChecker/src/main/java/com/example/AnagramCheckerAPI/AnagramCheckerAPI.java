package com.example.AnagramCheckerAPI;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "AnagramChecker API", version = "1", description = "API developed to check if two words are anagrams"))
public class AnagramCheckerAPI {

	public static void main(String[] args) {
		SpringApplication.run(AnagramCheckerAPI.class, args);
	}

}
