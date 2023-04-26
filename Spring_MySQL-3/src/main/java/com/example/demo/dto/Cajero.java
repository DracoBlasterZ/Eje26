package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cajeros")
public class Cajero {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre_apellidos;

	@OneToMany
	@JoinColumn(name = "FK_cajero")
	private List<Venta> venta;

	// Constructors
	public Cajero() {
	}

	public Cajero(Long id, String nombre_apellidos) {
		this.id = id;
		this.nombre_apellidos = nombre_apellidos;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getNombre_apellidos() {
		return nombre_apellidos;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre_apellidos(String nombre_apellidos) {
		this.nombre_apellidos = nombre_apellidos;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

}
