package org.cibertec.edu.pe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Venta")
public class VentaProduc {
	
	@Id
	private String IdVenta;
	private int IdEstado;
	private Double PrecioEnv;
	private Double SubTotal;
	
	//
	public VentaProduc() {
	}

	//
	public VentaProduc(String idVenta, int idEstado, Double precioEnv, Double subTotal) {
		super();
		IdVenta = idVenta;
		IdEstado = idEstado;
		PrecioEnv = precioEnv;
		SubTotal = subTotal;
	}
	
	//

	public String getIdVenta() {
		return IdVenta;
	}

	public void setIdVenta(String idVenta) {
		IdVenta = idVenta;
	}

	public int getIdEstado() {
		return IdEstado;
	}

	public void setIdEstado(int idEstado) {
		IdEstado = idEstado;
	}

	public Double getPrecioEnv() {
		return PrecioEnv;
	}

	public void setPrecioEnv(Double precioEnv) {
		PrecioEnv = precioEnv;
	}

	public Double getSubTotal() {
		return SubTotal;
	}

	public void setSubTotal(Double subTotal) {
		SubTotal = subTotal;
	}
	
	


}
