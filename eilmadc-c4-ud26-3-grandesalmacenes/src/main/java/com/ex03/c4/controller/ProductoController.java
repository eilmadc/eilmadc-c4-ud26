/**
 * 
 */
package com.ex03.c4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex03.c4.dto.Producto;
import com.ex03.c4.service.ProductoServiceImpl;

/**
 * @author elena-01
 *
 */
@RestController
@RequestMapping("/api")
public class ProductoController {
	@Autowired
	ProductoServiceImpl productoServiceImpl;

	@GetMapping("/productos")
	public List<Producto> listarProducto() {
		return productoServiceImpl.listarProductos();
	}

	@PostMapping("/productos")
	public Producto salvarProducto(@RequestBody Producto producto) {

		return productoServiceImpl.guardarProducto(producto);
	}

	@GetMapping("/productos/{id}")
	public Producto ProductoXID(@PathVariable(name = "id") int id) {

		return productoServiceImpl.productoXID(id);
	}

	@PutMapping("/productos/{id}")
	public Producto actualizarProducto(@PathVariable(name = "id") int id, @RequestBody Producto producto) {

		Producto producto_seleccionado = new Producto();

		producto_seleccionado = productoServiceImpl.productoXID(id);

		producto_seleccionado.setNombre(producto.getNombre());
		producto_seleccionado.setPrecio(producto.getPrecio());
		
		return productoServiceImpl.actualizarProducto(producto_seleccionado);
	}

	@DeleteMapping("/productos/{id}")
	public void eliminarProducto(@PathVariable(name = "id") int id) {
		productoServiceImpl.eliminarProducto(id);
	}
}
