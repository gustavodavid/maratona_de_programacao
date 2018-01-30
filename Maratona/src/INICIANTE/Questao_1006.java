package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1006 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner scanner = new Scanner(System.in);
	System.out.printf("MEDIA = %.1f\n",( ((scanner.nextDouble()*2.0)+(scanner.nextDouble()*3.0)+(scanner.nextDouble()*5.0))/10 ));

	}

}
