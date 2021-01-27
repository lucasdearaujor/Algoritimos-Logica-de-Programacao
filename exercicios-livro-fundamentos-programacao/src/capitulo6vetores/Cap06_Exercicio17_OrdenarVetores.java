package capitulo6vetores;
import java.util.Scanner;

public class Cap06_Exercicio17_OrdenarVetores {

	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		Integer vetor1[] = new Integer[10];
		Integer vetor2[] = new Integer[10];
		Integer vetorOrdenado[] = new Integer[20];
		System.out.println("*** Preencher 1° vetor ***");
		for(int i = 0 ; i < 10; i++) {
			System.out.println("Digente o "+(i+1)+"° numero: ");		
			vetor1[i] = t.nextInt();
		}
		System.out.println("*** Preencher 2° vetor ***");
		for(int i = 0 ; i < 10; i++) {
			System.out.println("Digente o "+(i+1)+"° numero: ");		
			vetor2[i] = t.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				int auxiliar = 0;
				if(vetor1[i] < vetor1[i+1]) {
					auxiliar = vetor1[i];
					vetor[i]
				}
			}
		}
		
		
	}
		
}
