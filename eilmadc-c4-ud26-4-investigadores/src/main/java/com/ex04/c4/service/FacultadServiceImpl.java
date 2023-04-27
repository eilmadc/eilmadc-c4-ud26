/**
 * 
 */
package com.ex04.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex04.c4.dao.IFacultadDAO;
import com.ex04.c4.dto.Facultad;

/**
 * @author elena-01
 *
 */
@Service
public class FacultadServiceImpl implements FacultadService {

	@Autowired
	IFacultadDAO iFacultadDAO;

	@Override
	public List<Facultad> listarFacultads() {

		return iFacultadDAO.findAll();
	}

	@Override
	public Facultad guardarFacultad(Facultad facultad) {

		return iFacultadDAO.save(facultad);
	}

	@Override
	public Facultad facultadXID(int id) {

		return iFacultadDAO.findById(id).get();
	}

	@Override
	public Facultad actualizarFacultad(Facultad facultad) {

		return iFacultadDAO.save(facultad);
	}

	@Override
	public void eliminarFacultad(int id) {

		iFacultadDAO.deleteById(id);
	}

}
