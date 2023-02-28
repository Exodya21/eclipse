package helloWorld;

import java.util.Scanner;

public class ScannerBanco {
	
//	CRTL + 7
//	CRTL + SHIFT + F11
//	CRTL + SHIFT + F
//  ALT + SHIFT + Y
	
	public static void main(String[] args) {
		String[] resps = { "Gestores", "Clientes", "Transferencias", "Mensajes", "Préstamos", "Salir" };
		boolean online = true;

		System.out.println("\n---\n1. Gestores\n2. Clientes\n3. Transferencias\n4. Mensajes\n5. Préstamos\n6. Salir\n---");
		
		while (online) {

			Scanner keyboard = new Scanner(System.in);
			System.out.printf("Decime un número: ", keyboard);

			int numero = keyboard.nextInt();

			if (numero > resps.length || numero < 1) {
				System.out.printf("Decime otro número: ", keyboard);
				numero = keyboard.nextInt();
			}

			if (numero > 0 && numero < resps.length) {
				ScannerBanco.ShowMessages( resps[numero - 1] );	
			}

			if (numero == resps.length) {
				keyboard.close();
				online = false;
				System.out.println("Fin del programa");
			}
		}
	}
	
	public static void ShowMessages(String typeMsg) {
		System.out.println( typeMsg );
	}
	

}
