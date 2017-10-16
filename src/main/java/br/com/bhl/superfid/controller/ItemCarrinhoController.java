package br.com.bhl.superfid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import br.com.bhl.superfid.model.ItemCarrinho;
import br.com.bhl.superfid.service.IItemCarrinhoService;

@Controller
@RequestMapping("/itemCarrinho")
public class ItemCarrinhoController {
	
	@Autowired
	IItemCarrinhoService itemCarrinhoService;
	
	@Autowired
	Gson gson;

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)	
	public void usuarioCadastro( @RequestBody String json) {
		ItemCarrinho itemCarrinho = gson.fromJson(json, ItemCarrinho.class);
		System.out.println(itemCarrinhoService);
		itemCarrinhoService.addItemCarrinho(itemCarrinho);
	}
	
}
