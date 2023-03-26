package com.evergreen.login;

import com.evergreen.dto.SignUpRequest;
import com.evergreen.dto.SignUpResponse;
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

	@CrossOrigin
	@PostMapping(value = "/login/signUp", consumes = MediaType.ALL_VALUE)
	public SignUpResponse signUp() {
//		String name = signUpRequest.getName().substring(0,3);
//		String compName = signUpRequest.getCompName().substring(0,3);

		Random random = new Random();
		int id = random.nextInt(1000);

		SignUpResponse signUpResponse = new SignUpResponse();
		signUpResponse.setSuccess("true");
		signUpResponse.setEvergreenId("test"+id);

		return signUpResponse;
	}

	@GetMapping("/login/authenticate")
	@CrossOrigin
	public SignUpResponse authenticate(@RequestParam("evergreeid") String evergreenId, @RequestParam("pwd") String id){
		SignUpResponse signUpResponse = new SignUpResponse();
		signUpResponse.setSuccess("true");
		signUpResponse.setEvergreenId(evergreenId);
		return signUpResponse;
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
