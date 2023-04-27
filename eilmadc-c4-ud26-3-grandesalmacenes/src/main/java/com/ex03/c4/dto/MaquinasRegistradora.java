/**
 * 
 */
package com.ex03.c4.dto;

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
@Table(name="maquinas_registradoras")
public class MaquinasRegistradora {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="piso")
	private Integer piso;

	@OneToMany
	@JoinColumn(name = "maquinas_registradoras")
	private List<Venta> venta;

	// constructores
	public MaquinasRegistradora() {

	}

	/**
	 * @param id
	 * @param piso
	 * @param venta
	 */
	public MaquinasRegistradora(Integer id, Integer piso, List<Venta> venta) {
		super();
		this.id = id;
		this.piso = piso;
		this.venta = venta;
	}

	// Getters y Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public List<Venta> getMaquinaVentas() {
		return venta;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public void setMaquinaVentas(List<Venta> venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "MaquinasRegistradora [id=" + id + ", piso=" + piso + ", venta=" + venta + "]";
	}

}
