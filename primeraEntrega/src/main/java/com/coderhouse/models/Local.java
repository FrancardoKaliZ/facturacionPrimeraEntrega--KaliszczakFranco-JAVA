package com.coderhouse.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Locales")
public class Local {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "calle")
	private String calle;
	
	@Column(name = "numero")
	private Integer numero;
	
	@ManyToMany(mappedBy = "locales", fetch = FetchType.EAGER)
	private List<Producto> productos = new ArrayList<>();
	
	public Local() {
		super();
	}

	public Local(String nombre, String calle, Integer numero) {
		super();
		this.nombre = nombre;
		this.calle = calle;
		this.numero = numero;

	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Local [id=" + id + ", nombre=" + nombre + ", calle=" + calle + ", numero=" + numero + ", productos="
				+ productos + "]";
	}
	
	
	
}
