package com.example.SpringOAuth2GoogleGithub;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String Greet(){
        return "Hello World";
    }
}
