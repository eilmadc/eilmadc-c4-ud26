/**
 * 
 */
package com.ex03.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex03.c4.dao.IVentaDAO;
import com.ex03.c4.dto.Venta;

/**
 * @author elena-01
 *
 */
@Service
public class VentaServiceImpl implements VentaService{

	@Autowired
	IVentaDAO iVentaDAO;
	
	@Override
	public List<Venta> listarVenta() {

		return iVentaDAO.findAll();
	}

	@Override
	public Venta guardarVenta(Venta venta) {

		return iVentaDAO.save(venta);
	}

	@Override
	public Venta ventaXID(int id) {

		return iVentaDAO.findById(id).get();
	}

	@Override
	public Venta actualizarVenta(Venta venta) {

		return iVentaDAO.save(venta);
	}

	@Override
	public void eliminarVenta(int id) {

		iVentaDAO.deleteById(id);
	}

}
