package com.example.C4_T25.service;

import java.util.List;

import com.example.C4_T25.dto.Caja;

public interface ICajaService {
	
	// CREATE
	public Caja guardarCaja(Caja caja);
	
	// READ
	public Caja cajaXID(Long id);
	
	// UPDATE 
	public Caja actualizarCaja(Caja caja);
	
	// DELETE
	public void eliminarCaja(Long id);
	
	// Listar todos los empleados
	public List<Caja> listarCajas();

}
