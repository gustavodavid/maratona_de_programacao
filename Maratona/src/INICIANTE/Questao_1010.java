package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double valor = 0;
		
		scanner.nextInt();
		valor += (scanner.nextInt()*scanner.nextDouble());
		scanner.nextInt();
		valor += (scanner.nextInt()*scanner.nextDouble());
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
		
	}

}
