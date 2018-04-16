package com.zj.actuatorserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class ActuatorServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorServerApplication.class, args);
	}
}
