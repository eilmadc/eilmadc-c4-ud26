/**
 * 
 */
package com.ex04.c4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex04.c4.dto.Reserva;


/**
 * @author elena-01
 *
 */
public interface IReservaDAO  extends JpaRepository<Reserva, Integer>{

}
