import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inicio = sc.nextInt();
		int termino = sc.nextInt();
		int tempoDeJogo;
		
		if (inicio < termino) {
			tempoDeJogo = termino - inicio;
		}
		else {
			tempoDeJogo = 24 - termino + inicio;
		}
		
		System.out.println("O jogo teve duração de  " + tempoDeJogo + " horas");
		
		sc.close();
	}

}
