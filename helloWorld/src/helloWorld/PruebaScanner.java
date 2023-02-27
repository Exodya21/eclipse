package helloWorld;
import java.util.Scanner;

public class PruebaScanner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("mete un numero: ", keyboard);
		
		int numero = keyboard.nextInt();
		
		keyboard.close();
		System.out.println(numero+10);
	}

}
