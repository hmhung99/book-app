package com.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.client.RestTemplate;

import com.bookapp.dto.favorites.UpdateFavoriteRequest;
@EntityScan("com.bookapp.models")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class BookappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

}
