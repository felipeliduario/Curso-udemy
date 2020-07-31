import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		int y = 32;
		double x =10.5574;
		System.out.println("Primeiro programa do curso da udemy");
		System.out.print("teste println ou ");
		System.out.println("print");
		System.out.println(y);
		System.out.printf("%.1f\n",x);
		System.out.printf("%.2f\n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f\n",x);
		System.out.printf("%.4f\n",x);
		System.out.println("Resultado:"+x+" metros");
	}

}
