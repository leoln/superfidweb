package br.com.bhl.superfid.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Tb_Item_Carrinho")
@Table(name = "tb_item_carrinho")
public class ItemCarrinho implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoItem;

	@ManyToOne
	@JoinColumn(name = "codigoCarrinho", referencedColumnName = "codigo")
	private Carrinho carrinho;
	
	@OneToOne
	@JoinColumn(name = "codigoProduto", referencedColumnName = "codigo")
    private Produto produto;
	
	@Column(name = "quantidade")
    private double quantidade;

    public ItemCarrinho() { }

	public Long getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(Long codigoItem) {
		this.codigoItem = codigoItem;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "ItemCarrinho [codigoItem=" + codigoItem + ", carrinho=" + carrinho + ", produto=" + produto
				+ ", quantidade=" + quantidade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carrinho == null) ? 0 : carrinho.hashCode());
		result = prime * result + ((codigoItem == null) ? 0 : codigoItem.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		long temp;
		temp = Double.doubleToLongBits(quantidade);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (carrinho == null) {
			if (other.carrinho != null)
				return false;
		} else if (!carrinho.equals(other.carrinho))
			return false;
		if (codigoItem == null) {
			if (other.codigoItem != null)
				return false;
		} else if (!codigoItem.equals(other.codigoItem))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (Double.doubleToLongBits(quantidade) != Double.doubleToLongBits(other.quantidade))
			return false;
		return true;
	}
	
}
