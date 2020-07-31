import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numero, horas;
	    double valorHora, salario;

	    numero = sc.nextInt();
	    horas = sc.nextInt();
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("NUMERO =  " + numero);
	    System.out.println("SALARIO = " + salario);
		
		sc.close();

	}

}
