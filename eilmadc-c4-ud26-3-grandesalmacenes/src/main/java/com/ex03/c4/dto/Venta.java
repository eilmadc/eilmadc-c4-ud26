/**
 * 
 */
package com.ex03.c4.dto;

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
@Table(name="venta")
public class Venta {


		// Atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;

		@ManyToOne
	    @JoinColumn(name = "id_producto")
	    private Producto producto;

	    @ManyToOne
	    @JoinColumn(name = "id_cajero")
	    private Cajero cajero;

	    @ManyToOne
	    @JoinColumn(name = "id_maquina")
	    private MaquinasRegistradora maquina;

		// Constructores
		public Venta() {

		}

		/**
		 * @param id
		 * @param producto
		 * @param cajero
		 * @param maquina
		 */
		public Venta(Integer id, Producto producto, Cajero cajero, MaquinasRegistradora maquina) {
			super();
			this.id = id;
			this.producto = producto;
			this.cajero = cajero;
			this.maquina = maquina;
		}
	
		//Getters y Setters
	
		/**
		 * @return the id
		 */
		public Integer getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Integer id) {
			this.id = id;
		}

		/**
		 * @return the producto
		 */
		public Producto getProducto() {
			return producto;
		}

		/**
		 * @param producto the producto to set
		 */
		public void setProducto(Producto producto) {
			this.producto = producto;
		}

		/**
		 * @return the cajero
		 */
		public Cajero getCajero() {
			return cajero;
		}

		/**
		 * @param cajero the cajero to set
		 */
		public void setCajero(Cajero cajero) {
			this.cajero = cajero;
		}

		/**
		 * @return the maquina
		 */
		public MaquinasRegistradora getMaquina() {
			return maquina;
		}

		/**
		 * @param maquina the maquina to set
		 */
		public void setMaquina(MaquinasRegistradora maquina) {
			this.maquina = maquina;
		}

		@Override
		public String toString() {
			return "Venta [id=" + id + ", producto=" + producto + ", cajero=" + cajero + ", maquina=" + maquina + "]";
		}
	
		
}
