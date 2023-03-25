package com.solutions.evergreen.loginservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solutions.evergreen.loginservice.controller.domain.LoginRequest;
import com.solutions.evergreen.loginservice.controller.domain.LoginResponse;

@Controller
@RequestMapping("/login")
public class LoginController {

	

	@RequestMapping(value = "/signup")
	public @ResponseBody LoginResponse signup(@RequestBody LoginRequest loginRequest) {
		return null;
	}

	@RequestMapping(value = "/authenticate")
	public @ResponseBody LoginResponse authenticate(@RequestBody LoginRequest loginRequest) {
		return null;
	}
}
