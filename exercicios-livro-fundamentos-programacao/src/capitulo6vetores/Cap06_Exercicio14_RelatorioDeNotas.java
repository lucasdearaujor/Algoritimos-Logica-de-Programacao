package capitulo6vetores;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import capitulo5estruturaderepeticao.Cap05Exerc12_MostrarQtdNumerosPrimos;

public class Cap06_Exercicio14_RelatorioDeNotas {

	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		String nomes[] = new String[6];
		Double nota1[] = new Double[6];
		Double nota2[] = new Double[6];
		Double media[] = new Double[6];
		String situacao[] = new String[6];
 		Double somaMedias = 0.0;
		Integer qtdAprovados = 0;
		Integer qtdReprovados = 0;
		
		for(int i = 0 ; i < 6; i++) {
			System.out.println("Digite o nome do "+(i+1)+"° aluno");
			nomes[i] = t.next();
			System.out.println("Digite a nota 1 do "+nomes[i]);
			nota1[i] = t.nextDouble();
			System.out.println("Digite a nota 2 do "+nomes[i]);
			nota2[i] = t.nextDouble();
			media[i] = (nota1[i] + nota2[i]) / 2;
			somaMedias += media[i];
			
			if(nota1[i] + nota2[i] / 2 >= 7) {
				situacao[i] = "Aprovado";
				qtdAprovados++;
			} else {
				situacao[i] = "Reprovado";
				qtdReprovados++;
			}
			
		}
		System.out.println("Relatórios de notas");
		System.out.println("|  Aluno    |  1° Prova  |  2° Prova  |  Média  |  Situação  | ");
		for(int i = 0 ; i < 6; i++) {
			System.out.println("  "+nomes[i] + "    "+nota1[i]+"    "+nota2[i]+"    "+((nota1[i] + nota2[i]) / 2)+"   "+situacao[i]+"  ");
		}
		System.out.println("A média da classe = "+ somaMedias / 6);
		System.out.println("Percentual de Alunos aprovados: "+ (6 * (qtdAprovados / 100.0))+"%");
		System.out.println("Percentual de Alunos reprovados: "+ (6 * (qtdReprovados / 100.0))+"%");
		
	}
		
}
