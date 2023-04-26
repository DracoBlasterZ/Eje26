package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "investigadores")
public class Investigadores {

	// Attributes
	@Id
	private String dni;

	private String nom_apels;

	@ManyToOne
	@JoinColumn(name = "facultad")
	private Facultad facultad;

	@OneToMany
	@JoinColumn(name = "FK_investigador")
	private List<Reserva> reserva;

	// Constructors
	public Investigadores() {
	}

	public Investigadores(String dni, String nom_apels, Facultad facultad) {
		this.dni = dni;
		this.nom_apels = nom_apels;
		this.facultad = facultad;
	}

	// Getters
	public String getDni() {
		return dni;
	}

	public String getnom_apels() {
		return nom_apels;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}

	// Setters
	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setnom_apels(String nom_apels) {
		this.nom_apels = nom_apels;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

}
