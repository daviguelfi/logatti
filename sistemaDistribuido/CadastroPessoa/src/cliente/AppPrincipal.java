package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import comum.IServicoRemoto;
import comum.Pessoa;

public class AppPrincipal {
	public static void main(String[] args) {
		try {
			IServicoRemoto objPessoa = (IServicoRemoto) Naming.lookup("rmi://localhost:8282/pessoa");

			Pessoa pe = new Pessoa();

			pe.setId(1);
			pe.setNome("davi");
			pe.setIdade(20);
			pe.setEndereco("araraquara");
			pe.setEstado("sp");
			pe.setSalario(100);
			pe.setNomeMae("davi1");
			pe.setNomePai("davi2");

			Pessoa pe1 = new Pessoa();

			pe1.setId(2);
			pe1.setNome("jao");
			pe1.setIdade(25);
			pe1.setEndereco("araraquara");
			pe1.setEstado("sp");
			pe1.setSalario(100);
			pe1.setNomeMae("davi1");
			pe1.setNomePai("davi2");

			Pessoa pe2 = new Pessoa();

			pe2.setId(2);
			pe2.setNome("ze");
			pe2.setIdade(40);
			pe2.setEndereco("araraquara");
			pe2.setEstado("sp");
			pe2.setSalario(100);
			pe2.setNomeMae("davi1");
			pe2.setNomePai("davi2");
			
			// inserir
			objPessoa.inserir(pe);
			objPessoa.inserir(pe1);
			objPessoa.inserir(pe2);

			// listar
			for (Pessoa pessoa : objPessoa.listarPessoa()) {
				System.out.println("ID: " + pessoa.getId());
				System.out.println("Nome: " + pessoa.getNome());
				System.out.println("Idade: " + pessoa.getIdade());
				System.out.println("Endereço: " + pessoa.getEndereco());
				System.out.println("Estado: " + pessoa.getEstado());
				System.out.println("Salario: " + pessoa.getSalario());
				System.out.println("Nome da Mãe: " + pessoa.getNomeMae());
				System.out.println("Nome do Pai: " + pessoa.getNomePai());

				if (pessoa.getIdade() >= 20) {
					System.out.println("Salario: " + pessoa.getSalario());
					System.out.println("aumento de 10%");
					var salario = pessoa.getSalario() * 0.10;
					var salarioNovo = pessoa.getSalario() + salario;
					System.out.println(salarioNovo);
				}

				if (pessoa.getIdade() >= 21 || pessoa.getIdade() <= 30) {
					System.out.println("Salario: " + pessoa.getSalario());
					System.out.println("aumento de 15%");
					var salario = pessoa.getSalario() * 0.15;
					var salarioNovo = pessoa.getSalario() + salario;
					System.out.println(salarioNovo);
				}
				if (pessoa.getIdade() >= 31) {
					System.out.println("Salario: " + pessoa.getSalario());
					System.out.println("aumento de 20%");
					var salario = pessoa.getSalario() * 0.20;
					var salarioNovo = pessoa.getSalario() + salario;
					System.out.println(salarioNovo);
				}
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
