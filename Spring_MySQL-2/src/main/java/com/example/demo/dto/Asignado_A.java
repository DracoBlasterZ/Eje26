package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignado_a")
public class Asignado_A {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cientifico")
	private Cientificos cientifico;

	@ManyToOne
	@JoinColumn(name = "proyecto")
	private Proyectos proyecto;

	// Constructors
	public Asignado_A() {
	}

	public Asignado_A(Long id, Cientificos cientifico, Proyectos proyecto) {
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public Cientificos getCientifico() {
		return cientifico;
	}

	public Proyectos getProyecto() {
		return proyecto;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setCientifico(Cientificos cientifico) {
		this.cientifico = cientifico;
	}

	public void setProyecto(Proyectos proyecto) {
		this.proyecto = proyecto;
	}

}