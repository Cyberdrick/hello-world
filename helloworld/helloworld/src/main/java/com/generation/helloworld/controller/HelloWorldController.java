package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping ("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	
	@GetMapping ("/bsm-list")
	public String bsmList() {
		return "Persistência;\r\n"
				+ "Mentalidade de Crescimento;\r\n"
				+ "Responsabilidade Pessoal;\r\n"
				+ "Orientação ao Futuro;\r\n"
				+ "Proatividade;\r\n"
				+ "Comunicação;\r\n"
				+ "Trabalho em Equipe;\r\n"
				+ "Orientação ao Detalhe;";
	}
	
	@GetMapping ("/target-learn")
	public String targetLearn() {
		return "Meu principal objetivo desta semana é entender"
				+ "as principais ferramentas para construir"
				+ "um banco de dados";
	}
}
