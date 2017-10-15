package br.com.bhl.superfid.service;

import java.util.List;

import br.com.bhl.superfid.model.Usuario;

public interface IUsuarioService {

	public void addUsuario(Usuario usuario);
	public void updateUsuario(Usuario usuario);
	public List<Usuario> listUsuario();
	public Usuario getUsuarioById(long id);
	public Usuario getUsuarioByCodigoAtenticacao(String codigoAutenticacao);
	public void removeUsuario(long id);
	
}
