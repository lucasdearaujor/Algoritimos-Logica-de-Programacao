package capitulo6vetores;
import java.util.Scanner;

public class Cap06_Exercicio07_MostrarQtdNegativosESomaPositivos {

	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		Integer[] numeros = new Integer[10];
		Integer qtdNegativos = 0;
		Integer somaPositivos = 0;
		
		for(int i = 0 ; i < 10; i++) {
			System.out.println("Informe o n° "+(i+1)+": ");
			numeros[i] = t.nextInt();
		}
		
		for(int i = 0 ; i < 10; i++) {
			if(numeros[i] < 0) {
				qtdNegativos++;
			} else {
				somaPositivos += numeros[i];
			}
		}
		
		System.out.println("Qtd de numeros Negativos: " + qtdNegativos);
		System.out.println("Soma dos números positivos: " + somaPositivos);
		
	}
}
