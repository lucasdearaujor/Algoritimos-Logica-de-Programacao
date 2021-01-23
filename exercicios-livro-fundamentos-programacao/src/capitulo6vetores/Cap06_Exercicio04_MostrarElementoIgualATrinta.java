package capitulo6vetores;
import java.util.Scanner;

public class Cap06_Exercicio04_MostrarElementoIgualATrinta {

	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		Integer[] numeros = new Integer[15];
		
		for(int i = 0 ; i < 15; i++) {
			System.out.println("Informe o n° "+(i+1)+": ");
			numeros[i] = t.nextInt();
		}
		
		for(int i = 0 ; i < 15; i++) {
			if(numeros[i] == 30) {
				System.out.println("Numero: "+numeros[i]+" na posição: "+i);
			}
		}
		
		
		
		
	}
}
