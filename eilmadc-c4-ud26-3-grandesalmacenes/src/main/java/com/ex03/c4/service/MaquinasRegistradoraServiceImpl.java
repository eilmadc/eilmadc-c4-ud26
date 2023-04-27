/**
 * 
 */
package com.ex03.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex03.c4.dao.IMaquinasRegistradoraDAO;
import com.ex03.c4.dto.MaquinasRegistradora;

/**
 * @author elena-01
 *
 */
@Service
public class MaquinasRegistradoraServiceImpl implements MaquinasRegistradoraService {

	@Autowired
	IMaquinasRegistradoraDAO iMaq;

	@Override
	public List<MaquinasRegistradora> listarMaquinasRegistradoras() {

		return iMaq.findAll();
	}

	@Override
	public MaquinasRegistradora guardarMaquinasRegistradora(MaquinasRegistradora maquinasRegistradora) {

		return iMaq.save(maquinasRegistradora);
	}

	@Override
	public MaquinasRegistradora maquinasRegistradoraXID(int codigo) {

		return iMaq.findById(codigo).get();
	}

	@Override
	public MaquinasRegistradora actualizarMaquinasRegistradora(MaquinasRegistradora maquinasRegistradora) {

		return iMaq.save(maquinasRegistradora);
	}

	@Override
	public void eliminarMaquinasRegistradora(int codigo) {
		iMaq.deleteById(codigo);

	}

}
