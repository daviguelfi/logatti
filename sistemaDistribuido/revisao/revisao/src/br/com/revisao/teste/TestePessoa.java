package br.com.revisao.teste;

import br.com.revisao.model.AnalistaTI;
import br.com.revisao.model.Endereco;
import br.com.revisao.model.Estado;

public class TestePessoa {

	public static void main(String[] args) {

		AnalistaTI objPessoa = new AnalistaTI();

		objPessoa.setId(1);
		objPessoa.setNome("davi");

		objPessoa.setEndereco(
				new Endereco(1, "centro", "rua 1", "araraquara", "14800125", new Estado(1, "SP", "São Paulo")));

		objPessoa.setTelefone("123456789");
		objPessoa.setNomePai("ana");
		objPessoa.setNomeMae("luiz");
		// funcionario
		objPessoa.setSalario(123);
		// analista
		objPessoa.setTecnologia("JavaScript");

		System.out.println(objPessoa);

		System.out.println("");

		System.out.println("Nome: " + objPessoa.getNome());
	}
}
