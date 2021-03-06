package com.mapeamentoManyToOne.Pedidos;


import javax.persistence.*;

import com.mapeamentoManyToOne.Cliente.Cliente;

@Entity
@Table(name = "pedidos")
public class Pedidos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pedidoId;
	private String nome;
	
	@ManyToOne(fetch = FetchType.LAZY,  cascade=CascadeType.ALL)
	@JoinColumn(name= "id_cliente")
	private Cliente cliente;

	public Pedidos() {}

	public Pedidos(String nome) {
		this.nome = nome;
	}
	public long getPedidoId() {
		return pedidoId;
	}
	public void setPedidoId(long id) {
		this.pedidoId = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
