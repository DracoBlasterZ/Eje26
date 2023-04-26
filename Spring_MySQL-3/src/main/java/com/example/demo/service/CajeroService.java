package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.*;
import com.example.demo.dto.*;

@Service // Assign Service
public class CajeroService {

	// Load DAO
	@Autowired
	CajeroDAO cajeroDAO;

	// CRUD functions
	public List<Cajero> listCajeros() {
		return cajeroDAO.findAll();
	}

	public Cajero saveCajero(Cajero cajero) {
		return cajeroDAO.save(cajero);
	}

	public Cajero cajeroById(Long id) {
		return cajeroDAO.findById(id).get();
	}

	public Cajero updateCajero(Cajero cajero) {
		return cajeroDAO.save(cajero);
	}

	public void deleteCajero(Long id) {
		cajeroDAO.deleteById(id);
	}

}
