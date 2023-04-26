package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.*;
import com.example.demo.service.*;

@RestController // Rest controller
@RequestMapping("/api")
public class ReservaController {

	// Implement service
	@Autowired
	ReservaService reservaService;

	@GetMapping("/reservas")
	public List<Reserva> listReservas() {
		return reservaService.listReservas();
	}

	@GetMapping("/reservas/{id}")
	public Reserva reservaById(@PathVariable(name = "id") Long id) {
		Reserva reservaxID = new Reserva();

		reservaxID = reservaService.reservaById(id);

		return reservaxID;
	}

	@PostMapping("/reservas")
	public Reserva saveReserva(@RequestBody Reserva reserva) {
		return reservaService.saveReserva(reserva);
	}

	@PutMapping("/reservas/{id}")
	public Reserva updateReserva(@PathVariable(name = "id") Long id, @RequestBody Reserva reserva) {
		Reserva selectedReserva = new Reserva(id, reserva.getEquipo(), reserva.getInvestigador(), reserva.getComienzo(),
				reserva.getFin());
		Reserva updatedReserva = new Reserva();

		updatedReserva = reservaService.updateReserva(selectedReserva);
		return updatedReserva;
	}

	@DeleteMapping("/reservas/{id}")
	public void deleteReserva(@PathVariable(name = "id") Long id) {
		reservaService.deleteReserva(id);
	}

}
