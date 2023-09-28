package org.cibertec.edu.pe.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "Producto")
public class Producto {

	@Id
	private String IdProducto;
	private String NombreProduc;
	private String Descripcion;
	private Double Precio;
	private String ImagenUrl;
	
	/*
	@OneToMany(mappedBy = "Product")
	private List<VentaDetalle > venta;*/
	
	//
	Producto() {
	}

	//Constructor
	public Producto(String idProducto, String nombreProduc, String descripcion, Double precio, String imagenUrl) {
		super();
		IdProducto = idProducto;
		NombreProduc = nombreProduc;
		Descripcion = descripcion;
		Precio = precio;
		ImagenUrl = imagenUrl;
	}

	//get and set
	
	public String getIdProducto() {
		return IdProducto;
	}

	public void setIdProducto(String idProducto) {
		IdProducto = idProducto;
	}

	public String getNombreProduc() {
		return NombreProduc;
	}

	public void setNombreProduc(String nombreProduc) {
		NombreProduc = nombreProduc;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}

	public String getImagenUrl() {
		return ImagenUrl;
	}

	public void setImagenUrl(String imagenUrl) {
		ImagenUrl = imagenUrl;
	}
	


	
	
}
