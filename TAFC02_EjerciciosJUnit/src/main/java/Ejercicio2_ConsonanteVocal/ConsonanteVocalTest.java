package Ejercicio2_ConsonanteVocal;

//Importar librerias
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConsonanteVocalTest {
	
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
	
	// Caso de prueba 1: Si el carácter es una vocal, se devuelve el mensaje "vocal"
	@Test
	public void pruebaVocalConsonante1() {
		System.out.println("Caso de prueba 1: Comprobar que la vocal devuelve \"vocal\"");
		ConsonanteVocal letra = new ConsonanteVocal();
		String resultadoEsperado = "vocal";
		String resultado = letra.check("a");
		assertEquals(resultadoEsperado, resultado);
	}
	
	// Caso de prueba 2: Si el caracter es una consonante, se devuelve el mensaje "consonante"
	@Test
	public void pruebaVocalConsonante2() {
		System.out.println("Caso de prueba 2: Comprobar que las consonantes devuelven \"consonante\"");
		ConsonanteVocal letra = new ConsonanteVocal();
		String resultadoEsperado = "consonante";
		String resultado = letra.check("b");
		assertEquals(resultadoEsperado, resultado);	
	}
	
	// IMPORTANTE!
	
	/* Originalmente, el código de "consonanteVocal" no distinguia entre mayúsculas y minúsculas.
	 * Así, el código podÍa devolver que una vocal que fuera mayúscula la tomara como consonante.
	 *
	 * Para mentener la integridad del código, se ha añadido la línea "character.equalsIgnoreCase("letra")" 
	 * De esta manera, se puede comparar las letras sin tener en cuenta mayúsculas y minúsculas.
	 * */
	
}
