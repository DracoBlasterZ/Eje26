package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.*;
import com.example.demo.dto.*;

@Service // Assign Service
public class ProyectosService {

	// Load DAO
	@Autowired
	ProyectosDAO proyectoDAO;

	// CRUD functions
	public List<Proyectos> listProyectos() {
		return proyectoDAO.findAll();
	}

	public Proyectos saveProyecto(Proyectos proyecto) {
		return proyectoDAO.save(proyecto);
	}

	public Proyectos proyectoById(String id) {
		return proyectoDAO.findById(id).get();
	}

	public Proyectos updateProyecto(Proyectos proyecto) {
		return proyectoDAO.save(proyecto);
	}

	public void deleteProyecto(String id) {
		proyectoDAO.deleteById(id);
	}

}
