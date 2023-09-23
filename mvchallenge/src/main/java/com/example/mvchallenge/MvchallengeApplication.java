package com.example.mvchallenge;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "MV Challenge AnagramCheck", version = "1", description = "API developed to check if two words are anagrams"))
public class MvchallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvchallengeApplication.class, args);
	}

}
