package org.cibertec.edu.pe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Estado")
public class Estado {
	
	@Id
	private int IdEstado;
	private String Descripcion;
	
	
	//
	public Estado() {
	}


	//
	public Estado(int idEstado, String descripcion) {
		super();
		IdEstado = idEstado;
		Descripcion = descripcion;
	}


	//
	public int getIdEstado() {
		return IdEstado;
	}



	public void setIdEstado(int idEstado) {
		IdEstado = idEstado;
	}



	public String getDescripcion() {
		return Descripcion;
	}



	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	

	
}
