/**
 * 
 */
package com.ex04.c4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ex04.c4.dto.Facultad;
import com.ex04.c4.service.FacultadServiceImpl;

/**
 * @author elena-01
 *
 */
public class FacultadController {

	@Autowired
	FacultadServiceImpl facultadServiceImpl;

	@GetMapping("/facultades")
	public List<Facultad> listarFacultad() {
		return facultadServiceImpl.listarFacultads();
	}

	@PostMapping("/facultades")
	public Facultad salvarFacultad(@RequestBody Facultad facultad) {

		return facultadServiceImpl.guardarFacultad(facultad);
	}

	@GetMapping("/facultades/{id}")
	public Facultad FacultadXID(@PathVariable(name = "id") int id) {

		return facultadServiceImpl.facultadXID(id);
	}

	@PutMapping("/facultades/{id}")
	public Facultad actualizarFacultad(@PathVariable(name = "id") int id, @RequestBody Facultad facultad) {

		Facultad facultad_seleccionado = new Facultad();

		facultad_seleccionado = facultadServiceImpl.facultadXID(id);

		facultad_seleccionado.setNombre(facultad.getNombre());

		return facultadServiceImpl.actualizarFacultad(facultad_seleccionado);
	}

	@DeleteMapping("/facultads/{id}")
	public void eliminarFacultad(@PathVariable(name = "id") int id) {
		facultadServiceImpl.eliminarFacultad(id);
	}
}
