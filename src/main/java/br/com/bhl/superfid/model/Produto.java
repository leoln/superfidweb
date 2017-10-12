package br.com.bhl.superfid.model;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Tb_Produto")
@Table(name="tb_produto")
public class Produto {
	
	@Id
	@Column(name="codigo")
	private long codigo;
    
	@Column(name="codigoRfid")
	private String codigoRfid;
	
	@Column(name="descricao")
	private String descricao;
    
	@Column(name="marca")
	private String marca;

	@Column(name="precoUnitario")
	private double precoUnitario;
    
	@Column(name="dataValidade")
	private String dataValidade;
    
	@Column(name="codigoLote")
	private String codigoLote;
    
	@Column(name="unidade")
	private String unidade;
    
	@Column(name="urlImagem")
	private String urlImagem;
    
    public Produto() { }

    public long getCodigo() {
		return codigo;
	}
    
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getCodigoRfid() {
		return codigoRfid;
	}

	public void setCodigoRfid(String codigoRfid) {
		this.codigoRfid = codigoRfid;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		this.dataValidade = dataFormatada.format(dataValidade);
	}

	public String getCodigoLote() {
		return codigoLote;
	}

	public void setCodigoLote(String codigoLote) {
		this.codigoLote = codigoLote;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", codigoRfid=" + codigoRfid + ", descricao=" + descricao + ", marca="
				+ marca + ", precoUnitario=" + precoUnitario + ", dataValidade=" + dataValidade + ", codigoLote="
				+ codigoLote + ", unidade=" + unidade + ", urlImagem=" + urlImagem + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
		result = prime * result + ((codigoLote == null) ? 0 : codigoLote.hashCode());
		result = prime * result + ((codigoRfid == null) ? 0 : codigoRfid.hashCode());
		result = prime * result + ((dataValidade == null) ? 0 : dataValidade.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precoUnitario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((unidade == null) ? 0 : unidade.hashCode());
		result = prime * result + ((urlImagem == null) ? 0 : urlImagem.hashCode());
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
		Produto other = (Produto) obj;
		if (codigo != other.codigo)
			return false;
		if (codigoLote == null) {
			if (other.codigoLote != null)
				return false;
		} else if (!codigoLote.equals(other.codigoLote))
			return false;
		if (codigoRfid == null) {
			if (other.codigoRfid != null)
				return false;
		} else if (!codigoRfid.equals(other.codigoRfid))
			return false;
		if (dataValidade == null) {
			if (other.dataValidade != null)
				return false;
		} else if (!dataValidade.equals(other.dataValidade))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (Double.doubleToLongBits(precoUnitario) != Double.doubleToLongBits(other.precoUnitario))
			return false;
		if (unidade == null) {
			if (other.unidade != null)
				return false;
		} else if (!unidade.equals(other.unidade))
			return false;
		if (urlImagem == null) {
			if (other.urlImagem != null)
				return false;
		} else if (!urlImagem.equals(other.urlImagem))
			return false;
		return true;
	}

	

}
