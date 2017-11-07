package br.com.bhl.superfid.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bhl.superfid.model.Pagamento;
import br.com.bhl.superfid.repository.PagamentoRepository;

@Service("pagamentoService")
public class PagamentoService implements IPagamentoService{

	Logger logService = LoggerFactory.getLogger(PagamentoService.class);

	@Autowired
	PagamentoRepository pagamentoRepository;
	
	@Override
	public void addPagamento(Pagamento pagamento) {
		// TODO Auto-generated method stub
		pagamentoRepository.save(pagamento);

		logService.info("Pagamento criado com sucesso! Pagamento em detalhe: " + pagamento);
	}

	@Override
	public void updatePagamento(Pagamento pagamento) {
		// TODO Auto-generated method stub
		pagamentoRepository.save(pagamento);

		logService.info("Pagamento atualizado com sucesso! Pagamento em detalhe: " + pagamento);		
	}

	@Override
	public List<Pagamento> listPagamento() {
		// TODO Auto-generated method stub
		List<Pagamento> listPagamento = pagamentoRepository.findAll();
		
		logService.info("Lista de pagamentos retornada.");
		return listPagamento;
	}

	@Override
	public Pagamento getPagamentoById(String id) {
		// TODO Auto-generated method stub
		Pagamento pagamento = pagamentoRepository.findOne(id);

		logService.info("Pagamento resgatado! Pagamento em detalhe: " + pagamento);
		return pagamento;
	}

	@Override
	public Pagamento getProdutoByCodigoUsuario(String codigoUsuario) {
		// TODO Auto-generated method stub
		Pagamento pagamento = pagamentoRepository.findByCodigoUsuario(codigoUsuario);
		
		logService.info("Pagamento resgatado! Pagamento em detalhe: " + pagamento);
		return pagamento;
	}

	@Override
	public void removePagamento(String id) {
		// TODO Auto-generated method stub
		logService.info("Produto  a ser deletado:" + pagamentoRepository.findOne(id));
		pagamentoRepository.delete(id);
	}

}
