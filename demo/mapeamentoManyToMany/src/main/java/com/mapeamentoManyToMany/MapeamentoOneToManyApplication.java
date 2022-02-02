package com.mapeamentoManyToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mapeamentoManyToMany.Autores.Autores;
import com.mapeamentoManyToMany.Autores.AutoresRepository;
import com.mapeamentoManyToMany.Livros.Livros;
import com.mapeamentoManyToMany.Livros.LivrosRepository;

@SpringBootApplication
public class MapeamentoOneToManyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MapeamentoOneToManyApplication.class, args);
	}

	@Autowired
	private AutoresRepository autoresRepository;
	
	@Autowired
	private LivrosRepository livrosRepository;
	 
	@Override
	public void run(String... args) throws Exception {
		
		Autores autor = new Autores("Martin Fowloer");
		
		Autores autor1 = new Autores("Some Guy");
		
		Livros livro1 = new Livros("Refactoring");
		Livros livro2 = new Livros("RereFactoring legacy systems");
	
		autor.getLivros().add(livro1);
		autor.getLivros().add(livro2);
		
		livro1.getAutores().add(autor);
		livro2.getAutores().add(autor);
		
		livro1.getAutores().add(autor1);
		livro2.getAutores().add(autor1);

		this.autoresRepository.save(autor);
		this.autoresRepository.save(autor1);
	}

}
