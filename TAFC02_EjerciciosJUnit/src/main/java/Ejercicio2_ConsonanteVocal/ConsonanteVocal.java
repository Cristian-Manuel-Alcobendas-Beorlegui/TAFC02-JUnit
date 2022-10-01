package Ejercicio2_ConsonanteVocal;

public class ConsonanteVocal {
	
	/*
	 * Metodo para comprovar si el caracter pasado por parametro es una vocal o constante
	 * @param character
	 */
	public String check(String character) {
		String v="vocal";
		String c="consonante";
		
		
		//Comprobamos si es vocal o consonante 
		if(character.equalsIgnoreCase("a") || character.equalsIgnoreCase("e") || character.equalsIgnoreCase("i") || character.equalsIgnoreCase("o") || character.equalsIgnoreCase("u")) {
			return v;
		}
		else {
			return c;
		}
	}

	public static void main(String[] args) {
	}

}