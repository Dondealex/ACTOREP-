package com.ACTOREP.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
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
