package com.ACTOREP.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import repository.DepartementRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"repository","controller","metier","session"})
@EntityScan(basePackages = {"entities"})
@EnableJpaRepositories(basePackageClasses = DepartementRepository.class)
public class ProjetApplicationMain {

	public static void main(String[] args) {
		SpringApplication.run(ProjetApplicationMain.class, args);
	}
	

}
