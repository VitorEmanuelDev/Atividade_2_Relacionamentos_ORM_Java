package com.mapeamentoOneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mapeamentoOneToMany.Cliente.Departamento;
import com.mapeamentoOneToMany.Cliente.DepartamentoRepository;
import com.mapeamentoOneToMany.Funcionario.Funcionario;

@SpringBootApplication
public class MapeamentoOneToManyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MapeamentoOneToManyApplication.class, args);
	}

	@Autowired
	private DepartamentoRepository departamentoRepository;
	 
	@Override
	public void run(String... args) throws Exception {
		
		Departamento dpFinanceiro = new Departamento("financeiro");
		
		Funcionario funcionario1 = new Funcionario("Paulo Gustavo");
		Funcionario funcionario2 = new Funcionario("Thiago Ventura");
		Funcionario funcionario3 = new Funcionario("Nando Viana");
		
		dpFinanceiro.getFuncionarios().add(funcionario1);
		dpFinanceiro.getFuncionarios().add(funcionario2);
		dpFinanceiro.getFuncionarios().add(funcionario3);
		
		this.departamentoRepository.save(dpFinanceiro);
		
	}

}
