package com.poo.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassesApplication.class, args);

		
		Criadora criadora = new Criadora(null);
		Endereco endereco = new Endereco(null, null, null, null);
		Emprestimo emprestimo = new Emprestimo(null, null);
	}

	

}
