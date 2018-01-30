package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1035 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		boolean resposta = false;
		
		if( B>C && D>A){
			
			if( (C+D) > (A+B) ){
				
				if( C>=0 && D>=0 ){
					
					if( A%2 == 0 ){
						resposta = true;
					}
					
				}
				
			}
			
		}
		
		if( resposta == true ){
			System.out.printf("Valores aceitos\n");
		}else{
			System.out.printf("Valores nao aceitos\n");
		}
		
	}

}
