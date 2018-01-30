package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1011 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.printf("VOLUME = %.3f\n", ((4/3.0)*3.14159*Math.pow(scanner.nextDouble(), 3)) );
		
	}

}
