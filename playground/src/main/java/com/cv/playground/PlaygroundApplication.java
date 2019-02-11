package com.cv.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cv.playground.dao.ProductDAO;

@SpringBootApplication
public class PlaygroundApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PlaygroundApplication.class, args);
	}
	
	@Bean
	public ProductDAO productDAO () {
		return new ProductDAO();
	}

}

