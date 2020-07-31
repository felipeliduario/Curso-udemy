import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String produto1="Computador";
		String produto2="Notebook";
		
		int idade=18;
		int cod=631038;
		char sexo='M';
		
		double preco1=3500.0;
		double preco2=1200.0;
		double medida = 50.12345678;
		
		System.out.println("         PRODUTOS:");
		System.out.println(produto1+",cujo preço é:"+preco1);
		System.out.println(produto2+",cujo preço é:"+preco2);
		System.out.print("\nDADOS DO CLIENTE:");
		System.out.println("Idade:"+idade+" anos,Codigo:"+cod+",Sexo:"+sexo);
		System.out.println("\nMedida com 8 casas decimais:"+medida);
		System.out.printf("Medida com 3 casas decimais:%.3f\n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Medida com 3 casas decimais ultilizando o Locale:%.3f", medida);

	}

}
