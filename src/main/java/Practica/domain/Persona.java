package Practica.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Table;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Table(name="Persona")
public class Persona {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_persona")
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="email")
	private String email;
	
	@Column(name="numero")
	private int numero;
	

	public Persona(String nombre, String apellido, String email, int numero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.numero = numero;
	}
	
	
}
