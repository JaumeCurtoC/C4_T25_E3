package com.example.C4_T25.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "almacenes")
public class Almacen {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "lugar")
	private String lugar;
	
	@Column(name = "capacidad")
	private int capacidad;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Caja> cajas;
	
	//------------------CONSTRUCTORES----------------------------

	public Almacen() {
		
	}

	public Almacen(Long id, String lugar, int capacidad) {
		// super();
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	//----------------GETTERS Y SETTERS------------------------------

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Caja> getCajas() {
		return cajas;
	}

	public void setCajas(List<Caja> cajas) {
		this.cajas = cajas;
	}
	
	//------------------------TOSTRING-----------------------------

	@Override
	public String toString() {
		return "Almacen [id=" + id + ", lugar=" + lugar + ", capacidad=" + capacidad + "]";
	}
	
}
