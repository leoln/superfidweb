package br.com.bhl.superfid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bhl.superfid.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Usuario findByCodigoAutenticacao(String codigoAutenticacao);
	
}
