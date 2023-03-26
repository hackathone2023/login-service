package com.evergreen.login;

import com.evergreen.login.dto.SignUpResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Random;

@SpringBootApplication
@RestController
public class LoginServiceApplication {

	@GetMapping("/message")
	@CrossOrigin
	public String message(){
		return "Hi Welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(LoginServiceApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer configure() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry reg) {
				reg.addMapping("/**").allowedOrigins("*");
			}
		};
	}

}
