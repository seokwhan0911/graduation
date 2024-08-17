package org.example.saeteojeon_server.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {

        corsRegistry.addMapping("/**")
                .allowedOrigins("*")
                .exposedHeaders("Set-Cookie")
                .allowedOrigins("http://localhost:8080")
                .allowedOrigins("http://localhost:8081")
                .allowedOrigins("http://3.37.102.94:8080")
                .allowedOrigins("http://3.37.102.94:8081")
                .allowedOrigins("http://localhost:3000");
    }

}

