package com.solutions.evergreen.loginservice.controller.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class LoginRequest {

	private String companyName;
	private String businessAddress;
	private String businessEmail;
	private String password;
	private String confirmPassword;
}
