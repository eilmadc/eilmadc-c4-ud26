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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex04.c4.dto.Equipo;
import com.ex04.c4.service.EquipoServiceImpl;


/**
 * @author elena-01
 *
 */


@RestController
@RequestMapping("/api")
public class EquipoController {

	@Autowired
	EquipoServiceImpl equipoServiceImpl;

	@GetMapping("/equipos")
	public List<Equipo> listarEquipo() {
		return equipoServiceImpl.listarEquipos();
	}

	@PostMapping("/equipos")
	public Equipo salvarEquipo(@RequestBody Equipo equipo) {

		return equipoServiceImpl.guardarEquipo(equipo);
	}

	@GetMapping("/equipos/{id}")
	public Equipo EquipoXID(@PathVariable(name = "id") int id) {

		return equipoServiceImpl.equipoXID(id);
	}

	@PutMapping("/equipos/{id}")
	public Equipo actualizarEquipo(@PathVariable(name = "id") int id, @RequestBody Equipo equipo) {

		Equipo equipo_seleccionado = new Equipo();

		equipo_seleccionado = equipoServiceImpl.equipoXID(id);

		equipo_seleccionado.setNombre(equipo.getNombre());
		equipo_seleccionado.setFacultad(equipo.getFacultad());

		return equipoServiceImpl.actualizarEquipo(equipo_seleccionado);
	}

	@DeleteMapping("/equipos/{id}")
	public void eliminarEquipo(@PathVariable(name = "id") int id) {
		equipoServiceImpl.eliminarEquipo(id);
	}
}
