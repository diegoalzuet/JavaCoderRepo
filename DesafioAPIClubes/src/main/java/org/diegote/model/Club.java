package org.diegote.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Club {
	
	@Getter private Integer id;
	@Getter @Setter private String nombre;
	@Getter @Setter private String apodo;
	@Getter @Setter private Integer nroSocios;
	@Getter @Setter private Integer titulosNaciones;
	@Getter @Setter private Integer titulosInternacionales;
	@Getter @Setter private Estadio estadio;
	@Getter @Setter private String entrenador;
	
	@Override
	public String toString() {
		return "Club [id=" + id + ", nombre=" + nombre + ", apodo=" + apodo + ", nroSocios=" + nroSocios
				+ ", titulosNaciones=" + titulosNaciones + ", titulosInternacionales=" + titulosInternacionales
				+ ", estadio=" + estadio + ", entrenador=" + entrenador + "]";
	}
	
	

}
