package com.lista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages={"com.lista.controllers"})
@SpringBootApplication
public class ListaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaApplication.class, args);
	}
}
