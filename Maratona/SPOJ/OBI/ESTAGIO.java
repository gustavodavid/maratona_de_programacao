package OBI;
import java.util.*;

public class ESTAGIO {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String resp = "";
		int cont = 0;
		
		while (true){
			cont++;
		int alunos = scanner.nextInt();
		int media = 0;
		String resposta = "";
		
		if ( alunos != 0 ){
		for (int i = 0; i < alunos; i++) {
			int C = scanner.nextInt();
			int M = scanner.nextInt();
			
			if ( M > media ){ media = M; resposta = C+""; }else
			if ( M == media ){resposta += " "+C;}
			
		}
		}else{
			break;
		}
		resp += "\nTurma "+cont+"\n"+resposta+"\n";
		}
		
		System.out.println(resp);
	}
}
