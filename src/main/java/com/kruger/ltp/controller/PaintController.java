package com.kruger.ltp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PaintController {
	
	@Value("${text.properties.index.monaLisa}")
	String monaLisa;
	@Value("${text.properties.index.salvator}")
	String salvator;
	
	@GetMapping({"/index","/","/home"})
	public String index(Model model) {
		model.addAttribute("monalisa", monaLisa);
		model.addAttribute("salvator", salvator);
		return "index";
	}

}
