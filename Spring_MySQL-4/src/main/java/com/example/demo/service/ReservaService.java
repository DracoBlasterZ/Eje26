package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.*;
import com.example.demo.dto.*;

@Service // Assign Service
public class ReservaService {

	// Load DAO
	@Autowired
	ReservaDAO reservaDAO;

	// CRUD functions
	public List<Reserva> listReservas() {
		return reservaDAO.findAll();
	}

	public Reserva saveReserva(Reserva reserva) {
		return reservaDAO.save(reserva);
	}

	public Reserva reservaById(Long id) {
		return reservaDAO.findById(id).get();
	}

	public Reserva updateReserva(Reserva reserva) {
		return reservaDAO.save(reserva);
	}

	public void deleteReserva(Long id) {
		reservaDAO.deleteById(id);
	}

}
