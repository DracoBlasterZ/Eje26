package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.*;
import com.example.demo.dto.*;

@Service // Assign Service
public class InvestigadorService {

	// Load DAO
	@Autowired
	InvestigadorDAO InvestigadorDAO;

	// CRUD functions
	public List<Investigadores> listInvestigadores() {
		return InvestigadorDAO.findAll();
	}

	public Investigadores saveInvestigador(Investigadores Investigador) {
		return InvestigadorDAO.save(Investigador);
	}

	public Investigadores InvestigadorById(String dni) {
		return InvestigadorDAO.findById(dni).get();
	}

	public Investigadores updateInvestigador(Investigadores Investigador) {
		return InvestigadorDAO.save(Investigador);
	}

	public void deleteInvestigador(String dni) {
		InvestigadorDAO.deleteById(dni);
	}

}