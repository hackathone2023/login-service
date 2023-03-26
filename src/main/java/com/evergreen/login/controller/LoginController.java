package com.evergreen.login.controller;

import com.evergreen.login.dto.SignUpRequest;
import com.evergreen.login.dto.SignUpResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.Random;

@RestController
public class LoginController {


    @CrossOrigin
    @PostMapping(value = "/login/signUp", consumes = MediaType.ALL_VALUE)
    public SignUpResponse signUp() {
//		String name = signUpRequest.getName().substring(0,3);
//		String compName = signUpRequest.getCompName().substring(0,3);

        Random random = new Random();
        int id = random.nextInt(1000);

        SignUpResponse signUpResponse = new SignUpResponse();
        signUpResponse.setSuccess("true");
        signUpResponse.setEvergreenId("test"+id);

        return signUpResponse;
    }

    @PostMapping("/login/authenticate")
    @CrossOrigin
    public SignUpResponse authenticate(@RequestParam("evergreeid") String evergreenId, @RequestParam("pwd") String id){
        SignUpResponse signUpResponse = new SignUpResponse();
        signUpResponse.setSuccess("true");
        signUpResponse.setEvergreenId(evergreenId);
        return signUpResponse;
    }

    @GetMapping("/login/message/v2")
    @CrossOrigin
    public String message(){
        return "Congrats ! your application deployed successfully in Azure Platform. !";
    }

}
