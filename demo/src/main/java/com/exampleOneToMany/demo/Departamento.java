package com.exampleOneToMany.demo;

import java.util.List;  
  
import javax.persistence.*;  
  
@Entity  
public class Departamento {  
  
    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private int id;  
    private String nome;  
      
    @OneToMany(targetEntity = Funcionario.class)  
    private List<Funcionario> listFuncionarios;

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

	public List<Funcionario> getListFuncionarios() {
		return listFuncionarios;
	}

	public void setlistFuncionarios(List<Funcionario> listFuncionarios) {
		this.listFuncionarios = listFuncionarios;
	}   
      
}  