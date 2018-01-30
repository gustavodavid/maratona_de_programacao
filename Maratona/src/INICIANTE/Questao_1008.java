package INICIANTE;
import java.util.Scanner;
import java.util.Locale;
public class Questao_1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", scanner.nextInt(), scanner.nextInt()*scanner.nextDouble());
				
	}

}
