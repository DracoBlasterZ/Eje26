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
public class CientificosController {

	// Implement service
	@Autowired
	CientificosService cientificoService;

	@GetMapping("/cientificos")
	public List<Cientificos> listCientificos() {
		return cientificoService.listCientificos();
	}

	@GetMapping("/cientificos/{DNI}")
	public Cientificos cientificoById(@PathVariable(name = "DNI") String DNI) {
		Cientificos cientificoxID = new Cientificos();

		cientificoxID = cientificoService.cientificoById(DNI);

		return cientificoxID;
	}

	@PostMapping("/cientificos")
	public Cientificos saveCientifico(@RequestBody Cientificos cientifico) {
		return cientificoService.saveCientifico(cientifico);
	}

	@PutMapping("/cientificos/{DNI}")
	public Cientificos updateCientifico(@PathVariable(name = "DNI") String DNI, @RequestBody Cientificos cientifico) {
		Cientificos selectedCientifico = new Cientificos(DNI, cientifico.getNombre_apellidos());
		Cientificos updatedCientifico = new Cientificos();

		updatedCientifico = cientificoService.updateCientifico(selectedCientifico);
		return updatedCientifico;
	}

	@DeleteMapping("/cientificos/{DNI}")
	public void deleteCientifico(@PathVariable(name = "DNI") String DNI) {
		cientificoService.deleteCientifico(DNI);
	}

}