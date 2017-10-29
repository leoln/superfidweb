package br.com.bhl.superfid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import br.com.bhl.superfid.model.Compra;
import br.com.bhl.superfid.service.ICompraService;

@Controller
@RequestMapping("/compra")
public class CompraController {

	@Autowired
	ICompraService compraService;
	
	@Autowired
	Gson gson;

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)	
	public void itemCarrinhoCadastro( @RequestBody String json) {
		Compra compra = gson.fromJson(json, Compra.class);
		compraService.addCompra(compra);
	}
	
}