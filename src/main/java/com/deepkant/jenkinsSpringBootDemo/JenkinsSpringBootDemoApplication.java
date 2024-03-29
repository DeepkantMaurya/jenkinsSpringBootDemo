package com.deepkant.jenkinsSpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
@SpringBootApplication
public class JenkinsSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsSpringBootDemoApplication.class, args);
	}

}
