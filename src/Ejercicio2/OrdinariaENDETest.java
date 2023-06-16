package Ejercicio2;

import static org.junit.Assert.*;

import java.text.Normalizer;

import javax.swing.Spring;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

public class OrdinariaENDETest {
	
	//Para realizar las pruebas parametrizadas en JUnit primero tenemos que poner como atributos propios las 
	// variables de la clase.
	// Posteriormente hay que crear el constructor y los métodos para probar con la etiqueta @parameters
	private String palabra;
	private int longitud;
	private String palabraSinAcentos;
	
	
	public OrdinariaENDETest(String palabra, int longitud, String palabraSinAcentos) {
		this.palabra = palabra;
		this.longitud = longitud;
		this.palabraSinAcentos = palabraSinAcentos;
	}
	
	@Parameters
	public static boolean esPalindromo(String palabra) {
        int longitud = palabra.length();
        assertEquals("¡arriba la birra!", false);
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) == palabra.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
	
	
	@Parameters
	 public static String quitarAcentos(String palabra) {
		assertEquals("reconocer", false);
		assertEquals("Isaac no ronca así", false);
	    String palabraSinAcentos = Normalizer.normalize(palabra, Normalizer.Form.NFD);
	    palabraSinAcentos = palabraSinAcentos.replaceAll("\\p{M}", "");
	    return palabraSinAcentos;
	}
	
//	Me he bloqueado y no consigo sacar las pruebas parametrizadas, 
//	lo intento con pruebas unitarias pero no tengo tiempo	
	
//	@Test para pruebas unitarias
//	public void test1() {
//		OrdinariaENDE ordinaria = new OrdinariaENDE();
//		ordinaria.esPalindromo(palabra);
//		assertEquals(palabra, "¡arriba la birra!", 0);
//		Assert.assertEquals(0, 0);
//		fail("Not yet implemented");
//	}
		
}
