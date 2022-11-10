package com.example.C4_T25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.C4_T25.dao.ICajaDAO;
import com.example.C4_T25.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService{

	@Autowired
	ICajaDAO cajaDAO;

	@Override
	public Caja guardarCaja(Caja caja) {
		// TODO Auto-generated method stub
		return cajaDAO.save(caja);
	}

	@Override
	public Caja cajaXID(Long id) {
		// TODO Auto-generated method stub
		return cajaDAO.findById(id).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		// TODO Auto-generated method stub
		return cajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(Long id) {
		// TODO Auto-generated method stub
		cajaDAO.deleteById(id);
	}

	@Override
	public List<Caja> listarCajas() {
		// TODO Auto-generated method stub
		return cajaDAO.findAll();
	}
	
	
	
}
