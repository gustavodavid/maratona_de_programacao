package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1037 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double numero = scanner.nextDouble();
		int posicao = -1;
		
		if( numero >= 0.0 && numero <= 25.0){
			posicao = 1;
		}
		
		if( numero > 25.0 && numero <= 50.0){
			posicao = 2;
		}
		
		if( numero > 50.0 && numero <= 75.0){
			posicao = 3;
		}
		
		if( numero > 75.0 && numero <= 100.0){
			posicao = 4;
		}
		
		switch (posicao){
		case 1: System.out.printf("Intervalo [0,25]\n");
			break;
		case 2: System.out.printf("Intervalo (25,50]\n");
			break;
		case 3: System.out.printf("Intervalo (50,75]\n");
			break;
		case 4: System.out.printf("Intervalo (75,100]\n");
			break;
		default: System.out.printf("Fora de intervalo\n");
			break;
			
		}
	}

}
