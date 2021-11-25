import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import clases.Pais;

public class PaisTest {
	Pais pais;
	
	@Before
	public  void before() {
		pais = new Pais(1,"Argentina",54);
	}
	
	@Test
	public void testGetID() {		
		assertEquals(Integer.valueOf(1),pais.getID());
	}

	@Test
	public void testSetID() {
		pais.setID(2);
		assertEquals(Integer.valueOf(2), pais.getID());
	}

	@Test
	public void testGetNombre() {
		assertEquals("Argentina", pais.getNombre());
	}

	@Test
	public void testSetNombre() {
		pais.setNombre("Brasil");
		assertEquals("Brasil", pais.getNombre());
	}

	@Test
	public void testGetCodigo() {
		assertEquals(54, pais.getCodigo());
	}

	@Test
	public void testSetCodigo() {
		pais.setCodigo(23);
		assertEquals(23, pais.getCodigo());		
	}

	@Test
	public void testToString() {
		String salida = "Pais [ID=" + pais.getID() + ", nombre=" + pais.getNombre() + ", codigo=" + pais.getCodigo() + "]";
		assertEquals(salida, pais.toString());
	}

}
