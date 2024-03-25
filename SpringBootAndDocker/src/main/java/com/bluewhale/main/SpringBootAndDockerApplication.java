package com.bluewhale.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.bluewhale.content")
public class SpringBootAndDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAndDockerApplication.class, args);
	}

}
