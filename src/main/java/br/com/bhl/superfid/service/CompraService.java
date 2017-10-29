package br.com.bhl.superfid.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bhl.superfid.model.Compra;
import br.com.bhl.superfid.repository.CompraRepository;

@Service("compraService")
public class CompraService implements ICompraService {

	Logger logService = LoggerFactory.getLogger(CompraService.class);

	@Autowired
	CompraRepository compraRepository;
	
	@Override
	public void addCompra(Compra compra) {
		// TODO Auto-generated method stub
		compraRepository.save(compra);

		logService.info("Compra criada com sucesso! Compra em detalhe: " + compra);
	}

	@Override
	public void updateCompra(Compra compra) {
		// TODO Auto-generated method stub
		compraRepository.save(compra);

		logService.info("Compra atualizado com sucesso! Compra em detalhe: " + compra);		
	}

	@Override
	public List<Compra> listCompra() {
		// TODO Auto-generated method stub
		List<Compra> listaCompra = compraRepository.findAll();
		
		logService.info("Lista de compras retornada.");
		return listaCompra;
	}

	@Override
	public Compra getCompraById(long id) {
		// TODO Auto-generated method stub
		Compra compra = compraRepository.findOne(id);
		
		logService.info("Compra resgatada! Compra em detalhe: " + compra);
		return null;
	}

	@Override
	public void removeCompra(long id) {
		// TODO Auto-generated method stub
		logService.info("Compra  a ser deletado:" + compraRepository.findOne(id));
		compraRepository.delete(id);
	}

}
