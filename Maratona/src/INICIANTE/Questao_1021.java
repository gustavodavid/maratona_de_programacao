package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1021 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double valor;
		do{
			valor = scanner.nextDouble();
		}while(valor < 0 || valor > 1000000.00);
		
		System.out.printf("NOTAS:\n");
		System.out.printf("%d nota(s) de R$ 100.00\n", (int)(valor/100));
		valor = valor%100;
		System.out.printf("%d nota(s) de R$ 50.00\n", (int)(valor/50));
		valor = valor%50;
		System.out.printf("%d nota(s) de R$ 20.00\n", (int)(valor/20));
		valor = valor%20;
		System.out.printf("%d nota(s) de R$ 10.00\n", (int)(valor/10));
		valor = valor%10;
		System.out.printf("%d nota(s) de R$ 5.00\n", (int)(valor/5));
		valor = valor%5;
		System.out.printf("%d nota(s) de R$ 2.00\n", (int)(valor/2));
		valor = valor%2;
		
		System.out.printf("MOEDAS:\n");
		System.out.printf("%d moeda(s) de R$ 1.00\n", (int)(valor/1));
		valor = valor%1;
		System.out.printf("%d moeda(s) de R$ 0.50\n", (int)(valor/0.50));
		valor = valor%0.50;
		System.out.printf("%d moeda(s) de R$ 0.25\n", (int)(valor/0.25));
		valor = valor%0.25;
		System.out.printf("%d moeda(s) de R$ 0.10\n", (int)(valor/0.10));
		valor = valor%0.10;
		System.out.printf("%d moeda(s) de R$ 0.05\n", (int)(valor/0.05));
		valor = valor%0.05;
		System.out.printf("%d moeda(s) de R$ 0.01\n", (int)(valor/0.01));
	}

}
