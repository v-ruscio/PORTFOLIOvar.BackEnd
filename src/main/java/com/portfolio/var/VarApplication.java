package com.portfolio.var;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class VarApplication {

	public static void main(String[] args) {
		SpringApplication.run(VarApplication.class, args);
	}

@Bean
public WebMvcConfigurer corsConfigurer(){
    return new WebMvcConfigurer(){
        public void addCorsMappings(CorsRegistry registry){
            registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*").allowedHeaders("*");
        }
    };
}
        
        
        
}
