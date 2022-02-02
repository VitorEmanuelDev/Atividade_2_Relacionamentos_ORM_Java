package com.exampleOneToMany.demo;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("funcionario");  
		EntityManager em = emf.createEntityManager();  

		em.getTransaction().begin();  

		Funcionario func1 = new Funcionario();  
		func1.setId(1);
		func1.setNome("Paulo Gustavo");          

		Funcionario func2 = new Funcionario();  
		func1.setId(2);
		func1.setNome("Thiago Ventura"); 

		em.persist(func1);  
		em.persist(func2);  

		ArrayList<Funcionario> listFuncionarios = new ArrayList<Funcionario>();  
		listFuncionarios.add(func1);  
		listFuncionarios.add(func2);  

		Departamento dep1 = new Departamento();  
		dep1.setId(2);  
		dep1.setNome("RH");
		dep1.setlistFuncionarios(listFuncionarios);

		em.persist(dep1);  

		em.getTransaction().commit();  
		em.close();  
		emf.close();  

	}

}
