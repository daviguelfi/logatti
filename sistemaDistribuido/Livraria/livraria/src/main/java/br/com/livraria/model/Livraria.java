package br.com.livraria.model;

public class Livraria {

	private int id;
	private Livro livro;
	
	public Livraria(int id, Livro livro) {
		this.id = id;
		this.livro = livro;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	
	
}
