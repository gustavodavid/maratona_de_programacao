package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1019 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int segundos = scanner.nextInt();
		
		int horas = segundos / (60*60);
		segundos = segundos % (60*60);
		
		int minutos = segundos / (60);
		segundos = segundos % (60);
		
		System.out.printf("%d:%d:%d\n",horas,minutos,segundos);
		
	}

}
