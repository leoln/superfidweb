package br.com.bhl.superfid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import br.com.bhl.superfid.model.Produto;
import br.com.bhl.superfid.service.IProdutoService;

@Controller
@RequestMapping("/produto")
public class ProdutoJsonController {

	@Autowired
	IProdutoService produtoService;
	
	@Autowired
	Gson gson;
	
	@RequestMapping(value = "/parseJson", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String produtoParseJson(String rfid) {
		String produtoJson = "";
		produtoJson = gson.toJson( produtoService.getProdutoByRfid( rfid ) );
		return produtoJson;
	}
	
	@RequestMapping(value = "/parseObject", method = RequestMethod.POST)
	public Produto produtoParseObject(String json) {
		Produto produto;
		produto = gson.fromJson(json, Produto.class);
		return produto;
} 
	
}
