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
public class InvestigadorController {

	// Implement service
	@Autowired
	InvestigadorService investigadorService;

	@GetMapping("/investigadores")
	public List<Investigadores> listInvestigadores() {
		return investigadorService.listInvestigadores();
	}

	@GetMapping("/investigadores/{dni}")
	public Investigadores investigadorById(@PathVariable(name = "dni") String dni) {
		Investigadores investigadorxID = new Investigadores();

		investigadorxID = investigadorService.InvestigadorById(dni);

		return investigadorxID;
	}

	@PostMapping("/investigadores")
	public Investigadores saveInvestigador(@RequestBody Investigadores investigador) {
		return investigadorService.saveInvestigador(investigador);
	}

	@PutMapping("/investigadores/{dni}")
	public Investigadores updateInvestigador(@PathVariable(name = "dni") String dni,
			@RequestBody Investigadores investigador) {
		Investigadores selectedInvestigador = new Investigadores(dni, investigador.getnom_apels(), investigador.getFacultad());
		Investigadores updatedInvestigador = new Investigadores();

		updatedInvestigador = investigadorService.updateInvestigador(selectedInvestigador);
		return updatedInvestigador;
	}

	@DeleteMapping("/investigadores/{dni}")
	public void deleteInvestigador(@PathVariable(name = "dni") String dni) {
		investigadorService.deleteInvestigador(dni);
	}

}