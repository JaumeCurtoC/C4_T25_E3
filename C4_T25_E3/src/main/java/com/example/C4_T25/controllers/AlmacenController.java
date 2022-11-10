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

import com.example.C4_T25.dto.Almacen;
import com.example.C4_T25.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {
	
	@Autowired
	AlmacenServiceImpl almacenServiceImpl;
	
	// Listar Almacen
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes(){
		return almacenServiceImpl.listarAlmacenes();
	}
	
	// Listar Almacen por ID
	@GetMapping("/almacenes/id/{id}")
	public Almacen almacenXID(@PathVariable(name = "id") Long id) {
		return almacenServiceImpl.almacenXID(id);
	}
	
	// Insertar Almacen
	@PostMapping("/almacenes")
	public Almacen guardarAlmacen(@RequestBody Almacen almacen) {
		return almacenServiceImpl.guardarAlmacen(almacen);
	}
	
	// Actualizar Almacen
	@GetMapping("/almacenes/{id}")
	public Almacen actualizaraAlmacen(@PathVariable(name = "id") Long id, @RequestBody Almacen almacen) {
		Almacen alm_selec = new Almacen();
		Almacen alm_actu = new Almacen();
		
		alm_selec = almacenServiceImpl.almacenXID(id);
		
		alm_selec.setLugar(almacen.getLugar());
		alm_selec.setCapacidad(almacen.getCapacidad());
		
		alm_actu = almacenServiceImpl.actualizarAlmacen(alm_selec);
		
		System.out.println("Almacen actualizado: " + alm_actu);
		
		return alm_actu;
	}
	
	// Eliminar Almacen
	@DeleteMapping("/almacenes/{id}")
	public void eliminarAlmacen(@PathVariable(name = "id") Long id) {
		almacenServiceImpl.eliminarAlmacen(id);
	}
	
}
