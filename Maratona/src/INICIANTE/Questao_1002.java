package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		final double pi = 3.14159;
		System.out.printf("A=%.4f\n",(pi*Math.pow(scanner.nextDouble(), 2)));
		
	}
	
}