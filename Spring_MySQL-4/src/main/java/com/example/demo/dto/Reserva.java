package com.example.demo.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "reservas")
public class Reserva {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "dni")
	private Equipos equipo;

	@ManyToOne
	@JoinColumn(name = "num_serie")
	private Investigadores investigador;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime comienzo;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime fin;

	// Constructors
	public Reserva() {
	}

	public Reserva(Long id, Equipos equipo, Investigadores investigador, LocalDateTime comienzo, LocalDateTime fin) {
		this.id = id;
		this.equipo = equipo;
		this.investigador = investigador;
		this.comienzo = comienzo;
		this.fin = fin;
	}

	// Getters
	public Long getId() {
		return id;
	}

	public Equipos getEquipo() {
		return equipo;
	}

	public Investigadores getInvestigador() {
		return investigador;
	}

	public LocalDateTime getComienzo() {
		return comienzo;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setEquipo(Equipos equipo) {
		this.equipo = equipo;
	}

	public void setInvestigador(Investigadores investigador) {
		this.investigador = investigador;
	}

	public void setComienzo(LocalDateTime comienzo) {
		this.comienzo = comienzo;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

}
