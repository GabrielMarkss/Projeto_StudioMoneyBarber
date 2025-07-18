package com.stmoneybarber.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        System.out.println("CORS configurado com padrão");

        registry.addMapping("/**")
                .allowedOriginPatterns("http://localhost:4200") // aqui é a mudança
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600);
    }
}

// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.*;

// @Configuration
// public class CorsConfig implements WebMvcConfigurer {

// @Override
// public void addCorsMappings(CorsRegistry registry) {
// registry.addMapping("/**")
// .allowedOrigins("http://192.168.100.183:4200")
// .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
// .allowedHeaders("*")
// .allowCredentials(true);
// }
// }
