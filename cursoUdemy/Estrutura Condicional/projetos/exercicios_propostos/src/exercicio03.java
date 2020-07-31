import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		if (X % Y == 0 || Y % X == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();

	}

}
