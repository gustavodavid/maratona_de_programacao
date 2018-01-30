package AQUECIMENTO;

import java.util.Locale;
import java.util.Scanner;

public class PROBLEMA_A {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int L = scanner.nextInt();
		
		int [] A = new int[L];
		int maior = A[0];
		int menor = A[0];
		
		for (int i = 0; i < L; i++) {
			A[i] = scanner.nextInt();
		}
		
		int tamanhoSequencia = 0;
		int inicioMaiorSequencia = -1;
		
		for (int i = 0; i < A.length; i++) {
			
			if( i == 0){
				tamanhoSequencia++;
			}else{
				
				if( tamanhoSequencia == 0 ){
					menor = A[i];
					tamanhoSequencia++;
				}else{
					
					if( A[i] == A[i-1]+1 ){
						tamanhoSequencia++;
					}else{
						menor = A[i];
					}
					
				}
				
			}
			
		}
		
		System.out.println(menor);
		System.out.println(maior);
		System.out.println(tamanhoSequencia);
		System.out.println(inicioMaiorSequencia);
	}

}
