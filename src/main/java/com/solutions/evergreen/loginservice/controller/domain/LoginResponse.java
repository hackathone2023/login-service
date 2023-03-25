package com.solutions.evergreen.loginservice.controller.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class LoginResponse {

	private boolean success;
	private String evergreenId;
}
