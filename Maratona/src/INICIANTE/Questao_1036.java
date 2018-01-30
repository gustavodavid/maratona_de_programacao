package INICIANTE;
import java.util.Locale;
import java.util.Scanner;

public class Questao_1036{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double C = scanner.nextDouble();
		
		double delta = (Math.pow(B, 2)) - 4*A*C;
		boolean resposta = false;
		
		double X_1 = 0;
		double X_2 = 0;
		
		if ( delta < 0 || A==0 || C==0){
			
		}else{
			X_1 = (-B + Math.sqrt(delta))/(2*A);
			X_2 = (-B - Math.sqrt(delta))/(2*A);
			resposta = true;
		}
		
		if ( resposta == true ){
			System.out.printf("R1 = %.5f\nR2 = %.5f\n",X_1,X_2);
		}else{
			System.out.printf("Impossivel calcular\n");
		}
	}

}
