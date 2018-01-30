package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1015 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double X_1 = scanner.nextDouble();
		double Y_1 = scanner.nextDouble();
		double X_2 = scanner.nextDouble();
		double Y_2 = scanner.nextDouble();
		
		double distancia = Math.sqrt( Math.pow( (X_2 - X_1), 2) + Math.pow( (Y_2 - Y_1) , 2) );
		
		
		System.out.printf("%.4f\n",distancia);
	}

}
