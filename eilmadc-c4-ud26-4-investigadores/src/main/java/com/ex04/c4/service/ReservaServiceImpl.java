/**
 * 
 */
package com.ex04.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex04.c4.dao.IReservaDAO;
import com.ex04.c4.dto.Reserva;

/**
 * @author elena-01
 *
 */
@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	IReservaDAO iReservaDAO;

	@Override
	public List<Reserva> listarReservas() {
		// TODO Auto-generated method stub
		return iReservaDAO.findAll();
	}

	@Override
	public Reserva guardarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return iReservaDAO.save(reserva);
	}

	@Override
	public Reserva reservaXID(int id) {
		// TODO Auto-generated method stub
		return iReservaDAO.findById(id).get();
	}

	@Override
	public Reserva actualizarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return iReservaDAO.save(reserva);
	}

	@Override
	public void eliminarReserva(int id) {
		// TODO Auto-generated method stub
		iReservaDAO.deleteById(id);
	}

}
