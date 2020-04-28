package br.com.revisao.model;

public abstract class Pessoa implements IPessoa {

	private int id;
	private String nome;
	private String telefone;
	private Endereco endereco;
	private String nomePai;
	private String nomeMae;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	@Override
	public String toString() {
		return "Id: " + this.getId() + "\nNome: " + this.getNome() + "\nTelefone: " + this.getTelefone()
				+ "\nEndereço: " + this.getEndereco() + "\nNome do pai: " + this.getNomePai() + "\nNome da mãe: "
				+ this.getNomeMae();
	}

}
