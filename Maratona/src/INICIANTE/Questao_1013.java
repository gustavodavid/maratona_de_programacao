package INICIANTE;
import java.util.Scanner;

public class Questao_1013 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int maior = (a+b+Math.abs(a-b))/2;
		maior = (maior+c+Math.abs(maior-c))/2;
		
		System.out.printf("%d eh o maior\n",maior);
	}

}
