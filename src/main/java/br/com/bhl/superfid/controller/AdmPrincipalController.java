package br.com.bhl.superfid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bhl.superfid.service.ICompraService;
import br.com.bhl.superfid.service.IProdutoService;

@Controller
@RequestMapping("/admin")
public class AdmPrincipalController {

	@Autowired
	IProdutoService produtoService;
	
	@Autowired
	ICompraService compraService;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("produto", produtoService.listProduto());
		model.addAttribute("compra", compraService.listCompra());
		return "admin/admPrincipal";
	}
	
}