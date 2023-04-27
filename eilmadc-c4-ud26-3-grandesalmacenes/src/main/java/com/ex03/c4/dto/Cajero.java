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
@Table(name="cajeros")
public class Cajero {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="nomapels")
	private String nomapels;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Venta> venta;

	// Constructores
	public Cajero() {

	}

	/**
	 * @param id
	 * @param nomapels
	 * @param venta
	 */
	public Cajero(Integer id, String nomapels, List<Venta> venta) {
		super();
		this.id = id;
		this.nomapels = nomapels;
		this.venta = venta;
	}

	// Getters y Setters
	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(final String nomapels) {
		this.nomapels = nomapels;
	}

	public List<Venta> getCajeroVentas() {
		return venta;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public void setCajeroVentas(List<Venta> venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "Cajero [id=" + id + ", nomapels=" + nomapels + ", venta=" + venta + "]";
	}

}
