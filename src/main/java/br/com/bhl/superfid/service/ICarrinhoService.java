package br.com.bhl.superfid.service;

import java.util.List;

import br.com.bhl.superfid.model.Carrinho;

public interface ICarrinhoService {

	public void addCarrinho(Carrinho carrinho);
	public void updateCarrinho(Carrinho carrinho);
	public List<Carrinho> listCarrinho();
	public Carrinho getCarrinhoById(long id);
	public void removeCarrinho(long id);
	
}