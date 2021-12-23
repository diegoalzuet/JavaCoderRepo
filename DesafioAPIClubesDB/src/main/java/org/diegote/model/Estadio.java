package org.diegote.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Estadio implements Serializable{	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false,updatable = false)
	@Id
	private Integer id;
	private String nombre;
	private Integer capacidad;
	private Boolean techado;	
	
	public Estadio() {}

	public Estadio(Integer id, String nombre, Integer capacidad, Boolean techado) {
		this.id = id;
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.techado = techado;
	}	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public Boolean getTechado() {
		return techado;
	}

	public void setTechado(Boolean techado) {
		this.techado = techado;
	}

	@Override
	public String toString() {
		return "Estadio [id=" + id + ", nombre=" + nombre + ", capacidad=" + capacidad + ", techado=" + techado + "]";
	}	

}
