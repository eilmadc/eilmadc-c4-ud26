/**
 * 
 */
package com.ex02.c4.dto;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author elena-01
 *
 */

@Entity
@Table(name = "proyecto")
public class Proyecto {

			// Atributos de entidad curso
			@Id 
			@Column(name = "id")
			private String id;

			@Column(name = "nombre")
			private String nombre;
			
			@Column(name = "horas")
			private String horas;

			@OneToMany
			@JoinColumn(name = "id")
			private List<Asignado> asignado;

			// Constructores

			public Proyecto() {

			}

			/**
			 * @param id
			 * @param nombre
			 * @param horas
			 * @param asignado
			 */
			public Proyecto(String id, String nombre, String horas, List<Asignado> asignado) {
				super();
				this.id = id;
				this.nombre = nombre;
				this.horas = horas;
				this.asignado = asignado;
			}
		
			
	
}
