/**
 * 
 */
package com.ex03.c4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex03.c4.dto.Producto;

/**
 * @author elena-01
 *
 */
public interface IProductoDAO extends JpaRepository<Producto, Integer>{

}
