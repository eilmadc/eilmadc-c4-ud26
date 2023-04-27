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

import com.ex03.c4.dto.Cajero;
import com.ex03.c4.service.CajeroServiceImpl;

/**
 * @author elena-01
 *
 */
@RestController
@RequestMapping("/api")
public class CajeroController {

	@Autowired
	CajeroServiceImpl cajeroServiceImpl;

	@GetMapping("/cajeros")
	public List<Cajero> listarCajero() {
		return cajeroServiceImpl.listarCajeros();
	}

	@PostMapping("/cajeros")
	public Cajero salvarCajero(@RequestBody Cajero cajero) {

		return cajeroServiceImpl.guardarCajero(cajero);
	}

	@GetMapping("/cajeros/{id}")
	public Cajero CajeroXID(@PathVariable(name = "id") int id) {

		return cajeroServiceImpl.cajeroXID(id);
	}

	@PutMapping("/cajeros/{id}")
	public Cajero actualizarCajero(@PathVariable(name = "id") int id, @RequestBody Cajero cajero) {

		Cajero cajero_seleccionado = new Cajero();

		cajero_seleccionado = cajeroServiceImpl.cajeroXID(id);

		cajero_seleccionado.setNomapels(cajero.getNomapels());

		return cajeroServiceImpl.actualizarCajero(cajero_seleccionado);
	}

	@DeleteMapping("/cajeros/{id}")
	public void eliminarCajero(@PathVariable(name = "id") int id) {
		cajeroServiceImpl.eliminarCajero(id);
	}
}
