package com.ACTOREP.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import repository.CentreDaoVille;

@SpringBootApplication
@ComponentScan (basePackages = {"repository"})
@EntityScan (basePackages = {"entities"})
public class ProjetApplicationMain {

	public static void main(String[] args) {
		SpringApplication.run(ProjetApplicationMain.class, args);
	}
	

	
	

}
