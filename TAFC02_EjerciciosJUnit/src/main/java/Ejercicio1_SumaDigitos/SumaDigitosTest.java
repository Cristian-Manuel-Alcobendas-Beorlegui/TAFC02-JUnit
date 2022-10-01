package Ejercicio1_SumaDigitos;

// Importar librerias
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumaDigitosTest {
	
	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	// Caso de prueba 1: Sumar valores que tienen 1 solo dígito
	@Test
	public void pruebaSumaDigitos1() {
		System.out.println("Caso de prueba 1: Entero de 1 dígito");
		SumaDigitos suma = new SumaDigitos();
		int valorEsperado = 5;
		int resultado = suma.sum(5);
		assertEquals(valorEsperado, resultado);
	}

	// Caso de prueba 2: Sumar valores que tienen 2 dígitos
	@Test
	public void pruebaSumaDigitos2() {
		System.out.println("Caso de prueba 2: Entero de 2 dígitos");
		SumaDigitos suma = new SumaDigitos();
		int valorEsperado = 7;
		int resultado = suma.sum(25);
		assertEquals(valorEsperado, resultado);
	}

	// Caso de prueba 3: Sumar valores que tienen 3 dígitos
	@Test
	public void pruebaSumaDigitos3() {
		System.out.println("Caso de prueba 3: Entero de 3 dígitos");
		SumaDigitos suma = new SumaDigitos();
		int valorEsperado = 6;
		int resultado = suma.sum(150);
		assertEquals(valorEsperado, resultado);
	}

	// Caso de prueba 4: Introducir un número entero negativo para que la prueba falle. 
	@Test
	public void pruebaSumaDigitos4() {
		System.out.println("Caso de prueba 4: Entero negativo");
		SumaDigitos suma = new SumaDigitos();
		int valorEsperado = -2;
		int resultado = suma.sum(-20);
		assertEquals(valorEsperado, resultado);
	}

}
