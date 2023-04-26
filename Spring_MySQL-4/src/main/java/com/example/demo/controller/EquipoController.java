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
public class EquipoController {

	// Implement service
	@Autowired
	EquipoService equipoService;

	@GetMapping("/equipos")
	public List<Equipos> listEquipos() {
		return equipoService.listEquipos();
	}

	@GetMapping("/equipos/{id}")
	public Equipos equipoById(@PathVariable(name = "id") String id) {
		Equipos equipoxID = new Equipos();

		equipoxID = equipoService.equipoById(id);

		return equipoxID;
	}

	@PostMapping("/equipos")
	public Equipos saveEquipo(@RequestBody Equipos equipo) {
		return equipoService.saveEquipo(equipo);
	}

	@PutMapping("/equipos/{id}")
	public Equipos updateEquipo(@PathVariable(name = "id") String id, @RequestBody Equipos equipo) {
		Equipos selectedEquipo = new Equipos(id, equipo.getNombre(), equipo.getFacultad());
		Equipos updatedEquipo = new Equipos();

		updatedEquipo = equipoService.updateEquipo(selectedEquipo);
		return updatedEquipo;
	}

	@DeleteMapping("/equipos/{id}")
	public void deleteEquipo(@PathVariable(name = "id") String id) {
		equipoService.deleteEquipo(id);
	}

}

