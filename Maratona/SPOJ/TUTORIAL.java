import java.util.*;
import java.lang.*;
public class TUTORIAL {

	public static void main(String[] args) {
		

//		class Main
//		{
//			public static void main (String[] args) throws java.lang.Exception{
		
		Scanner scanner = new Scanner(System.in);
		String concatenacao = "";
		
		for (int i = 0; true; i++) {
			int numero = scanner.nextInt();
			if( numero == 42 ){
				break;
			}else{
				concatenacao += numero+"\n";
		
		}
	}
		System.out.printf("%s",concatenacao);
}
}