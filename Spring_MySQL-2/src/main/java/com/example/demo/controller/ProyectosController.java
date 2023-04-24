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
public class ProyectosController {

	// Implement service
	@Autowired
	ProyectosService proyectoService;

	@GetMapping("/proyectos")
	public List<Proyectos> listProyectos() {
		return proyectoService.listProyectos();
	}

	@GetMapping("/proyectos/{id}")
	public Proyectos proyectoById(@PathVariable(name = "id") String id) {
		Proyectos proyectoxID = new Proyectos();

		proyectoxID = proyectoService.proyectoById(id);

		return proyectoxID;
	}

	@PostMapping("/proyectos")
	public Proyectos saveProyecto(@RequestBody Proyectos proyecto) {
		return proyectoService.saveProyecto(proyecto);
	}

	@PutMapping("/proyectos/{id}")
	public Proyectos updateProyecto(@PathVariable(name = "id") String id, @RequestBody Proyectos proyecto) {
		Proyectos selectedProyecto = new Proyectos(id, proyecto.getNombre(), proyecto.getHoras());
		Proyectos updatedProyecto = new Proyectos();

		updatedProyecto = proyectoService.updateProyecto(selectedProyecto);
		return updatedProyecto;
	}

	@DeleteMapping("/proyectos/{id}")
	public void deleteProyecto(@PathVariable(name = "id") String id) {
		proyectoService.deleteProyecto(id);
	}

}
