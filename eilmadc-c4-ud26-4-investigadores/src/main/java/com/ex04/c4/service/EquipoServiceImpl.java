/**
 * 
 */
package com.ex04.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex04.c4.dao.IEquipoDAO;
import com.ex04.c4.dto.Equipo;

/**
 * @author elena-01
 *
 */
@Service
public class EquipoServiceImpl implements EquipoService {

	@Autowired
	IEquipoDAO iEquipoDAO;

	@Override
	public List<Equipo> listarEquipos() {

		return iEquipoDAO.findAll();
	}

	@Override
	public Equipo guardarEquipo(Equipo equipo) {

		return iEquipoDAO.save(equipo);
	}

	@Override
	public Equipo equipoXID(int id) {

		return iEquipoDAO.findById(id).get();
	}

	@Override
	public Equipo actualizarEquipo(Equipo equipo) {

		return iEquipoDAO.save(equipo);
	}

	@Override
	public void eliminarEquipo(int id) {

		iEquipoDAO.deleteById(id);
	}

}
