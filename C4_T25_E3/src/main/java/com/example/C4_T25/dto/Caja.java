package com.example.C4_T25.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cajas")
public class Caja {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "contenido")
	private String contenido;

	@Column(name = "valor")
	private int valor;

	@ManyToOne
	@JoinColumn(name = "almacen")
	private Almacen almacen;

	// ----------------------CONSTRUCTORES---------------------------

	public Caja() {
		// super();
	}

	public Caja(Long id, String contenido, int valor, Almacen almacen) {
		//super();
		this.id = id;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	// -----------------------GETTERS Y SETTERS-----------------------------

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	// --------------------------------TOSTRING-------------------------------
	
	@Override
	public String toString() {
		return "Caja [id=" + id + ", contenido=" + contenido + ", valor=" + valor + ", almacen=" + almacen + "]";
	}
	



}
