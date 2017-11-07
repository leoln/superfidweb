package br.com.bhl.superfid.service;

import java.util.List;

import br.com.bhl.superfid.model.Pagamento;

public interface IPagamentoService {

	public void addPagamento(Pagamento pagamento);
	public void updatePagamento(Pagamento pagamento );
	public List<Pagamento> listPagamento();
	public Pagamento getPagamentoById(String id);
	public Pagamento getProdutoByCodigoUsuario(String codigoUsuario);
	public void removePagamento(String id);
	
}