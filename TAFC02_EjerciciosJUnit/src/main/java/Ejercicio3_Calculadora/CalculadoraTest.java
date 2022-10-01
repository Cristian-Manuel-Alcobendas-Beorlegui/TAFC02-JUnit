package Ejercicio3_Calculadora;

//Importar librerias
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
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
	
	// Caso de prueba 1: Sumar dos números y que devuelva el resultado esperado
	@Test
	public void pruebaSuma() {
		System.out.println("Caso de prueba 1: Suma de números");
		Calculadora calc = new Calculadora();
		double resultadoEsperado = 5;
		double resultado = calc.suma(2, 3);
		assertEquals("3 + 2 = 5", resultadoEsperado, resultado, .0);
	}
	
	// Caso de prueba 2: Restar dos números
	@Test
	public void pruebaResta() {
		System.out.println("Caso de prueba 2: Restar dos números");
		Calculadora calc = new Calculadora();
		double resultadoEsperado = 10;
		double resultado = calc.resta(30, 20);
		assertEquals("30 - 20 = 10", resultadoEsperado, resultado, .0);
	}
	
	// Caso de prueba 3: Multiplicar dos números
	@Test
	public void pruebaMultiplicacion() {
		System.out.println("Caso de prueba 3: Multiplicar dos números");
		Calculadora calc = new Calculadora();
		double resultadoEsperado = 18;
		double resultado = calc.multiplica(6, 3);
		assertEquals("6 * 3 = 18", resultadoEsperado, resultado, .0);
	}
	
	// Caso de prueba 4: Dividir dos números
	@Test
	public void pruebaDivision() {
		System.out.println("Caso de prueba 4: Dividir dos números");
		Calculadora calc = new Calculadora();
		double resultadoEsperado = 7;
		double resultado = calc.divide(14, 2);
		assertEquals("14/2 = 7", resultadoEsperado, resultado, .0);
	}
	
	// Caso de prueba 5: Dividir dos números donde el divisor sea 0.
	@Test
	public void pruebaDividir0() {
		System.out.println("Caso de prueba 5: Dividir donde el divisor sea 0");
		Calculadora calc = new Calculadora();
		double resultado = calc.divide(2, 0);
		assertEquals("2/0=?", true, Double.isInfinite(resultado));
	}
}
