package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.*;
import com.example.demo.dto.*;

@Service // Assign Service
public class ProductoService {

	// Load DAO
	@Autowired
	ProductoDAO productoDAO;

	// CRUD functions
	public List<Producto> listProductos() {
		return productoDAO.findAll();
	}

	public Producto saveProducto(Producto producto) {
		return productoDAO.save(producto);
	}

	public Producto productoById(Long id) {
		return productoDAO.findById(id).get();
	}

	public Producto updateProducto(Producto producto) {
		return productoDAO.save(producto);
	}

	public void deleteProducto(Long id) {
		productoDAO.deleteById(id);
	}

}
