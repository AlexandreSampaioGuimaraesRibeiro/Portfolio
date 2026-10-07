package com.example.portfolio.controller;

import java.time.Year;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class PortfolioController {
    @GetMapping("/")
    public String index(Model model) {
        // Troque os textos abaixo pelos seus dados reais
        model.addAttribute("nome", "Alexandre Ribeiro");
        model.addAttribute("primeiroNome", "Alexandre");
        model.addAttribute("iniciais", "AR");
        model.addAttribute("cargo", "Estudante de Engenharia de Software");
        model.addAttribute("status", "Procurando estágio");
 
        model.addAttribute("tituloInicio", "Aprendendo a escrever");
        model.addAttribute("tituloDestaque", "software");
        model.addAttribute("tituloFim", "que resolve problemas.");
        model.addAttribute("descricao",
                "Estudante de Engenharia de Software na PUC Minas, desenvolvendo projetos "
                + "com Java, Spring Boot e PHP. Gosto de transformar ideias em aplicações que funcionam.");
 
        model.addAttribute("local", "Belo Horizonte, Brasil");
        model.addAttribute("experiencia", "Projetos acadêmicos e pessoais");
        model.addAttribute("construindo", "Este portfólio com Spring Boot");
        model.addAttribute("ano", Year.now().getValue());
        model.addAttribute("lema", "Estudar. Praticar. Publicar.");
        return "index";
    }

    @GetMapping ("/sobre")
    public String sobre(Model model) {
        model.addAttribute("title", "sobre");
        return "sobre";
    }

    @GetMapping ("/projetos")
    public String projetos(Model model) {
        model.addAttribute("title", "projetos");
        return "projetos";
    }

    @GetMapping ("/experiencia")
    public String experiencia(Model model) {
        model.addAttribute("title", "experiencia");
        return "experiencia";
    }

    @GetMapping ("/comentarios")
    public String comentarios(Model model) {
        model.addAttribute("title", "comentarios");
        return "comentarios";
    }

    @GetMapping ("/contato")
    public String contato(Model model) {
        model.addAttribute("title", "contato");
        return "contato";
    }

}
