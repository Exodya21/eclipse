package PruebaString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SeisEjerciciosString {

	public static void main(String[] args) {
//		 1 -- escribe un programa que dado dos String compruebe si los dos primeros 
//		 caracteres son iguales.
		firstCharToSame("Hola", "hoy");
//		 2 -- escribe un programa que dado dos String compruebe si los dos primeros 
//		 caracteres y los dos últimos son iguales.
		firstCharAndLastCharToSame("Holas", "hodas");
//		3 --  escribe un programa que compruebe que el substring "abc" se encuentra en un 
//		String dado, pero no puede encontrarse ni al comienzo, ni al final.
		containsABC("holasabcadios");
//		4 --  escribe un programa que dado un String y un determinado índice, compruebe 
//		que el carácter anterior y el posterior son iguales o no.
		charBeforeToSamecharAfter("omoplato", 1);
//		5 --  escribe un programa que muestra por pantalla el índice de la segunda y tercera 
//		ocurrencia del carácter 'a' en un String dado.
		getIndexOfCharRepet("caravajal", 'a');
//		6 --  escribe un programa que devuelva si un String es palíndromo (se escribe igual 
//		hacia delante y hacia detrás).
		isPalindromo("aibofobia");
//		7 --  escribe un programa que concatene dos StringBuilder, utilizando append y 
//		también el operador concatenación.
		builderConcater("Hola", "Buenas");
//		8 -- escribe un programa que elimine el último carácter de un StringBuilder
		popBuilder("Buenos dias");
//		9 --  escribe un programa que inserte el carácter 'b' cada tres posiciones en un 
//		StringBuilder.
		insertCharByPos('b', 3, "Hola mu buena");
//		10 -- escribe un programa que convierta en mayúsculas la primera letra de cada 
//		palabra de un StringBuilder.
		capitalize("hola ke aze");
		
//		00 -- ForEach in java.
		int numeros[] = { 24, 4, 23, 55, 34, 33 };
		forEach(numeros);
	}
	
	public static void charEnter(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
	
	
	public static void firstCharToSame(String word1, String word2) {
		
		if ( word1.substring(0, 2).equalsIgnoreCase(word2.substring(0, 2)) ) {
			System.out.println("1 -- Les primeres lletres de cada paraula son iguals");
		}

		if ( word1.substring(0, 2) == word2.substring(0, 2)) {
			System.out.println("1 -- Les primeres lletres son exactament iguals");
		}
		
	}
	
	public static void firstCharAndLastCharToSame(String word1, String word2) {
		
			String charStart1 = word1.substring(0, 2);
			String charEnd1 = word1.substring(word1.length()-1, word1.length());
			
			String charStart2 = word2.substring(0, 2);
			String charEnd2 = word2.substring(word2.length()-1, word2.length());
			
			if ( charStart1.equalsIgnoreCase(charStart2) && charEnd1.equalsIgnoreCase(charEnd2) ) {
				System.out.println("2 -- Les primeres i últimes lletres de cada paraula son iguals");
			}
	
			if ( charStart1 == charStart2 && charEnd1 == charEnd2 ) {
				System.out.println("2 -- Les primeres i últimes lletres de cada paraula son exactament iguals");
			}
			
		}

	public static void containsABC(String word) {
		if ( word.startsWith("abc") ) return;
		if ( word.endsWith("abc") ) return;
		
		if ( word.contains("abc") ) {
			System.out.println("3 -- La paraula donada conté adins abc");
		}
	}
	
	public static void charBeforeToSamecharAfter(String word, int i) {
		try {
			
			char charBefore = word.charAt(i-1);
			char charAfter = word.charAt(i+1);
			
			if ( charBefore == charAfter ) {
				System.out.printf("4 -- La lletra abans de la posició %d i la lletra després de la posició %d son exactament iguals", i, i).println();
				return;
			}
			
			System.out.println("4 -- False");
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.printf("4 -- StringIndexOutOfBoundsException %d", e).println();
		}
	}
	
	public static void getIndexOfCharRepet(String word, char letter) {

//		String positions = "";
			
//		for (int i = 0; i < word.length(); i++) {
//			if (word.charAt(i) == letter) positions += i + ",";
//		}
//		System.out.printf("5 -- " + "Les posicions de la lletra '" + letter + "' en " + word + " son: " + positions.substring(2, 5)).println();
		
		
		
//		String positions = "";
//		int i = 0;
//		while ( positions.length() < 6 ) {
//			if (word.charAt(i) == letter) positions += i + ",";
//			i++;
//		}
//		System.out.printf("5 -- " + "Les posicions de la lletra '" + letter + "' en " + word + " son: " + positions.substring(2, 5)).println();

		

		List<Integer> positions = new ArrayList<Integer>();
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter) positions.add(i);
		}
//		System.out.println(positions.get(1));
		System.out.printf("5 -- " + "Les posicions de la lletra '" + letter + "' en " + word + " son: " + positions.get(1) + ", " + positions.get(2)).println();
	}
	
	public static void isPalindromo(String word) {
		String drow = "";
		
		for (int i = word.length()-1; i >= 0 ; i--) {
			drow += word.charAt(i);
		}
		
		if ( word.equalsIgnoreCase(drow) ) {
			System.out.println("6 -- Es polindromo");
			return;
		}
		System.out.println("6 -- No es polindromo");
	}
	
	
	public static void builderConcater( String word1, String word2 ) {
		StringBuilder res1 = new StringBuilder(word1);
		StringBuilder res2 = new StringBuilder(word2);
		
		System.out.println("7 -- "+ res1.toString() +" "+ res2.toString());
	}
	
	public static void popBuilder(String word) {
		StringBuilder res = new StringBuilder(word);
		res.deleteCharAt(res.length()-1);
		
		System.out.println("8 -- "+ res.toString());
	}
	
	public static void insertCharByPos(char letter, int pos, String word) {
		StringBuilder res = new StringBuilder(word);
		
		for (int i = 2; i < word.length(); i+=pos) {
			res.insert(i, letter);
		}
		
		System.out.println("9 -- "+ res.toString());
	}
	
	public static void capitalize(String sentence) {
		StringBuilder res = new StringBuilder(sentence);
		
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				System.out.println(i);
			}
		}
		
	}
	
	
	
	public static void forEach(int array[]) {
		System.out.println("00 --");
		
		for(int numero : array) { 
			System.out.println(numero+1);
		}
	}
}