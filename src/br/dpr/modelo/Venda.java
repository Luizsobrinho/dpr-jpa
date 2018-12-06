package br.dpr.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendas")
public class Venda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_venda")
	private int id_venda;
	private double desconto;
	private double total;
	private int situacao;
	private Cliente cliente;

	public Venda() {

	}

	public Venda(double desconto, double total, int situacao) {
		this.desconto = desconto;
		this.total = total;
		this.situacao = situacao;
		this.cliente.getId();
	}

	public int getId_venda() {
		return id_venda;
	}

	public void setId_venda(int id_venda) {
		this.id_venda = id_venda;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Venda [id_venda=" + id_venda + ", desconto=" + desconto + ", total=" + total + ", situacao=" + situacao
				+ ", cliente=" + cliente.getId() + "]";
	}

}
