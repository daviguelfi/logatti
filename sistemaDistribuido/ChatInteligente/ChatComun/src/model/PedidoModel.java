package model;

import java.util.Date;

public class PedidoModel {
	
	private int numeroPedido;
	private String descricao;
	private String dataCompra;
	private String status;
	private String notaFiscal;
	private ProdutoModel produto;
	
	public PedidoModel(int numeroPedido, String descricao, String dataCompra, String status, String notaFiscal, ProdutoModel produto ) {
		this.numeroPedido = numeroPedido;
		this.descricao = descricao;
		this.dataCompra = dataCompra;
		this.status = status;
		this.notaFiscal = notaFiscal;
		this.produto = produto;
	}
	
	public PedidoModel(int i, String string, Date date, String string2, ProdutoModel produto2) {
		// TODO Auto-generated constructor stub
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public ProdutoModel getProduto() {
		return produto;
	}
	public void setProduto(ProdutoModel produto) {
		this.produto = produto;
	}

	public Object buscar(PedidoModel pedido) {
		// TODO Auto-generated method stub
		return null;
	}

}
