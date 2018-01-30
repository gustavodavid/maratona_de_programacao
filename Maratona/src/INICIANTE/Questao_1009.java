package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		System.out.printf("TOTAL = R$ %.2f\n", ( scanner.nextDouble() + (scanner.nextDouble() * 0.15  ))  );
	}

}
