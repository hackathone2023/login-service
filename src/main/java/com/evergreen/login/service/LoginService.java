package com.evergreen.login.service;

import com.evergreen.login.domain.LoginRequest;
import com.evergreen.login.domain.LoginResponse;
import com.evergreen.login.domain.SignUpRequest;
import com.evergreen.login.domain.SignUpResponse;

public interface LoginService {

	public SignUpResponse signup(SignUpRequest signUpRequest);

	public LoginResponse authenticate(LoginRequest loginRequest);
}
