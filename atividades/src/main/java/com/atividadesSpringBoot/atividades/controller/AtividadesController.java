package com.atividadesSpringBoot.atividades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AtividadesController {
	
	@GetMapping("/atividade1")
	public String atividade1() {
		return "<h1>As Habilidades e Mentalidades usadas nessa atividade foram :</h1>"
				+ " <h2>Atenção aos Detalhes e Persistência.</h2>";
	}
	@GetMapping("/atividade2")
	public String atividade2() {
		return "<h1>Os objetivos de aprendizagem para essa semana são:</h1>"
				+ "<ul>"
				+ "<li><b>CONTEÚDO</b>: O QUE É SOFEA</li>"
				+ "<li><b>CONTEÚDO</b>: Vantagens de uma Arquitetura SOFEA</li>"
				+ "<li><b>PRÁTICA</b>: CONSUMO DE UMA API REST</li>"
				+ "<li><b>ENCERRAMENTO</b></li>"
				+ "</ul>";
	}
}
