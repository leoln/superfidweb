package br.com.bhl.superfid.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bhl.superfid.model.Carrinho;
import br.com.bhl.superfid.repository.CarrinhoRepository;

@Service("carrinhoService")
public class CarrinhoService implements ICarrinhoService {
	
	Logger logService = LoggerFactory.getLogger(CarrinhoService.class);
	
	@Autowired
	CarrinhoRepository carrinhoRepository;

	@Override
	public void addCarrinho(Carrinho carrinho) {
		// TODO Auto-generated method stub
		carrinhoRepository.save(carrinho);
		
		logService.info("Carrinho criado com sucesso! Carrinho em detalhe: " + carrinho);
	}

	@Override
	public void updateCarrinho(Carrinho carrinho) {
		// TODO Auto-generated method stub
		carrinhoRepository.save(carrinho);
		
		logService.info("Carrinho criado com sucesso! Carrinho em detalhe: " + carrinho);
	}

	@Override
	public List<Carrinho> listCarrinho() {
		// TODO Auto-generated method stub
		List<Carrinho> listCarrinho = carrinhoRepository.findAll();
		
		logService.info("Lista de carrinhos retornada.");
		return listCarrinho;
	}

	@Override
	public Carrinho getCarrinhoById(long id) {
		// TODO Auto-generated method stub
		Carrinho carrinho = carrinhoRepository.findOne(id);
		
		logService.info("Carrinho resgatado! Carrinho em detalhe: " + carrinho);
		return carrinho;
	}

	@Override
	public void removeCarrinho(long id) {
		// TODO Auto-generated method stub
		logService.info("Carrinho a ser deletado:" + carrinhoRepository.findOne(id));
		carrinhoRepository.delete(id);
	}
	
}
