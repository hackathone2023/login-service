package com.evergreen.controller;

import com.evergreen.dto.SignUpRequest;
import com.evergreen.dto.SignUpResponse;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Random;

@RestController
public class LoginController {

    @CrossOrigin
    @PostMapping(value = "/login/signUp")
    public SignUpResponse signUp(@RequestBody SignUpRequest signUpRequest) {
        String name = signUpRequest.getName().substring(0,3);
        String compName = signUpRequest.getCompName().substring(0,3);

        Random random = new Random();
        int id = random.nextInt(1000);

        SignUpResponse signUpResponse = new SignUpResponse();
        signUpResponse.setSuccess("true");
        signUpResponse.setEvergreenId(name+compName+id);

        return signUpResponse;
    }



    @GetMapping("/login/message")
    @CrossOrigin
    public String message(){
        return "Congrats ! your application deployed successfully in Azure Platform. !";
    }

}
