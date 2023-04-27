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
	private int id;
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
	 * @param id
	 * @param nombre
	 * @param reserva
	 * @param facultad
	 */
	public Equipo(int id, String nombre, List<Reserva> reserva, Facultad facultad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.reserva = reserva;
		this.facultad = facultad;
	}

	
	
	//Getters y setters
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
		return "Equipo [id=" + id + ", nombre=" + nombre + ", reserva=" + reserva + ", facultad=" + facultad
				+ "]";
	}

	
	
	

}
