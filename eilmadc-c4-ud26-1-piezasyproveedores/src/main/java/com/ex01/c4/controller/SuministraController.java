/**
 * 
 */
package com.ex01.c4.controller;

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

import com.ex01.c4.dto.Suministra;
import com.ex01.c4.service.SuministraServiceImpl;

/**
 * @author elena-01
 *
 */

@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuministraServiceImpl suministraServiceImpl;

	@GetMapping("/suministra")
	public List<Suministra> listarSuministra() {
		return suministraServiceImpl.listarSuministra();
	}

	@PostMapping("/suministra")
	public Suministra salvarSuministra(@RequestBody Suministra suministra) {

		return suministraServiceImpl.guardarSuministra(suministra);
	}

	@GetMapping("/suministra/{id}")
	public Suministra SuministraXID(@PathVariable(name = "id") int id) {

		return suministraServiceImpl.suministraXID(id);
	}

	@PutMapping("/suministra/{id}")
	public Suministra actualizarSuministra(@PathVariable(name = "id") int id, @RequestBody Suministra Suministra) {

		Suministra Suministra_seleccionado = new Suministra();
		Suministra Suministra_actualizado = new Suministra();

		Suministra_seleccionado = suministraServiceImpl.suministraXID(id);

		Suministra_seleccionado.setPieza(Suministra.getPieza());
		Suministra_seleccionado.setProveedor(Suministra.getProveedor());

		Suministra_actualizado = suministraServiceImpl.actualizarSuministra(Suministra_seleccionado);

		System.out.println("El Suministra actualizado es: " + Suministra_actualizado);

		return Suministra_actualizado;
	}

	@DeleteMapping("/suministra/{id}")
	public void eleiminarSuministra(@PathVariable(name = "id") int id) {
		suministraServiceImpl.eliminarSuministra(id);
	}

}
