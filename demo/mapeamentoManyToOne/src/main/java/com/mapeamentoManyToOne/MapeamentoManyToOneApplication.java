package com.mapeamentoManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mapeamentoManyToOne.Cliente.Cliente;
import com.mapeamentoManyToOne.Cliente.ClienteRepository;
import com.mapeamentoManyToOne.Pedidos.Pedidos;

@SpringBootApplication
public class MapeamentoManyToOneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MapeamentoManyToOneApplication.class, args);
	}

	@Autowired
	private ClienteRepository clienteRepository;
	 
	@Override
	public void run(String... args) throws Exception {
		
		Cliente cliente = new Cliente("Jonatas Dias");
		
		Pedidos pedido1 = new Pedidos("Pipoca");
		Pedidos pedido2 = new Pedidos("Hamburguer");
		Pedidos pedido3 = new Pedidos("Salada");
		
		cliente.getPedidos().add(pedido1);
		cliente.getPedidos().add(pedido2);
		cliente.getPedidos().add(pedido3);
		
		this.clienteRepository.save(cliente);
		
	}

}
