package com.evergreen.login.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {

    private String name;
    private String compName;
    private String buisnessAddr;
    private String buisnessEmail;
    private String pwd;
    private String confirmPwd;



}
