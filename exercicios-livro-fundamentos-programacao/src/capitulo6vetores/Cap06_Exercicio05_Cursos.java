package capitulo6vetores;
import java.util.Scanner;

public class Cap06_Exercicio05_Cursos {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer matriculasEmLogica[] = new Integer[15];
		Integer matriculasEmLinguagemDeProgramacao[] = new Integer[15];
		
		for(int i = 0; i  < 15; i++) {
			System.out.println("Digite a matricula do "+(i+1)+ "� aluno de Logica: ");
			matriculasEmLogica[i] = t.nextInt();
		}
		System.out.println("**************************");
		for(int i = 0; i  < 15; i++) {
			System.out.println("Digite a matricula do "+(i+1)+ "� aluno de Linguagem de Programa��o: ");
			matriculasEmLinguagemDeProgramacao[i] = t.nextInt();
		}
		
		System.out.println("Matriculas dos alunos que est�o cursando L�gia e Linguagem de Programa��o:");
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 15; j++) {
				if(matriculasEmLogica[i] == matriculasEmLinguagemDeProgramacao[j]) {
					System.out.println(matriculasEmLogica[i]);
				}
			}
		}
		
		
	}
}
