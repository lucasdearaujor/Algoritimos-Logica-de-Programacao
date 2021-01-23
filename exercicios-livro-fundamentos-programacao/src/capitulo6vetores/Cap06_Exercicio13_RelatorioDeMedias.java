package capitulo6vetores;
import java.util.Scanner;

public class Cap06_Exercicio13_RelatorioDeMedias {

	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		String nomes[] = new String[8];
		Double notas[] = new Double[8];
		Double somaNotas = 0.0;
		
		for(int i = 0 ; i < 8; i++) {
			System.out.println("Digite o nome do "+(i+1)+"° aluno");
			nomes[i] = t.next();
			System.out.println("Digite a nota do "+nomes[i]);
			notas[i] = t.nextDouble();
			somaNotas += notas[i];
			
		}
		System.out.println("Relatórios de notas");
		System.out.println("Aluno | Nota");
		for(int i = 0 ; i < 8; i++) {
			System.out.println(nomes[i] + " | "+notas[i]);
			
		}
		System.out.println("A média da classe = "+ somaNotas / 8);
		
	}
		
}
