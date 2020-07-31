import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double Raio, Area, pi = 3.14159;
	    
	    Raio = sc.nextDouble();

	    Area = pi * Raio * Raio;

	   System.out.println("A area desse circulo é:  " +Area);

		sc.close();

	}

}
