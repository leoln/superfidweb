package br.com.bhl.superfid.service;

import java.util.List;

import br.com.bhl.superfid.model.ItemCarrinho;

public interface IItemCarrinhoService {

	public void addItemCarrinho( ItemCarrinho itemCarrinho );
	public void updateItemCarrinho ( ItemCarrinho itemCarrinho );
	public List<ItemCarrinho> listItemCarrinho();
	public ItemCarrinho getItemCarrinhoById(long id);
	public void removeItemCarrinho (long id);
	
}