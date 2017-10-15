package br.com.bhl.superfid.service;

import java.util.List;

import br.com.bhl.superfid.model.Produto;

public interface IProdutoService {

	public void addProduto(Produto produto);
	public void updateProduto (Produto produto );
	public List<Produto> listProduto();
	public Produto getProdutoById(long id);
	public Produto getProdutoByRfid(String rfid);
	public void removeProduto (long id);
	
}