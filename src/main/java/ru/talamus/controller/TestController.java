package ru.talamus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @Value("${server.port}")
    private int serverPort;
    @Value("${server.host}")
    private String serverHost;

    @GetMapping("/test")
    public String test() {
        return "the application is working correct." +
                "\nHost: " +
                serverHost +
                "\nPort: " +
                serverPort;
    }
}
