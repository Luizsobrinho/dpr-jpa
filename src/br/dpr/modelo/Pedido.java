package br.dpr.modelo;

import javax.persistence.Id;

public class Pedido {
	@Id
	private Produto produto;
	@Id
	private Venda venda;
	private int quantidade;
	private double subtotal;

	public Pedido() {

	}

	public Pedido(int quantidade, double subtotal) {

		this.quantidade = quantidade;
		this.subtotal = subtotal;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

}
