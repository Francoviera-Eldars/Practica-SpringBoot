package Practica.domain;

import lombok.Data;

@Data
public class Persona {
	
	private String nombre;
	private String apellido;
	private String email;
	private int numero;
	
	public Persona(String nombre, String apellido, String email, int numero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.numero = numero;
	}
	
	
}
