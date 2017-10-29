package br.com.bhl.superfid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bhl.superfid.model.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long>{

	
	
}