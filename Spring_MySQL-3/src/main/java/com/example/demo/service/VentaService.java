package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.*;
import com.example.demo.dto.*;

@Service // Assign Service
public class VentaService {

	// Load DAO
	@Autowired
	VentaDAO ventaDAO;

	// CRUD functions
	public List<Venta> listVentas() {
		return ventaDAO.findAll();
	}

	public Venta saveVenta(Venta venta) {
		return ventaDAO.save(venta);
	}

	public Venta ventaById(Long id) {
		return ventaDAO.findById(id).get();
	}

	public Venta updateVenta(Venta venta) {
		return ventaDAO.save(venta);
	}

	public void deleteVenta(Long id) {
		ventaDAO.deleteById(id);
	}

}