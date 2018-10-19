package com.docker.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.docker.example.login.Login;
import com.docker.example.login.LoginDao;

@SpringBootApplication
public class DockerBacktEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerBacktEndApplication.class, args);
		//Login login = new Login("Rafa", "12345");
		//System.out.println("respuesta: " + LoginDao.crearLogin(login));
	}
}
