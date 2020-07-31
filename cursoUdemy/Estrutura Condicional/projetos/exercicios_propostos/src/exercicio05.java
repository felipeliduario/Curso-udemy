import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int codigo,qntd;
		double valor;
		
		System.out.println("Digite o codigo do produto:");
		codigo=sc.nextInt();
		while(codigo<1 || codigo>5) {
			System.out.println("Codigo incorreto,por favor insira outro");
			codigo=sc.nextInt();
		}
		if(codigo==1){
			
			System.out.println("Digite a quantidade de cachorros quente:");
			qntd=sc.nextInt();
			valor=qntd * 4.0;
			
		}
		else if(codigo==2){
		
			System.out.println("Digite a quantidade de X-Salada:");
			qntd=sc.nextInt();
			valor=qntd * 4.50;
					
		}
		else if(codigo==3){
			
			System.out.println("Digite a quantidade de X-Bacon:");
			qntd=sc.nextInt();
			valor=qntd * 5.0;
		
			
		}
		else if(codigo==4){
		
			System.out.println("Digite a quantidade de torradas simples:");
			qntd=sc.nextInt();
			valor=qntd * 2.0;
		
		}
		else {
			
			System.out.println("Digite a quantidade de refrigerantes:");
			qntd=sc.nextInt();
			valor=qntd * 1.50;
		
		}
		sc.close();
		System.out.println("O valor a se pagar é: " +valor);
	}
}
