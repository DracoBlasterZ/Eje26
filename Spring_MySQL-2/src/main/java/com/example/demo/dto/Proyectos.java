package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "proyectos")
public class Proyectos {

	// Attributes
	@Id
	private String id;

	private String nombre;

	private int horas;

	@OneToMany
	@JoinColumn(name = "FK_proyecto")
	private List<Asignado_A> asignado_a;

	// Constructors
	public Proyectos() {
	}

	public Proyectos(String id, String nombre, int horas) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getHoras() {
		return horas;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado_A")
	public List<Asignado_A> getAsignado_a() {
		return asignado_a;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public void setAsignado_a(List<Asignado_A> asignado_a) {
		this.asignado_a = asignado_a;
	}

}
