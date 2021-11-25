package clases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Continente {
	
	private String nombre;
	private List<Pais> paises = new ArrayList<>();
	
	public Continente(String nombre) {
		this.nombre = nombre;		
	}

	public String getNombre() {
		return nombre;
	}

	public List<Pais> getPaises() {
		return paises;
	}

	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}
	
	public void agregarPais(Pais pais) {
		this.paises.add(pais);
	}
	@SuppressWarnings("rawtypes")
	public Optional buscarPaisPorCodigo(Integer codigoPais) {		
		Optional<Pais> p =paises.stream().filter(pais->pais.getCodigo()==codigoPais).findAny();		
		return Optional.ofNullable(p);
	}
	public List<String> mapearPaises() {
		List<String> mapeado = paises.stream()
			.sorted(Comparator.comparing(Pais::getCodigo))
			.map(pais ->  pais.getCodigo() +" -- " + pais.getNombre())
			.collect(Collectors.toList());
		
		mapeado.forEach(System.out::println);
		return mapeado;
	}

	@Override
	public String toString() {
		return "Continente [nombre=" + nombre + ", paises=" + paises + "]";
	}
	
	
}
