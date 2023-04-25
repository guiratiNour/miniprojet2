package com.nour.demo;

import java.util.Date;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nour.demo.entities.chanson;
import com.nour.demo.services.chansonService;

@SpringBootApplication
public class albumApplication implements CommandLineRunner{
	@Autowired
	chansonService chansonService;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(albumApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		repositoryRestConfiguration.exposeIdsFor(chanson.class);

		
	}

}
