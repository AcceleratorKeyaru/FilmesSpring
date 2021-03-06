package com.sith.filmesOnlineSith;

import com.sith.filmesOnlineSith.model.User;
import com.sith.filmesOnlineSith.model.Filme;
import com.sith.filmesOnlineSith.repository.UserRepository;
import com.sith.filmesOnlineSith.repository.FilmeRepository;
import com.sith.filmesOnlineSith.service.UserService;
import com.sith.filmesOnlineSith.service.serviceImpl.UserServiceImpl;
import com.sith.filmesOnlineSith.service.FilmeService;
import com.sith.filmesOnlineSith.service.serviceImpl.FilmeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FilmesOnlineSithApplication {

	public static void main(String[] args) {

		SpringApplication.run(FilmesOnlineSithApplication.class, args);
	}

}
