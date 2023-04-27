/**
 * 
 */
package com.ex03.c4.service;

import java.util.List;

import com.ex03.c4.dto.Producto;

/**
 * @author elena-01
 *
 */
public interface ProductoService {
	// Metodos del CRUD
	public List<Producto> listarProductos(); // Listar All

	public Producto guardarProducto(Producto producto); // Guarda un Producto CREATE

	public Producto productoXID(int codigo); // Leer datos de un Producto READ

	public Producto actualizarProducto(Producto producto); // Actualiza datos del Producto UPDATE

	public void eliminarProducto(int codigo);// Elimina el Producto DELETE
}
