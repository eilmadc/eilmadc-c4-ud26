/**
 * 
 */
package com.ex03.c4.service;

import java.util.List;

import com.ex03.c4.dto.MaquinasRegistradora;

/**
 * @author elena-01
 *
 */
public interface MaquinasRegistradoraService {
	// Metodos del CRUD
	public List<MaquinasRegistradora> listarMaquinasRegistradoras(); // Listar All

	public MaquinasRegistradora guardarMaquinasRegistradora(MaquinasRegistradora maquinasRegistradora); // Guarda un MaquinasRegistradora CREATE

	public MaquinasRegistradora maquinasRegistradoraXID(int codigo); // Leer datos de un MaquinasRegistradora READ

	public MaquinasRegistradora actualizarMaquinasRegistradora(MaquinasRegistradora maquinasRegistradora); // Actualiza datos del MaquinasRegistradora UPDATE

	public void eliminarMaquinasRegistradora(int codigo);// Elimina el MaquinasRegistradora DELETE
}
