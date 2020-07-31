import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.println("TRIANGULO: "+triangulo);
		System.out.println("CIRCULO: " +circulo);
		System.out.println("TRAPEZIO: " +trapezio);
		System.out.println("QUADRADO: " +quadrado);
		System.out.println("RETANGULO:" +retangulo);
		
		sc.close();

	}

}
