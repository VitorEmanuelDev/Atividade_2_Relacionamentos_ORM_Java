package com.mapeamentoManyToMany.Livros;

import java.util.HashSet;
import java.util.Set;
import com.mapeamentoManyToMany.Autores.Autores;
import javax.persistence.*;

@Entity
@Table(name = "livros")
public class Livros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "nome_livros")
	private String nome;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "livros")
	Set<Autores> autores = new HashSet<>();
		
	public Livros() {}
	
	public Livros(String nome) {
		this.nome = nome;
	}
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

	public Set<Autores> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autores> autores) {
		this.autores = autores;
	}
	
}
