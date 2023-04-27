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

import com.ex04.c4.dto.Investigador;
import com.ex04.c4.service.InvestigadorServiceImpl;

/**
 * @author elena-01
 *
 */
public class InvestigadorController {
	@Autowired
	InvestigadorServiceImpl investigadorServiceImpl;

	@GetMapping("/investigadores")
	public List<Investigador> listarInvestigador() {
		return investigadorServiceImpl.listarInvestigadores();
	}

	@PostMapping("/investigadores")
	public Investigador salvarInvestigador(@RequestBody Investigador investigador) {

		return investigadorServiceImpl.guardarInvestigador(investigador);
	}

	@GetMapping("/investigadores/{dni}")
	public Investigador InvestigadorXDNI(@PathVariable(name = "dni") String dni) {

		return investigadorServiceImpl.investigadorXDNI(dni);
	}

	@PutMapping("/investigadores/{dni}")
	public Investigador actualizarInvestigador(@PathVariable(name = "dni") String dni, @RequestBody Investigador investigador) {

		Investigador investigador_seleccionado = new Investigador();

		investigador_seleccionado = investigadorServiceImpl.investigadorXDNI(dni);

		investigador_seleccionado.setDni(investigador.getDni());
		investigador_seleccionado.setNomApels(investigador.getNomApels());
		investigador_seleccionado.setFacultad(investigador.getFacultad());

		return investigadorServiceImpl.actualizarInvestigador(investigador_seleccionado);
	}

	@DeleteMapping("/investigadores/{dni}")
	public void eliminarInvestigador(@PathVariable(name = "dni") String dni) {
		investigadorServiceImpl.eliminarInvestigador(dni);
	}
}
