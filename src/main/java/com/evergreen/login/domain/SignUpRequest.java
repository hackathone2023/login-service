package com.evergreen.login.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class SignUpRequest {

	private String name;
	private String companyName;
	private String businessAddress;
	private String businessEmail;
	private String password;
	private String confirmPassword;
}
