package br.com.bhl.superfid.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bhl.superfid.model.Usuario;
import br.com.bhl.superfid.repository.UsuarioRepository;

@Service("usuarioService")
public class UsuarioService implements IUsuarioService {

	Logger logService = LoggerFactory.getLogger(UsuarioService.class);

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public void addUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioRepository.save(usuario);

		logService.info("Usuário criado com sucesso! Usuário em detalhe: " + usuario);
	}

	@Override
	public void updateUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioRepository.save(usuario);

		logService.info("Usuário atualizado com sucesso! Usuário em detalhe: " + usuario);
	}

	@Override
	public List<Usuario> listUsuario() {
		// TODO Auto-generated method stub
		List<Usuario> listUsuario = usuarioRepository.findAll();
		
		logService.info("Lista de usuários retornada.");
		return listUsuario;
	}

	@Override
	public Usuario getUsuarioById(long id) {
		// TODO Auto-generated method stub
		Usuario usuario = usuarioRepository.findOne(id);
		
		logService.info("Usuário resgatado! Usuário em detalhe: " + usuario);
		return usuario;
	}

	@Override
	public Usuario getUsuarioByCodigoAtenticacao(String codigoAutenticacao) {
		// TODO Auto-generated method stub
		Usuario usuario = usuarioRepository.findByCodigoAutenticacao(codigoAutenticacao);
		
		logService.info("Usuário resgatado! Usuário em detalhe: " + usuario);
		return usuario;
	}

	@Override
	public void removeUsuario(long id) {
		// TODO Auto-generated method stub
		logService.info("Usuário  a ser deletado:" + usuarioRepository.findOne(id));
		usuarioRepository.delete(id);
	}

}
