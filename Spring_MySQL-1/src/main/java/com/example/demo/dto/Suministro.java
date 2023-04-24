package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "suministra")
public class Suministro {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "pieza")
	private Piezas pieza;

	@ManyToOne
	@JoinColumn(name = "proveedor")
	private Proveedores proveedor;

	@Column(name = "precio")
	private int precio;

	// Constructor
	public Suministro() {
	}

	public Suministro(Long id, Piezas pieza, Proveedores proveedor, int precio) {
		this.id = id;
		this.pieza = pieza;
		this.proveedor = proveedor;
		this.precio = precio;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public Piezas getPieza() {
		return pieza;
	}

	public Proveedores getProveedor() {
		return proveedor;
	}

	public int getPrecio() {
		return precio;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}
	public void setPieza(Piezas pieza) {
		this.pieza = pieza;
	}

	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
