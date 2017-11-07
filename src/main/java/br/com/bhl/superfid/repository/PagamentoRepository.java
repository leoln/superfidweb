package br.com.bhl.superfid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bhl.superfid.model.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, String>{

	public Pagamento findByCodigoUsuario(String codigoUsuario);
	
}
