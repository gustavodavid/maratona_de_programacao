package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.printf("MEDIA = %.5f\n",( ((scanner.nextDouble()*3.5)+(scanner.nextDouble()*7.5))/11 ));
		
	}

}
