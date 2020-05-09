package comum;

import java.io.Serializable;

public class Pessoa implements Serializable{

	private int id;
	private String nome;
	private String telefone;
	private int idade;
	private String endereco;
	private String estado;
	private double salario;
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

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
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
		return "Id: " + this.getId() + "\nNome: " + this.getNome() + "\nTelefone: " + this.getTelefone() + "\nIdade: "
				+ this.getIdade() + "\nEndereço: " + this.getEndereco() + "\nEstado: " + this.getEstado()
				+ "\nSalário: " + this.getSalario() + "\nNome do Pai" + this.getNomePai() + "\nNome da Mãe"
				+ this.getNomeMae();
	}

}
