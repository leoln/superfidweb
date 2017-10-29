package br.com.bhl.superfid.service;

import java.util.List;

import br.com.bhl.superfid.model.Compra;

public interface ICompraService {

	public void addCompra( Compra compra );
	public void updateCompra( Compra compra );
	public List<Compra> listCompra();
	public Compra getCompraById( long id );
	public void removeCompra( long id );
	
}