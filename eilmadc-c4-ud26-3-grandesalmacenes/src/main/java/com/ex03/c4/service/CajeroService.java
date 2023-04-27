/**
 * 
 */
package com.ex03.c4.service;

import java.util.List;

import com.ex03.c4.dto.Cajero;

/**
 * @author elena-01
 *
 */
public interface CajeroService {
	// Metodos del CRUD
	public List<Cajero> listarCajeros(); // Listar All

	public Cajero guardarCajero(Cajero cajero); // Guarda un Cajero CREATE

	public Cajero cajeroXID(int codigo); // Leer datos de un Cajero READ

	public Cajero actualizarCajero(Cajero cajero); // Actualiza datos del Cajero UPDATE

	public void eliminarCajero(int codigo);// Elimina el Cajero DELETE
}
