package com.maria.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo", "OpenWebinars");
		model.addAttribute("saludo", "Bienvenidos a nuestra web");
		return "index";
	}
	
	@GetMapping("/que")
	public String que(Model model) {
		model.addAttribute("titulo", "OpenWebinars");
		model.addAttribute("texto", "Somos una empresa dedicada a la formación IT."
				+ " Descubre la plataforma de eLearning tecnológico líder en el mercado hispanohablante.");
		return "que";
	}
	
	@GetMapping("/contacto")
	public String contacto(Model model) {
		model.addAttribute("titulo", "OpenWebinars");
		model.addAttribute("texto", "Email: contacto@openwebinars.net");
		model.addAttribute("pie", "© 2018 - 2020 OpenWebinars S.L. todos los derechos reservados");
		return "contacto";
	}
}
