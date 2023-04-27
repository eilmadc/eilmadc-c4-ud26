/**
 * 
 */
package com.ex04.c4.service;

import java.util.List;

import com.ex04.c4.dto.Investigador;

/**
 * @author elena-01
 *
 */
public interface InvestigadorService {
	// Metodos del CRUD
	public List<Investigador> listarInvestigadores(); // Listar All

	public Investigador guardarInvestigador(Investigador investigador); // Guarda un Investigador CREATE

	public Investigador investigadorXDNI(String dni); // Leer datos de un Investigador READ

	public Investigador actualizarInvestigador(Investigador investigador); // Actualiza datos del Investigador UPDATE

	public void eliminarInvestigador(String dni);// Elimina el Investigador DELETE
}
