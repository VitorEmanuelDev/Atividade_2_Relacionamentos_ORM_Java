package com.mapeamentoManyToMany.Autores;

import java.util.*;
import javax.persistence.*;

import com.mapeamentoManyToMany.Livros.Livros;


@Entity
@Table(name = "autores")
public class Autores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	@Column(name = "nome_autores")
	private String nome;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "autores_livros", 
		joinColumns = {@JoinColumn(name = "autores_id")},
		inverseJoinColumns = {@JoinColumn(name = "livros_id")})
	Set <Livros> livros = new HashSet<Livros>();
	
	public Autores() {}
	
	public Autores(String nome) {
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

	public Set<Livros> getLivros() {
		return livros;
	}

	public void setLivros(Set<Livros> livros) {
		this.livros = livros;
	}


	
}
