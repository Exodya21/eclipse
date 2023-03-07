package exam3;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isTriangle(45, 60, 65);
		isTriangle(45, -70, 65);
		isTriangle(45, 70, 65);
	}

	public static void isTriangle(int alfa, int beta, int gamma) {
		if ( alfa < 0 || beta < 0 || gamma < 0 ) {
			System.out.println("Con angulos positivo po favo");
			return;
		}
		
		if (alfa+beta+gamma == 180) {
			System.out.println("Es un triangulo.");
			return;
		}
		
		System.out.println("Eso no es un triangulo.");
	}
	
}
