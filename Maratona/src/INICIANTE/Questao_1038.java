package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1038 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int codigo = scanner.nextInt();
		int quantidade = scanner.nextInt();
		
		switch(codigo){
		case 1: System.out.printf("Total: R$ %.2f\n", (quantidade*4.00));
			break;
		case 2: System.out.printf("Total: R$ %.2f\n", (quantidade*4.50));
			break;
		case 3: System.out.printf("Total: R$ %.2f\n", (quantidade*5.00));
			break;
		case 4: System.out.printf("Total: R$ %.2f\n", (quantidade*2.00));
			break;
		case 5: System.out.printf("Total: R$ %.2f\n", (quantidade*1.50));
			break;
		}
		
	}

}
