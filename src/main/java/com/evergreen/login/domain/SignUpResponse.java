package com.evergreen.login.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class SignUpResponse {

	private boolean success;
	private String evergreenId;
}
