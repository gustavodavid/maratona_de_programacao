package PROVA;

import java.util.Locale;
import java.util.Scanner;

public class Questao_H {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int jogadores = 0;
		int iteracoes = 0;
		while (true){
		int cont = 0 ;
		iteracoes++;
		
		for (int i = 1; i <= M; i++) {
			if ( scanner.nextInt() != 0 ){
				cont++;
				}
		}	
		
		if(cont == M){
			jogadores++;
			}
		
		if( iteracoes == N){
		System.out.println(jogadores);
		break;
		}
		
		}
	}

}
