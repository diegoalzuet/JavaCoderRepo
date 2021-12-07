package org.diegote.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Estadio {
	
	@Getter private Integer id;
	@Getter @Setter private String nombre;
	@Getter @Setter private Integer capacidad;
	@Getter @Setter private Boolean techado;
	
	@Override
	public String toString() {
		return "Estadio [id=" + id + ", nombre=" + nombre + ", capacidad=" + capacidad + ", techado=" + techado + "]";
	}
	
	

}
