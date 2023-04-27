/**
 * 
 */
package com.ex03.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex03.c4.dao.IProductoDAO;
import com.ex03.c4.dto.Producto;

/**
 * @author elena-01
 *
 */
@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	IProductoDAO iProductDAO;
	
	@Override
	public List<Producto> listarProductos() {
	
		return iProductDAO.findAll();
	}

	@Override
	public Producto guardarProducto(Producto producto) {
	
		return iProductDAO.save(producto);
	}

	@Override
	public Producto productoXID(int codigo) {
	
		return iProductDAO.findById(codigo).get();
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
	
		return iProductDAO.save(producto);
	}

	@Override
	public void eliminarProducto(int codigo) {
	
		iProductDAO.deleteById(codigo);
	}

	
}
