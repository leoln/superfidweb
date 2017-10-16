package br.com.bhl.superfid.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Tb_Usuario")
@Table(name="tb_usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigoSistema")
    private Long codigoSistema;
	
	@Column(name="codigoAutenticacao")
    private String codigoAutenticacao;
    
	@Column(name="nome")
	private String nome;
	
	@Column(name="sobrenome")
    private String sobrenome;
	
	@Column(name="dataNascimento")
    private String dataNascimento;
	
	@Column(name="emailAutenticacao")
    private String emailAutenticacao;
	
	@Column(name="numeroCPF")
    private long numeroCPF;
	
	@Column(name="numeroDDD")
    private int numeroDDD;
	
	@Column(name="numeroTelefone")
    private long numeroTelefone;

    public Usuario() { }

    public Long getCodigoSistema() {
        return codigoSistema;
    }

    public void setCodigoSistema(Long codigoSistema) {
        this.codigoSistema = codigoSistema;
    }

    public String getCodigoAutenticacao() {
        return codigoAutenticacao;
    }

    public void setCodigoAutenticacao(String codigoAutenticacao) {
        this.codigoAutenticacao = codigoAutenticacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public long getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(long numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public int getNumeroDDD() {
        return numeroDDD;
    }

    public void setNumeroDDD(int ddd) {
        this.numeroDDD = ddd;
    }

    public long getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(long telefone) {
        this.numeroTelefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmailAutenticacao() {
        return emailAutenticacao;
    }

    public void setEmailAutenticacao(String emailAutenticacao) {
        this.emailAutenticacao = emailAutenticacao;
    }

    @Override
	public String toString() {
		return "Usuario [codigoSistema=" + codigoSistema + ", codigoAutenticacao=" + codigoAutenticacao + ", nome="
				+ nome + ", sobrenome=" + sobrenome + ", dataNascimento=" + dataNascimento + ", emailAutenticacao="
				+ emailAutenticacao + ", numeroCPF=" + numeroCPF + ", ddd=" + numeroDDD + ", telefone=" + numeroTelefone + "]";
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;

        Usuario usuario = (Usuario) o;

        if (getCodigoSistema() != usuario.getCodigoSistema()) return false;
        if (getNumeroCPF() != usuario.getNumeroCPF()) return false;
        if (getNumeroDDD() != usuario.getNumeroDDD()) return false;
        if (getNumeroTelefone() != usuario.getNumeroTelefone()) return false;
        if (getCodigoAutenticacao() != null ? !getCodigoAutenticacao().equals(usuario.getCodigoAutenticacao()) : usuario.getCodigoAutenticacao() != null)
            return false;
        if (getNome() != null ? !getNome().equals(usuario.getNome()) : usuario.getNome() != null)
            return false;
        if (getSobrenome() != null ? !getSobrenome().equals(usuario.getSobrenome()) : usuario.getSobrenome() != null)
            return false;
        if (getDataNascimento() != null ? !getDataNascimento().equals(usuario.getDataNascimento()) : usuario.getDataNascimento() != null)
            return false;
        return getEmailAutenticacao() != null ? getEmailAutenticacao().equals(usuario.getEmailAutenticacao()) : usuario.getEmailAutenticacao() == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (getCodigoSistema() ^ (getCodigoSistema() >>> 32));
        result = 31 * result + (getCodigoAutenticacao() != null ? getCodigoAutenticacao().hashCode() : 0);
        result = 31 * result + (getNome() != null ? getNome().hashCode() : 0);
        result = 31 * result + (getSobrenome() != null ? getSobrenome().hashCode() : 0);
        result = 31 * result + (getDataNascimento() != null ? getDataNascimento().hashCode() : 0);
        result = 31 * result + (getEmailAutenticacao() != null ? getEmailAutenticacao().hashCode() : 0);
        result = 31 * result + (int) (getNumeroCPF() ^ (getNumeroCPF() >>> 32));
        result = 31 * result + getNumeroDDD();
        result = 31 * result + (int) (getNumeroTelefone() ^ (getNumeroTelefone() >>> 32));
        return result;
    }

}//fim da classe
