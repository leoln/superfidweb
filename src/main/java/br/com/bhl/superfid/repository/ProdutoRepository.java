package br.com.bhl.superfid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bhl.superfid.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public Produto findByDescricao(String descricao);
	public Produto findByCodigoRfid(String codigoRfid);
	
}