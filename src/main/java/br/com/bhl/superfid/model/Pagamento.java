package br.com.bhl.superfid.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Tb_Pagamento")
@Table(name = "tb_pagamento")
public class Pagamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codigoPagamento")
	private String codigoPagamento;
	
	@Column(name = "codigoUsuario")
	private String codigoUsuario;
	
	@Column(name = "limiteCartao")
	private String limiteCartao;
	
	private CartaoCredito cartao;
    private Compra compra;

    public String getCodigoPagamento() {
		return codigoPagamento;
	}

	public void setCodigoPagamento(String codigoPagamento) {
		this.codigoPagamento = codigoPagamento;
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getLimiteCartao() {
		return limiteCartao;
	}

	public void setLimiteCartao(String limiteCartao) {
		this.limiteCartao = limiteCartao;
	}

    public CartaoCredito getCartao() {
        return cartao;
    }

	public void setCartao(CartaoCredito cartao) {
        this.cartao = cartao;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

	@Override
	public String toString() {
		return "Pagamento [codigoPagamento=" + codigoPagamento + ", codigoUsuario=" + codigoUsuario + ", limiteCartao="
				+ limiteCartao + ", cartao=" + cartao + ", compra=" + compra + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cartao == null) ? 0 : cartao.hashCode());
		result = prime * result + ((codigoPagamento == null) ? 0 : codigoPagamento.hashCode());
		result = prime * result + ((codigoUsuario == null) ? 0 : codigoUsuario.hashCode());
		result = prime * result + ((compra == null) ? 0 : compra.hashCode());
		result = prime * result + ((limiteCartao == null) ? 0 : limiteCartao.hashCode());
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
		Pagamento other = (Pagamento) obj;
		if (cartao == null) {
			if (other.cartao != null)
				return false;
		} else if (!cartao.equals(other.cartao))
			return false;
		if (codigoPagamento == null) {
			if (other.codigoPagamento != null)
				return false;
		} else if (!codigoPagamento.equals(other.codigoPagamento))
			return false;
		if (codigoUsuario == null) {
			if (other.codigoUsuario != null)
				return false;
		} else if (!codigoUsuario.equals(other.codigoUsuario))
			return false;
		if (compra == null) {
			if (other.compra != null)
				return false;
		} else if (!compra.equals(other.compra))
			return false;
		if (limiteCartao == null) {
			if (other.limiteCartao != null)
				return false;
		} else if (!limiteCartao.equals(other.limiteCartao))
			return false;
		return true;
	}
    
}
