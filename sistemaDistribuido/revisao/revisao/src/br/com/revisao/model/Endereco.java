package br.com.revisao.model;

public class Endereco {

	private int id;
	private String bairro;
	private String logradouro;
	private String cidade;
	private String cep;
	private Estado estado;
	
	public Endereco(int id, String bairro, String logradouro, String cidade, String cep, Estado estado) {
		this.id = id;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.cep = cep;
		this.estado = estado;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Estado getUf() {
		return estado;
	}
	
	public void setUf(Estado estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "{ Id: " + this.id +
				", Bairro: " + this.bairro+
				", Logradouro: " + this.logradouro+
				", Cidade: " + this.cidade +
				", CEP: " + this.cep +
				", Estado: " + this.estado + "}";
	}
	
}

