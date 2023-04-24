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
public class ProveedorController {

	// Implement service
	@Autowired
	ProveedoresService proveedorService;

	@GetMapping("/proveedores")
	public List<Proveedores> listProveedores() {
		return proveedorService.listProveedores();
	}

	@GetMapping("/proveedores/{id}")
	public Proveedores proveedorById(@PathVariable(name = "id") String id) {
		Proveedores proveedorxID = new Proveedores();

		proveedorxID = proveedorService.proveedorById(id);

		return proveedorxID;
	}

	@PostMapping("/proveedores")
	public Proveedores saveProveedor(@RequestBody Proveedores proveedor) {
		return proveedorService.saveProveedor(proveedor);
	}

	@PutMapping("/proveedores/{id}")
	public Proveedores updateProveedor(@PathVariable(name = "id") String id, @RequestBody Proveedores proveedor) {
		Proveedores selectedProveedor = new Proveedores(id, proveedor.getNombre());
		Proveedores updatedProveedor = new Proveedores();

		updatedProveedor = proveedorService.updateProveedor(selectedProveedor);
		return updatedProveedor;
	}

	@DeleteMapping("/proveedores/{id}")
	public void deleteProveedor(@PathVariable(name = "id") String id) {
		proveedorService.deleteProveedor(id);
	}

}