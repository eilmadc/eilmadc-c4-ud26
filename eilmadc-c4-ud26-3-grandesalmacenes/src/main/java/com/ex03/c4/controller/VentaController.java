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

import com.ex03.c4.dto.Venta;
import com.ex03.c4.service.VentaServiceImpl;

/**
 * @author elena-01
 *
 */
@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired
	VentaServiceImpl ventaServiceImpl;

	@GetMapping("/venta")
	public List<Venta> listarVenta() {
		return ventaServiceImpl.listarVenta();
	}

	@PostMapping("/venta")
	public Venta salvarVenta(@RequestBody Venta venta) {

		return ventaServiceImpl.guardarVenta(venta);
	}

	@GetMapping("/venta/{id}")
	public Venta VentaXID(@PathVariable(name = "id") int id) {

		return ventaServiceImpl.ventaXID(id);
	}

	@PutMapping("/venta/{id}")
	public Venta actualizarVenta(@PathVariable(name = "id") int id, @RequestBody Venta venta) {

		Venta venta_seleccionado = new Venta();

		venta_seleccionado = ventaServiceImpl.ventaXID(id);

		venta_seleccionado.setCajero(venta.getCajero());
		venta_seleccionado.setMaquina(venta.getMaquina());
		venta_seleccionado.setProducto(venta.getProducto());
		
		return ventaServiceImpl.actualizarVenta(venta_seleccionado);
	}

	@DeleteMapping("/venta/{id}")
	public void eliminarVenta(@PathVariable(name = "id") int id) {
		ventaServiceImpl.eliminarVenta(id);
	}

}
