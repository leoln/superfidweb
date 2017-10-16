package br.com.bhl.superfid.service;

import java.util.List;

import br.com.bhl.superfid.model.Carrinho;
import br.com.bhl.superfid.model.ItemCarrinho;
import br.com.bhl.superfid.model.Produto;

public interface IItemCarrinhoService {

	public void addItemCarrinho( ItemCarrinho itemCarrinho );
	public void updateItemCarrinho ( ItemCarrinho itemCarrinho );
	public List<ItemCarrinho> listItemCarrinho();
	public ItemCarrinho getItemCarrinhoById(long id);
	public ItemCarrinho getItemCarrinhoByProduto( Produto produto );
	public ItemCarrinho getItemCarrinhoByCarrinho( Carrinho carrinho );
	public void removeItemCarrinho (long id);
	
}