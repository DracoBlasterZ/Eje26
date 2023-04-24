package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.*;
import com.example.demo.dto.*;

@Service // Assign Service
public class Asignado_AService {

	// Load DAO
	@Autowired
	Asignado_ADAO asignado_ADAO;

	// CRUD functions
	public List<Asignado_A> listAsignado_As() {
		return asignado_ADAO.findAll();
	}

	public Asignado_A saveAsignado_A(Asignado_A asignado_A) {
		return asignado_ADAO.save(asignado_A);
	}

	public Asignado_A asignado_AById(Long id) {
		return asignado_ADAO.findById(id).get();
	}

	public Asignado_A updateAsignado_A(Asignado_A asignado_A) {
		return asignado_ADAO.save(asignado_A);
	}

	public void deleteAsignado_A(Long id) {
		asignado_ADAO.deleteById(id);
	}

}

