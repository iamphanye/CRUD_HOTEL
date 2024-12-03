package com.example.crud_Hotel.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Permitir CORS en todas las rutas
                .allowedOrigins("*") // Permitir todos los orígenes
                .allowedMethods("GET", "POST", "PATCH", "DELETE", "OPTIONS") // Métodos permitidos
                .allowedHeaders("*"); // Todos los encabezados permitidos
    }
}
