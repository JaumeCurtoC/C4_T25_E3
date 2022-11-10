package com.example.C4_T25.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.C4_T25.dto.Caja;
import com.example.C4_T25.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaServiceImpl;
	
	// Metodo Listar Cajas
	@GetMapping("/cajas")
	public List<Caja> listarCajas() {
		return cajaServiceImpl.listarCajas();
	}
	
	// Metodo listar por id
	@GetMapping("/cajas/id/{id}")
	public Caja listarCajaXID(@PathVariable(name = "id") Long id) {
		return cajaServiceImpl.cajaXID(id);
	}
	
	// Metodo insertar Caja
	@PostMapping("/cajas")
	public Caja guardarCaja(@RequestBody Caja caja) {
		return cajaServiceImpl.guardarCaja(caja);
	}
	
	// Metodo actualizar Caja
	@GetMapping("/cajas/{id}")
	public Caja actualizarCaja(@PathVariable(name = "id") Long id, @RequestBody Caja caja) {
		Caja caja_selec = new Caja();
		Caja caja_actu = new Caja();
		
		caja_selec = cajaServiceImpl.cajaXID(id);
		
		caja_selec.setContenido(caja.getContenido());
		caja_selec.setValor(caja.getValor());
		caja_selec.setAlmacen(caja.getAlmacen());
		
		caja_actu = cajaServiceImpl.actualizarCaja(caja_selec);
		
		System.out.println("Caja actualizado: " + caja_actu);
		
		return caja_actu;
	}
	
	// Metodo eliminar Caja
	@DeleteMapping("/cajas/{id}")
	public void eliminarCaja(@PathVariable(name = "id") Long id) {
		cajaServiceImpl.eliminarCaja(id);
	}
}
