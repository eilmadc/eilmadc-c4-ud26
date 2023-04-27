/**
 * 
 */
package com.ex04.c4.service;

import java.util.List;

import com.ex04.c4.dto.Equipo;

/**
 * @author elena-01
 *
 */
public interface EquipoService {
	// Metodos del CRUD
	public List<Equipo> listarEquipos(); // Listar All

	public Equipo guardarEquipo(Equipo equipo); // Guarda un Equipo CREATE

	public Equipo equipoXID(int id); // Leer datos de un Equipo READ

	public Equipo actualizarEquipo(Equipo equipo); // Actualiza datos del Equipo UPDATE

	public void eliminarEquipo(int id);// Elimina el Equipo DELETE
}
