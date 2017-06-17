package org.encuestame;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="org.encuestame.controllers")
public class EncuestameApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncuestameApplication.class, args);
	}
}
