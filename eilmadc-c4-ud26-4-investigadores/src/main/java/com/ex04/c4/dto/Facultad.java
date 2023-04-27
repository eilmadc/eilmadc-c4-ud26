/**
 * 
 */
package com.ex04.c4.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author elena-01
 *
 */

@Entity
@Table(name="facultad")
public class Facultad {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Investigador> investigador;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Equipo> equipo;

	// Constructores
	public Facultad() {

	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param investigador
	 * @param equipo
	 */
	public Facultad(int codigo, String nombre, List<Investigador> investigador, List<Equipo> equipo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.investigador = investigador;
		this.equipo = equipo;
	}

	
	
	//Getters y Setters

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	 * @return the investigador
	 */
	public List<Investigador> getInvestigador() {
		return investigador;
	}

	/**
	 * @param investigador the investigador to set
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Investigador")
	public void setInvestigador(List<Investigador> investigador) {
		this.investigador = investigador;
	}

	/**
	 * @return the equipo
	 */
	public List<Equipo> getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo the equipo to set
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Equipo")
	public void setEquipo(List<Equipo> equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Facultad [codigo=" + codigo + ", nombre=" + nombre + ", investigador=" + investigador + ", equipo="
				+ equipo + "]";
	}

}
