package com.evergreen.login.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {

    private String name;
    private String companyName;
    private String businessAddress;
    private String businessEmail;
    private String password;
    private String confirmPassword;



}
