package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1020 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int dias = scanner.nextInt();
		
		int anos = dias / 365;
		dias = dias % 365;
		
		int meses = dias / 30;
		dias = dias % 30;
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",anos, meses, dias);
		
	}

}
