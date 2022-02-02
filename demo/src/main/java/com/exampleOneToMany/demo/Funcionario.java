package com.exampleOneToMany.demo;

import javax.persistence.*;  

@Entity  
public class Funcionario {  
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private int id;  
	private String nome;  

	public Funcionario(int id, String nome) {  
		this.id = id;  
		this.nome = nome;  
	}  

	public Funcionario() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}  


}  