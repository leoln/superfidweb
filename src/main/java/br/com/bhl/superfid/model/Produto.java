package br.com.bhl.superfid.model;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Produtos")
@Table(name="PRODUTOS")
public class Produto {
	
	@Id
	@Column(name="ID_PRODUTO")
	private long codProduto;
    
	@Column(name="DES_PRODUTO")
	private String descricao;
    
	@Column(name="PRECO_UNIT")
	private double precoUnitario;
    
	@Column(name="DES_MARCA")
	private String marca;
    
	@Column(name="DAT_VALIDADE")
	private String validade;
    
	@Column(name="NUM_LOTE")
	private String lote;
    
	@Column(name="DES_UNIDADE")
	private String unidades;
    
	@Column(name="IMG_URL")
	private String urlImagem;
    
    public Produto() { }
    
    public Produto(long codProduto, String descricao, String marca, double precoUnitario, String validade, String lote, String unidades, String urlImagem) {
        this.codProduto = codProduto;
    	this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.marca = marca;
        this.validade = validade;
        this.lote = lote;
        this.unidades = unidades;
        this.urlImagem= urlImagem;
    }

    public Produto(String descricao, String marca, double precoUnitario, String validade, String lote, String unidades, String urlImagem) {
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.marca = marca;
        this.validade = validade;
        this.lote = lote;
        this.unidades = unidades;
        this.urlImagem= urlImagem;
    }

    public long getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(long codProduto) {
		this.codProduto = codProduto;
	}

	public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
    	DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        String dataValidade = dataFormatada.format(validade);
    	this.validade = dataValidade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(long lote) {
        String numLote = "" + lote;
    	this.lote = numLote;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	@Override
	public String toString() {
		return "Produto [codProduto=" + codProduto + ", descricao=" + descricao + ", precoUnitario=" + precoUnitario
				+ ", marca=" + marca + ", validade=" + validade + ", lote=" + lote + ", unidades=" + unidades
				+ ", urlImagem=" + urlImagem + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codProduto ^ (codProduto >>> 32));
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precoUnitario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((unidades == null) ? 0 : unidades.hashCode());
		result = prime * result + ((urlImagem == null) ? 0 : urlImagem.hashCode());
		result = prime * result + ((validade == null) ? 0 : validade.hashCode());
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
		if (codProduto != other.codProduto)
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (Double.doubleToLongBits(precoUnitario) != Double.doubleToLongBits(other.precoUnitario))
			return false;
		if (unidades == null) {
			if (other.unidades != null)
				return false;
		} else if (!unidades.equals(other.unidades))
			return false;
		if (urlImagem == null) {
			if (other.urlImagem != null)
				return false;
		} else if (!urlImagem.equals(other.urlImagem))
			return false;
		if (validade == null) {
			if (other.validade != null)
				return false;
		} else if (!validade.equals(other.validade))
			return false;
		return true;
	}

}
