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

import com.ex04.c4.dto.Reserva;
import com.ex04.c4.service.ReservaServiceImpl;

/**
 * @author elena-01
 *
 */
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaServiceImpl;

	@GetMapping("/reservas")
	public List<Reserva> listarReserva() {
		return reservaServiceImpl.listarReservas();
	}

	@PostMapping("/reservas")
	public Reserva salvarReserva(@RequestBody Reserva reserva) {

		return reservaServiceImpl.guardarReserva(reserva);
	}

	@GetMapping("/reservas/{id}")
	public Reserva ReservaXID(@PathVariable(name = "id") int id) {

		return reservaServiceImpl.reservaXID(id);
	}

	@PutMapping("/reservas/{id}")
	public Reserva actualizarReserva(@PathVariable(name = "id") int id, @RequestBody Reserva reserva) {

		Reserva reserva_seleccionado = new Reserva();

		reserva_seleccionado = reservaServiceImpl.reservaXID(id);

		reserva_seleccionado.setComienzo(reserva.getComienzo());
		reserva_seleccionado.setFin(reserva.getFin());
		reserva_seleccionado.setEquipo(reserva.getEquipo());
		reserva_seleccionado.setInvestigador(reserva.getInvestigador());

		return reservaServiceImpl.actualizarReserva(reserva_seleccionado);
	}

	@DeleteMapping("/reservas/{id}")
	public void eliminarReserva(@PathVariable(name = "id") int id) {
		reservaServiceImpl.eliminarReserva(id);
	}
}
