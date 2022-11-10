package com.example.C4_T25.service;

import java.util.List;

import com.example.C4_T25.dto.Almacen;

public interface IAlmacenService {

	// CREATE
	public Almacen guardarAlmacen(Almacen almacen);
	
	// READ
	public Almacen almacenXID(Long id);
	
	// UPDATE
	public Almacen actualizarAlmacen(Almacen almacen);
	
	// DELETE
	public void eliminarAlmacen(Long id);
	
	// Listar todos los fabricantes
	public List<Almacen> listarAlmacenes();
	
}
