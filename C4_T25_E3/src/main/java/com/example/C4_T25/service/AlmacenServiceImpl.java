package com.example.C4_T25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T25.dao.IAlmacenDAO;
import com.example.C4_T25.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService {
	
	@Autowired
	IAlmacenDAO almacenDAO;

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return almacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenXID(Long id) {
		// TODO Auto-generated method stub
		return almacenDAO.findById(id).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		// TODO Auto-generated method stub
		return almacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Long id) {
		// TODO Auto-generated method stub
		almacenDAO.deleteById(id);
	}

	@Override
	public List<Almacen> listarAlmacenes() {
		// TODO Auto-generated method stub
		return almacenDAO.findAll();
	}

}
