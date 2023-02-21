package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class application {

	@Value("${value.page}")
    public String name;
    @GetMapping("/")
    public String fun(){
        return "Welcome "+name;
    }
}
