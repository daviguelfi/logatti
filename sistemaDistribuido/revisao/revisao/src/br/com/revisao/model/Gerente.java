package br.com.revisao.model;

public class Gerente extends Funcionario {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public int getQtdCaracteresNome() {
		return this.getNome().length();
	}
}
