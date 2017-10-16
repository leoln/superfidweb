package br.com.bhl.superfid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bhl.superfid.model.Carrinho;
import br.com.bhl.superfid.model.ItemCarrinho;
import br.com.bhl.superfid.model.Produto;

@Repository
public interface ItemCarrinhoRepository extends JpaRepository<ItemCarrinho, Long>{

	public ItemCarrinho findByCarrinho( Carrinho carrinho );
	public ItemCarrinho findByProduto( Produto produto );
	
}
