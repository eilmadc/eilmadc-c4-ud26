/**
 * 
 */
package com.ex03.c4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex03.c4.dto.MaquinasRegistradora;
import com.ex03.c4.service.MaquinasRegistradoraServiceImpl;

/**
 * @author elena-01
 *
 */
@RestController
@RequestMapping("/api")
public class MaquinasRegistradoraController {

	@Autowired
	MaquinasRegistradoraServiceImpl maquinasRegistradoraServiceImpl;

	@GetMapping("/maquinasRegistradoras")
	public List<MaquinasRegistradora> listarMaquinasRegistradora() {
		return maquinasRegistradoraServiceImpl.listarMaquinasRegistradoras();
	}

	@PostMapping("/maquinasRegistradoras")
	public MaquinasRegistradora salvarMaquinasRegistradora(@RequestBody MaquinasRegistradora maquinasRegistradora) {

		return maquinasRegistradoraServiceImpl.guardarMaquinasRegistradora(maquinasRegistradora);
	}

	@GetMapping("/maquinasRegistradoras/{id}")
	public MaquinasRegistradora MaquinasRegistradoraXID(@PathVariable(name = "id") int id) {

		return maquinasRegistradoraServiceImpl.maquinasRegistradoraXID(id);
	}

	@PutMapping("/maquinasRegistradoras/{id}")
	public MaquinasRegistradora actualizarMaquinasRegistradora(@PathVariable(name = "id") int id, @RequestBody MaquinasRegistradora maquinasRegistradora) {

		MaquinasRegistradora maquinasRegistradora_seleccionado = new MaquinasRegistradora();

		maquinasRegistradora_seleccionado = maquinasRegistradoraServiceImpl.maquinasRegistradoraXID(id);

		maquinasRegistradora_seleccionado.setPiso(maquinasRegistradora.getPiso());

		return maquinasRegistradoraServiceImpl.actualizarMaquinasRegistradora(maquinasRegistradora_seleccionado);
	}

	@DeleteMapping("/maquinasRegistradoras/{id}")
	public void eliminarMaquinasRegistradora(@PathVariable(name = "id") int id) {
		maquinasRegistradoraServiceImpl.eliminarMaquinasRegistradora(id);
	}
}
