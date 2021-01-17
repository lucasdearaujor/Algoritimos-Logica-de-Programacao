package capitulo6vetores;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;import capitulo5estruturaderepeticao.Cap05Exerc12_MostrarQtdNumerosPrimos;

public class Cap06_Exercicio8_NomesEMediasAlunos {

	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		String[] nomes = new String[7];
		Integer[] medias = new Integer[7];
		String[] nomesNaoAprovados = new String[7];
		Integer[] mediasNomesNaoAprovados = new Integer[7];
		String nomeAlunoMaiorMedia = "";
		
		for(int i = 0 ; i < 7; i++) {
			System.out.println("Informe o nome do aluno n° "+(i+1)+": ");
			nomes[i] = t.next();
			System.out.println("Informe a média do aluno n° "+(i+1)+": ");
			medias[i] = t.nextInt();
		}
		
		for(int i = 0 ; i < 10; i++) {
		}
		
		System.out.println("Qtd de numeros Negativos: " + qtdNegativos);
		System.out.println("Soma dos números positivos: " + somaPositivos);
		
	}
}
