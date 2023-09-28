package org.cibertec.edu.pe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VentaDetalle")
public class VentaDetalle {
	
	@Id
	private String IdDetalle;
	private String IdVenta;
	private String IdProducto;
	private Double Descuento;
	private int CantidadProduc;
	

	
	//
	VentaDetalle() {
	}

	//
	
	public VentaDetalle(String idDetalle, String idVenta, String idProducto, Double descuento, int cantidadProduc) {
		super();
		IdDetalle = idDetalle;
		IdVenta = idVenta;
		IdProducto = idProducto;
		Descuento = descuento;
		CantidadProduc = cantidadProduc;
	}

	//

	public String getIdDetalle() {
		return IdDetalle;
	}


	public void setIdDetalle(String idDetalle) {
		IdDetalle = idDetalle;
	}


	public String getIdVeta() {
		return IdVenta;
	}


	public void setIdVeta(String idVeta) {
		IdVenta = idVeta;
	}


	public String getIdProducto() {
		return IdProducto;
	}


	public void setIdProducto(String idProducto) {
		IdProducto = idProducto;
	}


	public Double getDescuento() {
		return Descuento;
	}


	public void setDescuento(Double descuento) {
		Descuento = descuento;
	}


	public int getCantidadProduc() {
		return CantidadProduc;
	}


	public void setCantidadProduc(int cantidadProduc) {
		CantidadProduc = cantidadProduc;
	}
	
	/*
	@ManyToOne
	@JoinColumn(name="IdVenta")
	private VentaProduc ventaProduc;*/

}
