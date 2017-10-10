package br.com.bhl.superfid.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bhl.superfid.model.Produto;
import br.com.bhl.superfid.repository.ProdutoRepository;

@Service("produtoService")
public class ProdutoService implements IProdutoService {
	
	Logger logService = LoggerFactory.getLogger(ProdutoService.class);
	
	@Autowired
	ProdutoRepository produtoRepository;

	@Override
	public void addProduto(Produto produto) {
		// TODO Auto-generated method stub
		produtoRepository.save(produto);
		
		logService.info("Produto criado com sucesso! Produto em detalhe: " + produto);
	}

	@Override
	public void updateProduto(Produto produto) {
		// TODO Auto-generated method stub
		produtoRepository.save(produto);
		
		logService.info("Produto atualizado com sucesso! Produto em detalhe: " + produto);
	}

	@Override
	public List<Produto> listPersons() {
		// TODO Auto-generated method stub
		List<Produto> listProdutos = produtoRepository.findAll();
		
		logService.info("Lista de produtos retornada.");
		return listProdutos;
	}

	@Override
	public Produto getProdutoById(long id) {
		// TODO Auto-generated method stub
		Produto produto = produtoRepository.findOne(id);
		
		logService.info("Produto resgatado! Produto em detalhe: " + produto);
		return produto;
	}

	@Override
	public void removeProduto(long id) {
		// TODO Auto-generated method stub
		logService.info("Produto  a ser deletado:" + produtoRepository.findOne(id));
		produtoRepository.delete(id);
	}

}
