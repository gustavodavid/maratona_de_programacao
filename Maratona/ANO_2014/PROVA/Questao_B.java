package PROVA;

import java.util.Locale;
import java.util.Scanner;

public class Questao_B {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int P = scanner.nextInt();
		int posicao = 1;
		int n = P/2;
		int embaralhamento = 0;
		
		
		while(true){

		embaralhamento++;
		
		if( posicao <= n ){
			posicao = posicao * 2 ;
		}else{
			posicao = ((posicao-n)*2)-1;
		}
		
		if ( posicao == 1 ){
			System.out.println(embaralhamento);
			break;
		}
		//break;
		}
		
	}

}
