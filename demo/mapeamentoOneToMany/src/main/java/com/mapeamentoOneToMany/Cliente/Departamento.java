package com.mapeamentoOneToMany.Cliente;

import java.util.*;
import javax.persistence.*;

import com.mapeamentoOneToMany.Funcionario.Funcionario;


@Entity
@Table(name = "departamentos")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "nome")
	private String nome;
	
	public Departamento() {}
	
	public Departamento(String nome) {
		this.nome = nome;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "funcionario", referencedColumnName = "id")
	List <Funcionario> funcionarios = new ArrayList<Funcionario>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	
	
}
