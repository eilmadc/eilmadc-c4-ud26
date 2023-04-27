/**
 * 
 */
package com.ex04.c4.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author elena-01
 *
 */
@Entity
@Table(name="equipos")
public class Equipo {

	// Atributos
	@Id
	@Column(name="numserie")
	private String numSerie;
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Reserva> reserva;
	
	@ManyToOne
    @JoinColumn(name = "id_facultad")
    private Facultad facultad;

	// Constructores
	public Equipo() {

	}

	/**
	 * @param numSerie
	 * @param nombre
	 * @param reserva
	 * @param facultad
	 */
	public Equipo(String numSerie, String nombre, List<Reserva> reserva, Facultad facultad) {
		super();
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.reserva = reserva;
		this.facultad = facultad;
	}

	
	
	//Getters y setters
	/**
	 * @return the numSerie
	 */
	public String getNumSerie() {
		return numSerie;
	}

	/**
	 * @param numSerie the numSerie to set
	 */
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the reserva
	 */

	public List<Reserva> getReserva() {
		return reserva;
	}

	/**
	 * @param reserva the reserva to set
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	/**
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}

	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	@Override
	public String toString() {
		return "Equipo [numSerie=" + numSerie + ", nombre=" + nombre + ", reserva=" + reserva + ", facultad=" + facultad
				+ "]";
	}

	
	
	

}
