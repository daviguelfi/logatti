package br.com.revisao.model;

public abstract class Funcionario extends Pessoa {

	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Id: " + this.getId() + "\nNome: " + this.getNome() + "\nTelefone: " + this.getTelefone()
				+ "\nEndereço: " + this.getEndereco() + "\nNome do pai: " + this.getNomePai() + "\nNome da mãe: "
				+ this.getNomeMae();
	}

}
