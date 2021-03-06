package com.mapeamentoManyToOne.Cliente;

import java.util.*;
import javax.persistence.*;

import com.mapeamentoManyToOne.Pedidos.Pedidos;


@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long clienteId;
	@Column(name = "nome_cliente")
	private String nome;
	
	@OneToMany(mappedBy = "clientes")
	Set <Pedidos> pedidos = new HashSet<Pedidos>();
	
	public Cliente() {}
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	public long getClienteId() {
		return clienteId;
	}

	public void setClienteId(long clienteId) {
		this.clienteId = clienteId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Pedidos> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}
	
}
