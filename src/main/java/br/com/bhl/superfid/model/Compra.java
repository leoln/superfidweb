package br.com.bhl.superfid.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Tb_Compra")
@Table(name = "tb_compra")
public class Compra implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codigo")
	private Long codigo;
	
	@Column(name = "codigoCarrinho")
	private Long codigoCarrinho;
	
	@Column(name = "codigoUsuario")
	private Long codigoUsuario;
	
	@Column(name = "dataInicio")
	private String dataInicio;
	
	@Column(name = "dataTermino")
	private String dataTermino;
	
	@Column(name = "precoTotal")
	private Double precoTotal;
	
	@Column(name = "indicadorFinalizado")
	private String indicadorFinalizado;
	
	@Column(name = "indicadorPagamento")
	private String indicadorPagamento;
	
	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Long getCodigoCarrinho() {
		return codigoCarrinho;
	}
	public void setCodigoCarrinho(Long codigoCarrinho) {
		this.codigoCarrinho = codigoCarrinho;
	}
	public Long getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(Long codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
	public Double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}
	public String getIndicadorFinalizado() {
		return indicadorFinalizado;
	}
	public void setIndicadorFinalizado(String indicadorFinalizado) {
		this.indicadorFinalizado = indicadorFinalizado;
	}

	public String getIndicadorPagamento() {
		return indicadorPagamento;
	}

	public void setIndicadorPagamento(String indicadorPagamento) {
		this.indicadorPagamento = indicadorPagamento;
	}

	@Override
	public String toString() {
		return "Compra [codigo=" + codigo + ", codigoCarrinho=" + codigoCarrinho + ", codigoUsuario=" + codigoUsuario
				+ ", dataInicio=" + dataInicio + ", dataTermino=" + dataTermino + ", precoTotal=" + precoTotal
				+ ", indicadorFinalizado=" + indicadorFinalizado + ", indicadorPagamento=" + indicadorPagamento + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((codigoCarrinho == null) ? 0 : codigoCarrinho.hashCode());
		result = prime * result + ((codigoUsuario == null) ? 0 : codigoUsuario.hashCode());
		result = prime * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
		result = prime * result + ((dataTermino == null) ? 0 : dataTermino.hashCode());
		result = prime * result + ((indicadorFinalizado == null) ? 0 : indicadorFinalizado.hashCode());
		result = prime * result + ((indicadorPagamento == null) ? 0 : indicadorPagamento.hashCode());
		result = prime * result + ((precoTotal == null) ? 0 : precoTotal.hashCode());
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
		Compra other = (Compra) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (codigoCarrinho == null) {
			if (other.codigoCarrinho != null)
				return false;
		} else if (!codigoCarrinho.equals(other.codigoCarrinho))
			return false;
		if (codigoUsuario == null) {
			if (other.codigoUsuario != null)
				return false;
		} else if (!codigoUsuario.equals(other.codigoUsuario))
			return false;
		if (dataInicio == null) {
			if (other.dataInicio != null)
				return false;
		} else if (!dataInicio.equals(other.dataInicio))
			return false;
		if (dataTermino == null) {
			if (other.dataTermino != null)
				return false;
		} else if (!dataTermino.equals(other.dataTermino))
			return false;
		if (indicadorFinalizado == null) {
			if (other.indicadorFinalizado != null)
				return false;
		} else if (!indicadorFinalizado.equals(other.indicadorFinalizado))
			return false;
		if (indicadorPagamento == null) {
			if (other.indicadorPagamento != null)
				return false;
		} else if (!indicadorPagamento.equals(other.indicadorPagamento))
			return false;
		if (precoTotal == null) {
			if (other.precoTotal != null)
				return false;
		} else if (!precoTotal.equals(other.precoTotal))
			return false;
		return true;
	}
	
}