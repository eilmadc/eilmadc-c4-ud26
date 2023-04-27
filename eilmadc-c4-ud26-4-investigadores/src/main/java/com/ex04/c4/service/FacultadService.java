/**
 * 
 */
package com.ex04.c4.service;

import java.util.List;

import com.ex04.c4.dto.Facultad;

/**
 * @author elena-01
 *
 */
public interface FacultadService {
	// Metodos del CRUD
	public List<Facultad> listarFacultads(); // Listar All

	public Facultad guardarFacultad(Facultad facultad); // Guarda un Facultad CREATE

	public Facultad facultadXID(int id); // Leer datos de un Facultad READ

	public Facultad actualizarFacultad(Facultad facultad); // Actualiza datos del Facultad UPDATE

	public void eliminarFacultad(int id);// Elimina el Facultad DELETE
}
