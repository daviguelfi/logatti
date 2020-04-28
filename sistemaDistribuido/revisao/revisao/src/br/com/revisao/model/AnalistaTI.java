package br.com.revisao.model;

public class AnalistaTI extends Funcionario {

	private String tecnologia;

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	@Override
	public String toString() {
		return "Id: " + this.getId() + "\nNome: " + this.getNome() + "\nTelefone: " + this.getTelefone()
				+ "\nEndereço: " + this.getEndereco() + "\nNome do pai: " + this.getNomePai() + "\nNome da mãe: "
				+ this.getNomeMae();
	}

	@Override
	public int getQtdCaracteresNome() {
		return 0;
	}

}
