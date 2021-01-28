package capitulo6vetores;
import java.util.Scanner;

public class Cap06_Exercicio17_OrdenarVetores {

	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		Integer vetor1[] = new Integer[10];
		Integer vetor2[] = new Integer[10];
		Integer vetorOrdenado[] = new Integer[20];
		int auxiliar = 0;
		
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
			vetorOrdenado[i] = vetor1[i];
		}
		for(int i = 10; i < 20; i++) {
			vetorOrdenado[i] = vetor2[i - 10];
		}
		
		
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 19; j++) {
				if(vetorOrdenado[j] < vetorOrdenado[j+1]) {
					auxiliar = vetorOrdenado[j];
					vetorOrdenado[j] = vetorOrdenado[j+1];
					vetorOrdenado[j+1] = auxiliar; 
				}
			}
		}
		
		System.out.println("*** Vetor Completo Ordenado ***");
		for(int i = 0; i < 20; i++) {
			System.out.println(vetorOrdenado[i]);
			
		}
		
		
	}
		
}
