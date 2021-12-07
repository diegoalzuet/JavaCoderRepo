package org.diegote.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Club implements Serializable {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	@Id
	private Integer id;
	private String nombre;
	private String apodo;
	private Integer nroSocios;
	private Integer titulosNaciones;
	private Integer titulosInternacionales;

	@JoinColumn(name = "estadio_id", unique = true)
	@OneToOne(cascade = CascadeType.ALL)
	private Estadio estadio;
	private String entrenador;

	public Club() {
	}

	public Club(Integer id, String nombre, String apodo, Integer nroSocios, Integer titulosNaciones,
			Integer titulosInternacionales, Estadio estadio, String entrenador) {
		this.id = id;
		this.nombre = nombre;
		this.apodo = apodo;
		this.nroSocios = nroSocios;
		this.titulosNaciones = titulosNaciones;
		this.titulosInternacionales = titulosInternacionales;
		this.estadio = estadio;
		this.entrenador = entrenador;
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

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Integer getNroSocios() {
		return nroSocios;
	}

	public void setNroSocios(Integer nroSocios) {
		this.nroSocios = nroSocios;
	}

	public Integer getTitulosNaciones() {
		return titulosNaciones;
	}

	public void setTitulosNaciones(Integer titulosNaciones) {
		this.titulosNaciones = titulosNaciones;
	}

	public Integer getTitulosInternacionales() {
		return titulosInternacionales;
	}

	public void setTitulosInternacionales(Integer titulosInternacionales) {
		this.titulosInternacionales = titulosInternacionales;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public String getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}

	@Override
	public String toString() {
		return "Club [id=" + id + ", nombre=" + nombre + ", apodo=" + apodo + ", nroSocios=" + nroSocios
				+ ", titulosNaciones=" + titulosNaciones + ", titulosInternacionales=" + titulosInternacionales
				+ ", entrenador=" + entrenador + "]";
	}

}
