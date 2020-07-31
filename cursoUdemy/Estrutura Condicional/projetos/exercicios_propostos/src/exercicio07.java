
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x == 0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0) {
			System.out.println("Eixo X");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Quadrante 1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Quadrante 2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Quadrante 3");
		}
		else {
			System.out.println("Quadrante 4");
		}
		
		sc.close();
	}
}