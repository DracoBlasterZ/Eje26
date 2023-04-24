package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.*;
import com.example.demo.dao.*;

@Service // Assign Service
public class PiezaService {

	// Load DAO
	@Autowired
	PiezasDAO piezaDAO;

	// CRUD functions
	public List<Piezas> listPiezas() {
		return piezaDAO.findAll();
	}

	public Piezas savePieza(Piezas pieza) {
		return piezaDAO.save(pieza);
	}

	public Piezas piezaById(Long id) {
		return piezaDAO.findById(id).get();
	}

	public Piezas updatePieza(Piezas pieza) {
		return piezaDAO.save(pieza);
	}

	public void deletePieza(Long id) {
		piezaDAO.deleteById(id);
	}
}