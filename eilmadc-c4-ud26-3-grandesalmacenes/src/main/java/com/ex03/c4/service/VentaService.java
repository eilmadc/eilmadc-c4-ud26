/**
 * 
 */
package com.ex03.c4.service;

import java.util.List;

import com.ex03.c4.dto.Venta;

/**
 * @author elena-01
 *
 */
public interface VentaService {
	//Metodos del CRUD
	public List<Venta> listarVenta(); //Listar All 
	
	public Venta guardarVenta(Venta venta);	//Guarda un Venta CREATE
	
	public Venta ventaXID(int id); //Leer datos de un Venta READ
	
	public Venta actualizarVenta(Venta venta); //Actualiza datos del Venta UPDATE
	
	public void eliminarVenta(int id);// Elimina el Venta DELETE
}
