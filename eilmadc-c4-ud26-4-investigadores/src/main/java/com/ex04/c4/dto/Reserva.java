/**
 * 
 */
package com.ex04.c4.dto;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author elena-01
 *
 */

@Entity
@Table(name = "reservas")
public class Reserva {

	// Atributos de entidad asignado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;

	@Column(name = "comienzo")
	Date comienzo;

	@Column(name = "fin")
	Date fin;

	@ManyToOne
	@JoinColumn(name = "dni_investigador")
	Investigador investigador;

	@ManyToOne
	@JoinColumn(name = "id_equipo")
	Equipo equipo;

	// -----------Constructors---------------------
	public Reserva() {

	}

	/**
	 * Constructor with params
	 * 
	 * @param id
	 * @param comienzo
	 * @param fin
	 * @param investigador
	 * @param equipo
	 */
	public Reserva(int id, Date comienzo, Date fin, Investigador investigador, Equipo equipo) {
		super();
		this.id = id;
		this.comienzo = comienzo;
		this.fin = fin;
		this.investigador = investigador;
		this.equipo = equipo;
	}

	// ---------------------Getters y Setters----------------

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the comienzo
	 */
	public Date getComienzo() {
		return comienzo;
	}

	/**
	 * @param comienzo the comienzo to set
	 */
	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}

	/**
	 * @return the fin
	 */
	public Date getFin() {
		return fin;
	}

	/**
	 * @param fin the fin to set
	 */
	public void setFin(Date fin) {
		this.fin = fin;
	}

	/**
	 * @return the investigador
	 */
	public Investigador getInvestigador() {
		return investigador;
	}

	/**
	 * @param investigador the investigador to set
	 */
	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}

	/**
	 * @return the equipo
	 */
	public Equipo getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	//----------Methods-----------------
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", comienzo=" + comienzo + ", fin=" + fin + ", investigador=" + investigador
				+ ", equipo=" + equipo + "]";
	}

	
	
}
