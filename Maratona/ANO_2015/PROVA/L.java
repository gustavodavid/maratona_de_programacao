package PROVA;

import java.util.Scanner;

public class L {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		
		int par = 0;
		
		int [] SOMA = new int [K];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				SOMA[j] += scanner.nextInt();
			}
		}
		
		
		for (int i = 0; i < K; i++) {
			if ( SOMA[i] % 2 == 0){
				par++;
			}
		}
		
		if( par == K || par == 0){
			System.out.println("S");
		}else{
			System.out.println("N");
		}
		
		
	}

}
