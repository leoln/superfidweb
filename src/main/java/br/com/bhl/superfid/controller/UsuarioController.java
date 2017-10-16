package br.com.bhl.superfid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import br.com.bhl.superfid.model.Usuario;
import br.com.bhl.superfid.service.IUsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	IUsuarioService usuarioService;
	
	@Autowired
	Gson gson;
	
	@RequestMapping(value = "/parseJson", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String usuarioParseJson(String codigoAutenticacao) {
		String usuarioJson = "";
		usuarioJson = gson.toJson( usuarioService.getUsuarioByCodigoAtenticacao( codigoAutenticacao ) );
		return usuarioJson;
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)	
	public void usuarioCadastro( @RequestBody String json) {
		Usuario usuario = gson.fromJson(json, Usuario.class);
		usuarioService.addUsuario(usuario);
	}
	
}