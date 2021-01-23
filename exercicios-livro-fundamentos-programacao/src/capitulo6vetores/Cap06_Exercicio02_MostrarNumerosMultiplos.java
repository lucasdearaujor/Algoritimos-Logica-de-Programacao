package capitulo6vetores;
import java.util.Scanner;

public class Cap06_Exercicio02_MostrarNumerosMultiplos {

	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		Integer[] numeros = new Integer[7];
		
		for(int i = 0 ; i < 7; i++) {
			System.out.println("Informe o n° "+(i+1)+": ");
			numeros[i] = t.nextInt();
		}
		
		System.out.println("*** Multiplos de 2 ***");
		for(int i = 0; i < 7; i++) {
			if(numeros[i]%2 == 0) {
				System.out.println(numeros[i]);
			}
		}
		
		System.out.println("*** Multiplos de 3 ***");
		for(int i = 0; i < 7; i++) {
			if(numeros[i]%3 == 0) {
				System.out.println(numeros[i]);
			}
		}
		
		System.out.println("*** Multiplos de 2 e 3 ***");
		for(int i = 0; i < 7; i++) {
			if(numeros[i]%2 == 0 || numeros[i]%3 == 0) {
				System.out.println(numeros[i]);
			}
		}
		
	}
}
