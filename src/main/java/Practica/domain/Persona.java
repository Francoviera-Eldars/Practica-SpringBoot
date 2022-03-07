package Practica.domain;

import java.io.Serializable;

import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@org.hibernate.annotations.Entity
public class Persona implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	//@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
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
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}
