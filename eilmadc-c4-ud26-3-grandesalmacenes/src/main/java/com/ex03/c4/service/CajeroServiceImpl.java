/**
 * 
 */
package com.ex03.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex03.c4.dao.ICajeroDAO;
import com.ex03.c4.dto.Cajero;

/**
 * @author elena-01
 *
 */
@Service
public class CajeroServiceImpl implements CajeroService{

	@Autowired
	ICajeroDAO iCajeroDAO;
	
	@Override
	public List<Cajero> listarCajeros() {
	
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajero guardarCajero(Cajero cajero) {
	
		return iCajeroDAO.save(cajero);
	}

	@Override
	public Cajero cajeroXID(int codigo) {
	
		return iCajeroDAO.findById(codigo).get();
	}

	@Override
	public Cajero actualizarCajero(Cajero cajero) {
	
		return iCajeroDAO.save(cajero);
	}


	@Override
	public void eliminarCajero(int codigo) {
	
		iCajeroDAO.deleteById(codigo);
	}

}
