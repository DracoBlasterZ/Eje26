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
public class PiezasController {

	// Implement service
	@Autowired
	PiezaService piezaService;

	@GetMapping("/piezas")
	public List<Piezas> listPiezas() {
		return piezaService.listPiezas();
	}

	@GetMapping("/piezas/{id}")
	public Piezas piezaById(@PathVariable(name = "id") Long id) {
		Piezas piezaxID = new Piezas();

		piezaxID = piezaService.piezaById(id);

		return piezaxID;
	}

	@PostMapping("/piezas")
	public Piezas savePieza(@RequestBody Piezas pieza) {
		return piezaService.savePieza(pieza);
	}

	@PutMapping("/piezas/{id}")
	public Piezas updatePieza(@PathVariable(name = "id") Long id, @RequestBody Piezas pieza) {
		Piezas selectedPieza = new Piezas(id, pieza.getNombre());
		Piezas updatedPieza = new Piezas();

		updatedPieza = piezaService.updatePieza(selectedPieza);
		return updatedPieza;
	}

	@DeleteMapping("/piezas/{id}")
	public void deletePieza(@PathVariable(name = "id") Long id) {
		piezaService.deletePieza(id);
	}

}