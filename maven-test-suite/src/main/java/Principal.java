import java.time.Clock;
import java.time.ZoneId;
import java.util.InputMismatchException;
import java.util.Scanner;

import clases.Continente;
import clases.Pais;

public class Principal {

	public static void main(String[] args) {
		
		Clock reloj = Clock.systemDefaultZone();
		
		System.out.println("INICIO EJECUCION: "+ reloj.instant().atZone(ZoneId.of("America/Argentina/Buenos_Aires")));
		System.out.println();

		Continente sudamerica = new Continente("Sudamerica");
		Pais argentina = new Pais(1, "Argentina", 54);
		Pais brasil = new Pais(2,"Brasil",55);
		Pais chile = new Pais(3,"Chile",56);
		Pais bolivia = new Pais(4,"Bolivia",591);
		Pais colombia = new Pais(5,"Colombia",57);
		Pais paraguay = new Pais(6,"Paraguay",595);
		Pais peru = new Pais(7,"Peru",51);
		Pais uruguay = new Pais(8,"Uruguay",598);
		Pais venezuela = new Pais(9,"Venezuela",58);
				
		sudamerica.agregarPais(argentina);
		sudamerica.agregarPais(brasil);
		sudamerica.agregarPais(chile);
		sudamerica.agregarPais(bolivia);
		sudamerica.agregarPais(colombia);
		sudamerica.agregarPais(paraguay);
		sudamerica.agregarPais(peru);
		sudamerica.agregarPais(uruguay);
		sudamerica.agregarPais(venezuela);
	
		sudamerica.mapearPaises();
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese codigo de pais a buscar: ");
		try {
			Integer codigoPais= lector.nextInt();			
			System.out.println(sudamerica.buscarPaisPorCodigo(codigoPais));
			
		}catch (InputMismatchException e) {
			System.out.println("Debe ingresar un numero. Fin del programa");			
		}
		finally {
			System.out.println("FIN EJECUCION: "+ reloj.instant().atZone(ZoneId.of("America/Argentina/Buenos_Aires")));
			lector.close();
		}
	}
}
