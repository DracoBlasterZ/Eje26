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
@Table(name = "facultades")
public class Facultad {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;

	@OneToMany
	@JoinColumn(name = "FK_facultad_equipo")
	private List<Equipos> equipo;
	
	@OneToMany
	@JoinColumn(name = "FK_facultad_investigador")
	private List<Investigadores> investigador;

	// Constructors
	public Facultad() {
	}

	public Facultad(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Equipo")
	public List<Equipos> getEquipo() {
		return equipo;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Investigador")
	public List<Investigadores> getInvestigador() {
		return investigador;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEquipo(List<Equipos> equipo) {
		this.equipo = equipo;
	}

	public void setInvestigador(List<Investigadores> investigador) {
		this.investigador = investigador;
	}

}
