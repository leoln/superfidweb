package br.com.bhl.superfid.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Tb_Item_Carrinho")
@Table(name = "tb_item_carrinho")
public class ItemCarrinho implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "codigoItem")
	private Long codigoItem;

	@Column(name="codigoCarrinho")
	private Long codigoCarrinho;
	
	@Column(name = "codigoProduto")
	private Long codigoProduto;
	
	@Column(name = "quantidade")
    private Double quantidade;

    public ItemCarrinho() { }

	public Long getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(Long codigoItem) {
		this.codigoItem = codigoItem;
	}

	public Long getCodigoCarrinho() {
		return codigoCarrinho;
	}

	public void setCodigoCarrinho(Long codigoCarrinho) {
		this.codigoCarrinho = codigoCarrinho;
	}

	public Long getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(Long codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCarrinho == null) ? 0 : codigoCarrinho.hashCode());
		result = prime * result + ((codigoItem == null) ? 0 : codigoItem.hashCode());
		result = prime * result + ((codigoProduto == null) ? 0 : codigoProduto.hashCode());
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemCarrinho other = (ItemCarrinho) obj;
		if (codigoCarrinho == null) {
			if (other.codigoCarrinho != null)
				return false;
		} else if (!codigoCarrinho.equals(other.codigoCarrinho))
			return false;
		if (codigoItem == null) {
			if (other.codigoItem != null)
				return false;
		} else if (!codigoItem.equals(other.codigoItem))
			return false;
		if (codigoProduto == null) {
			if (other.codigoProduto != null)
				return false;
		} else if (!codigoProduto.equals(other.codigoProduto))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ItemCarrinho [codigoItem=" + codigoItem + ", codigoCarrinho=" + codigoCarrinho + ", codigoProduto="
				+ codigoProduto + ", quantidade=" + quantidade + "]";
	}
	
}
