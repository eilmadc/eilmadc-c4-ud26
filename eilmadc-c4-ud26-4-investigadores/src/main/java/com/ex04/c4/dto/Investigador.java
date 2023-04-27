/**
 * 
 */
package com.ex04.c4.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

/**
 * @author elena-01
 *
 */
public class Investigador {


	// Atributos
	@Id
	@Column(name="dni")
	private String dni;
	@Column(name="nomapels")
	private String nomApels;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Reserva> reserva;
	
	@ManyToOne
    @JoinColumn(name = "id_facultad")
    private Facultad facultad;

	// Constructores
	public Investigador() {

	}

	/**
	 * @param dni
	 * @param nomApels
	 * @param reserva
	 * @param facultad
	 */
	public Investigador(String dni, String nomApels, List<Reserva> reserva, Facultad facultad) {
		super();
		this.dni = dni;
		this.nomApels = nomApels;
		this.reserva = reserva;
		this.facultad = facultad;
	}


	//GEtters y Setters
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nomApels
	 */
	public String getNomApels() {
		return nomApels;
	}

	/**
	 * @param nomApels the nomApels to set
	 */
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
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
		return "Investigador [dni=" + dni + ", nomApels=" + nomApels + ", reserva=" + reserva + ", facultad=" + facultad
				+ "]";
	}

	
	
}
