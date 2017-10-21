package br.com.bhl.superfid.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Tb_Carrinho")
@Table(name = "tb_carrinho")
public class Carrinho implements Serializable	{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long codigo;
	
	@Column(name = "dataCriacao")
	private String dataCriacao;

	@OneToMany(mappedBy = "codigoCarrinho", fetch = FetchType.LAZY, targetEntity = ItemCarrinho.class)
	private List<ItemCarrinho> listaCarrinho;
	
	@Column(name = "subtotal")
    private double subtotal;

    public Carrinho() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public List<ItemCarrinho> getListaCarrinho() {
		return listaCarrinho;
	}

	public void setListaCarrinho(List<ItemCarrinho> listaCarrinho) {
		this.listaCarrinho = listaCarrinho;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "Carrinho [codigo=" + codigo + ", listaCarrinho=" + listaCarrinho + ", subtotal=" + subtotal + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((listaCarrinho == null) ? 0 : listaCarrinho.hashCode());
		long temp;
		temp = Double.doubleToLongBits(subtotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object objeto) {
		if (this == objeto)
			return true;
		if (objeto == null)
			return false;
		if (getClass() != objeto.getClass())
			return false;
		Carrinho other = (Carrinho) objeto;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (listaCarrinho == null) {
			if (other.listaCarrinho != null)
				return false;
		} else if (!listaCarrinho.equals(other.listaCarrinho))
			return false;
		if (Double.doubleToLongBits(subtotal) != Double.doubleToLongBits(other.subtotal))
			return false;
		return true;
	}
	
}
