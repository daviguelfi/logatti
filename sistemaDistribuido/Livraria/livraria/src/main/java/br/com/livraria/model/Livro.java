package br.com.livraria.model;

public class Livro {

	private int isbn;
	private String titulo;
	private String autor;
	private String anoLancamento;
	private int qtdPaginas;
	private String genero;
	
	
	public Livro(int isbn, String titulo, String autor, String anoLancamento, int qtdPaginas, String genero) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.anoLancamento = anoLancamento;
		this.qtdPaginas = qtdPaginas;
		this.genero = genero;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public int getQtdPaginas() {
		return qtdPaginas;
	}
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
		
}
