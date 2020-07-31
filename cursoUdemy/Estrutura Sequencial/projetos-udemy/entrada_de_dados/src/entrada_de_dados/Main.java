package entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		String x;
		x=sc.next();
		int y;
		y=sc.nextInt();
		double a;
		a=sc.nextDouble();
		char b;
		b=sc.next().charAt(0);
		
		System.out.println("Voce digitou: "+x);
		System.out.println("Voce digitou: "+y);
		System.out.println("Voce digitou: "+a);
		System.out.println("Voce digitou: "+b);
		sc.close();

	}

}
