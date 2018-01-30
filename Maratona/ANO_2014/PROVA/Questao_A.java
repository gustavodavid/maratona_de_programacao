package PROVA;

import java.util.Locale;
import java.util.Scanner;

public class Questao_A {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		
		int voltasX = 1;
		int voltasY = 1;
		
		int tempo;
		
		while(true){
			tempo = voltasX * X;
			
			if( tempo%Y != 0 ){
				voltasY = tempo/Y + 1;
			}
			
			if( voltasX > voltasY ){
				System.out.println(voltasX);
				break;
			}
			
			voltasX++;
		}
		
	}

}
