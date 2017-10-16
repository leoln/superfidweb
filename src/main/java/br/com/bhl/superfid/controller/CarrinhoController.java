package br.com.bhl.superfid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import br.com.bhl.superfid.model.Carrinho;
import br.com.bhl.superfid.service.ICarrinhoService;

@Controller
@RequestMapping("/carrinho")
public class CarrinhoController {
	
	@Autowired
	ICarrinhoService carrinhoService;
	
	@Autowired
	Gson gson;

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)	
	public void usuarioCadastro( @RequestBody String json) {
		Carrinho carrinho = gson.fromJson(json, Carrinho.class);
		carrinhoService.addCarrinho(carrinho);
	}
	
}
