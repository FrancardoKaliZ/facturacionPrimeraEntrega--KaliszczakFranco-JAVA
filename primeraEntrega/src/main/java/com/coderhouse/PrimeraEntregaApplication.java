package com.coderhouse;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Cliente;
import com.coderhouse.models.Local;
import com.coderhouse.models.Producto;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeraEntregaApplication implements CommandLineRunner {
	
	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(PrimeraEntregaApplication.class, args);
	}
	
	//@Override
	public void run(String... arg) throws Exception{
		try {
		Cliente cliente1 = new Cliente("Pablo", "24588727");
		Cliente cliente2 = new Cliente("Marisa", "24269144");
		Producto producto1 = new Producto("ColaLight",20);
		Producto producto2 = new Producto("prePizza",55.5);
		Local local1 = new Local("CocaCola", "Avenida Rivadavia", 700);
		Local local2 = new Local("Disco", "Avenida Rivadavia", 3400);
		
		dao.crearLocal(local1);
		dao.crearLocal(local2);
		dao.crearProducto(producto1);
		dao.crearProducto(producto2);
		dao.crearCliente(cliente1);
		dao.crearCliente(cliente2);
			
		}catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}
}
