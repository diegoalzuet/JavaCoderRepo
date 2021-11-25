package clases;

public class Pais {
	
	private Integer ID;
	private String nombre;
	private int codigo;
	
	public Pais(int iD, String nombre, Integer codigo) {
		this.ID = iD;
		this.nombre = nombre;
		this.codigo = codigo;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Pais [ID=" + ID + ", nombre=" + nombre + ", codigo=" + codigo + "]";
	}
}
