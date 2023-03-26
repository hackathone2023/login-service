package com.evergreen.login.service.impl;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.evergreen.login.domain.LoginRequest;
import com.evergreen.login.domain.LoginResponse;
import com.evergreen.login.domain.SignUpRequest;
import com.evergreen.login.domain.SignUpResponse;
import com.evergreen.login.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public SignUpResponse signup(SignUpRequest signUpRequest) {
		SignUpResponse signUpResponse = new SignUpResponse();
		signUpResponse.setSuccess(Boolean.TRUE);
		Random random = new Random();
		int id = random.nextInt(1000);
		signUpResponse.setEvergreenId("test" + id);
		return signUpResponse;
	}

	@Override
	public LoginResponse authenticate(LoginRequest loginRequest) {
		LoginResponse loginResponse = new LoginResponse();
		loginResponse.setSuccess(Boolean.TRUE);
		loginResponse.setEvergreenId(loginRequest.getEvergreenId());
		return loginResponse;
	}

}
