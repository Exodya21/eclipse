package exam3;

import java.util.Arrays;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getBigInt(12, 2, 33, 4);
	}

	public static void getBigInt(int a, int b, int c, int d) {
		int[] numeros = {a, b, c, d};
		
		Arrays.sort(numeros);
		
		System.out.println("El numero más grande es: "+numeros[numeros.length-1]);
	} 
	
}
