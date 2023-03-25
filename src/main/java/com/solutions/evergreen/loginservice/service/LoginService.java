package com.solutions.evergreen.loginservice.service;

import com.solutions.evergreen.loginservice.domain.LoginRequest;
import com.solutions.evergreen.loginservice.domain.LoginResponse;

public interface LoginService {

	public LoginResponse signup(LoginRequest loginRequest);

	public LoginResponse authenticate(LoginRequest loginRequest);
}
