package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1014 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf( "%.3f km/l\n" , (scanner.nextInt()/scanner.nextDouble()) );
	}

}
