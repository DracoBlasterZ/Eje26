package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.*;
import com.example.demo.dto.*;

@Service // Assign Service
public class ProveedoresService {

	// Load DAO
	@Autowired
	ProveedoresDAO proveedorDAO;

	// CRUD functions
	public List<Proveedores> listProveedores() {
		return proveedorDAO.findAll();
	}

	public Proveedores saveProveedor(Proveedores proveedor) {
		return proveedorDAO.save(proveedor);
	}

	public Proveedores proveedorById(String id) {
		return proveedorDAO.findById(id).get();
	}

	public Proveedores updateProveedor(Proveedores proveedor) {
		return proveedorDAO.save(proveedor);
	}

	public void deleteProveedor(String id) {
		proveedorDAO.deleteById(id);
	}

}
