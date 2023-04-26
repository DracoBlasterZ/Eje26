package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.*;
import com.example.demo.dto.*;

@Service // Assign Service
public class EquipoService {

	// Load DAO
	@Autowired
	EquipoDAO equipoDAO;

	// CRUD functions
	public List<Equipos> listEquipos() {
		return equipoDAO.findAll();
	}

	public Equipos saveEquipo(Equipos equipo) {
		return equipoDAO.save(equipo);
	}

	public Equipos equipoById(String id) {
		return equipoDAO.findById(id).get();
	}

	public Equipos updateEquipo(Equipos equipo) {
		return equipoDAO.save(equipo);
	}

	public void deleteEquipo(String id) {
		equipoDAO.deleteById(id);
	}

}