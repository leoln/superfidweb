package br.com.bhl.superfid.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bhl.superfid.model.Carrinho;
import br.com.bhl.superfid.model.ItemCarrinho;
import br.com.bhl.superfid.model.Produto;
import br.com.bhl.superfid.repository.ItemCarrinhoRepository;

@Service("itemCarrinhoService")
public class ItemCarrinhoService implements IItemCarrinhoService{
	
	Logger logService = LoggerFactory.getLogger(ItemCarrinhoService.class);
	
	@Autowired
	ItemCarrinhoRepository itemCarrinhoRepository;

	@Override
	public void addItemCarrinho(ItemCarrinho itemCarrinho) {
		// TODO Auto-generated method stub
		itemCarrinhoRepository.save(itemCarrinho);

		logService.info("Item Carrinho criado com sucesso! Item Carrinho em detalhe: " + itemCarrinho);
	}

	@Override
	public void updateItemCarrinho(ItemCarrinho itemCarrinho) {
		// TODO Auto-generated method stub
		itemCarrinhoRepository.save(itemCarrinho);

		logService.info("Item Carrinho atualizado com sucesso! Item Carrinho em detalhe: " + itemCarrinho);		
	}

	@Override
	public List<ItemCarrinho> listItemCarrinho() {
		// TODO Auto-generated method stub
		List<ItemCarrinho> listItemCarrinho = itemCarrinhoRepository.findAll();
		
		logService.info("Lista de itens carrinho retornada.");
		return listItemCarrinho;
	}

	@Override
	public ItemCarrinho getItemCarrinhoById(long id) {
		// TODO Auto-generated method stub
		ItemCarrinho itemCarrinho = itemCarrinhoRepository.findOne(id);
		
		logService.info("Item Carrinho resgatado! Item Carrinho em detalhe: " + itemCarrinho);
		return itemCarrinho;
	}

	@Override
	public ItemCarrinho getItemCarrinhoByProduto(Produto produto) {
		// TODO Auto-generated method stub
		ItemCarrinho itemCarrinho = itemCarrinhoRepository.findByProduto(produto);
		
		logService.info("Item Carrinho resgatado! Item Carrinho em detalhe: " + itemCarrinho);
		return itemCarrinho;
	}

	@Override
	public ItemCarrinho getItemCarrinhoByCarrinho(Carrinho carrinho) {
		// TODO Auto-generated method stub
		ItemCarrinho itemCarrinho = itemCarrinhoRepository.findByCarrinho(carrinho);
		
		logService.info("Item Carrinho resgatado! Item Carrinho em detalhe: " + itemCarrinho);
		return itemCarrinho;
	}

	@Override
	public void removeItemCarrinho(long id) {
		// TODO Auto-generated method stub
		logService.info("Item Carrinho a ser deletado:" + itemCarrinhoRepository.findOne(id));
		itemCarrinhoRepository.delete(id);
	}

}
