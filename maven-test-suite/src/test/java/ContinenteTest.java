import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import clases.Continente;
import clases.Pais;

public class ContinenteTest {

	Continente continente;
	List<Pais> paises;
	@Before
	public void before() {
		continente = new Continente("Sudamerica");
		Pais pais1 = new Pais(1,"Argentina",54);
		Pais pais2 = new Pais(2,"Brasil",55);
		Pais pais3 = new Pais(3,"Chile",56);
		paises = new ArrayList<>();
		paises.add(pais1);
		paises.add(pais2);
		paises.add(pais3);
		continente.setPaises(paises);
	}

	@Test
	public void testGetNombre() {
		assertEquals("Sudamerica", continente.getNombre());
	}

	@Test
	public void testGetPaises() {		
		assertEquals(paises, continente.getPaises());		
	}

	@Test
	public void testSetPaises() {
		List<Pais> paises2 = new ArrayList<>();
		paises2.add(new Pais(4, "Colombia", 57));
		paises2.add(new Pais(5, "Bolivia", 591));
		continente.setPaises(paises2);
		assertEquals(paises2, continente.getPaises());
	}

	@Test
	public void testAgregarPais() {
		Pais pais = new Pais(6, "Venezuela", 58);
		continente.agregarPais(pais );
		assertEquals(paises, continente.getPaises());
	}

	@Test
	public void testBuscarPaisPorCodigo() {
		Pais pais = new Pais(7, "Paraguay", 595);
		continente.agregarPais(pais );
		assertEquals(Optional.of(pais), continente.buscarPaisPorCodigo(595).get());
	}

	@Test
	public void testMapearPaises() {
		List<String> salidaEsperada = new ArrayList<>();
		salidaEsperada.add("54 -- Argentina");
		salidaEsperada.add("55 -- Brasil");
		salidaEsperada.add("56 -- Chile");
		
		assertEquals(salidaEsperada, continente.mapearPaises());		
	}

	@Test
	public void testToString() {
		String salidaEsperada = "Continente [nombre=" + continente.getNombre() + ", paises=" + continente.getPaises() + "]";
		assertEquals(salidaEsperada, continente.toString());
	}

}
