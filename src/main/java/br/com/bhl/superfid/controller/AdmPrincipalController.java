package br.com.bhl.superfid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdmPrincipalController {

	@GetMapping
	public String index() {
		return "admin/admPrincipal";
	}
	
}