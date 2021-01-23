package capitulo6vetores;
import java.util.Scanner;

public class Cap06_Exercicio08_NomesEMediasAlunos {

	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		String[] nomes = new String[7];
		Double[] medias = new Double[7];
		String nomeAlunoMaiorMedia = "";
		Double maiorMedia = 0.0;
		
		for(int i = 0 ; i < 2; i++) {
			System.out.println("Informe o nome do aluno n° "+(i+1)+": ");
			nomes[i] = t.next();
			System.out.println("Informe a média do aluno n° "+(i+1)+": ");
			medias[i] = t.nextDouble();
		}
		
		for(int i = 0 ; i < 2; i++) {
			if(medias[i] > maiorMedia) {
				maiorMedia = medias[i];
				nomeAlunoMaiorMedia = nomes[i];
			}
			
			if(medias[i] < 7) {
				System.out.println("Aluno nome: "+nomes[i]+" não aprovado, precisa tirar: "+ (10 - medias[i]) + " na prova final");
			}
		}
		
		System.out.println("Aluno com maior media: "+nomeAlunoMaiorMedia);
		
	}
}
