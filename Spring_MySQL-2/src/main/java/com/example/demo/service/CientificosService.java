package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.*;
import com.example.demo.dto.*;

@Service // Assign Service
public class CientificosService {

	// Load DAO
	@Autowired
	CientificosDAO cientificoDAO;

	// CRUD functions
	public List<Cientificos> listCientificos() {
		return cientificoDAO.findAll();
	}

	public Cientificos saveCientifico(Cientificos cientifico) {
		return cientificoDAO.save(cientifico);
	}

	public Cientificos cientificoById(String id) {
		return cientificoDAO.findById(id).get();
	}

	public Cientificos updateCientifico(Cientificos cientifico) {
		return cientificoDAO.save(cientifico);
	}

	public void deleteCientifico(String id) {
		cientificoDAO.deleteById(id);
	}

}