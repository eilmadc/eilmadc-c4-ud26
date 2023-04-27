/**
 * 
 */
package com.ex04.c4.service;

import java.util.List;

import com.ex04.c4.dto.Reserva;

/**
 * @author elena-01
 *
 */
public interface ReservaService {
	// Metodos del CRUD
	public List<Reserva> listarReservas(); // Listar All

	public Reserva guardarReserva(Reserva reserva); // Guarda un Reserva CREATE

	public Reserva reservaXID(int id); // Leer datos de un Reserva READ

	public Reserva actualizarReserva(Reserva reserva); // Actualiza datos del Reserva UPDATE

	public void eliminarReserva(int id);// Elimina el Reserva DELETE
}
