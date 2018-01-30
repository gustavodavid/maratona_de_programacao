package OBI;
import java.util.*;

public class PEDAGIO1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int estrada = scanner.nextInt();
		int distanciaPedagio = scanner.nextInt();
		int custo = scanner.nextInt();
		int valorPedagio = scanner.nextInt();
		
		int valor = 0; 
		valor += custo*estrada;
		valor += ( estrada / distanciaPedagio ) *valorPedagio;
		
		System.out.println(valor);
	}

}
