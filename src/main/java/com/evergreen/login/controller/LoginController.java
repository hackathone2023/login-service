package com.evergreen.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.evergreen.login.domain.LoginRequest;
import com.evergreen.login.domain.LoginResponse;
import com.evergreen.login.domain.SignUpRequest;
import com.evergreen.login.domain.SignUpResponse;
import com.evergreen.login.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService loginService;

	@CrossOrigin
	@PostMapping(value = "/signup")
	public @ResponseBody SignUpResponse signup(@RequestBody SignUpRequest loginRequest) {
		return loginService.signup(loginRequest);
	}

	@CrossOrigin
	@PostMapping(value = "/authenticate")
	public @ResponseBody LoginResponse authenticate(@RequestBody LoginRequest loginRequest) {
		return loginService.authenticate(loginRequest);
	}
}
