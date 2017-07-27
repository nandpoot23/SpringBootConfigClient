package com.example.spring.boot.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${greeting}")
    String greeting;

    @RequestMapping(value = "/", produces = "application/json")
    public List<String> index() {
        List<String> env = Arrays.asList("message.greeting is: " + greeting, "server.port is: " + "9000",
                "configuration.projectName is: " + "demo");
        return env;
    }
}
