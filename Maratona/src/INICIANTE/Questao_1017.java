package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1017 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("%.3f\n", (double)(scanner.nextInt()*scanner.nextInt())/12 );
		
	}

}
