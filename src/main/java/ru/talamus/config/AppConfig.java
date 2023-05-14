package ru.talamus.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${server.port:8080}")
    private int port;

    @Value("${server.host:localhost}")
    private String host;
}