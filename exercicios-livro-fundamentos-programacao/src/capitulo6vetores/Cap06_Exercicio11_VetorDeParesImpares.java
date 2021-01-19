package capitulo6vetores;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;import capitulo5estruturaderepeticao.Cap05Exerc12_MostrarQtdNumerosPrimos;

public class Cap06_Exercicio11_VetorDeParesImpares {

	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		Integer numeros[] = new Integer[10];
		Integer pares[] = new Integer[10];
		Integer indicePares = 0;
		Integer impares[] = new Integer[10];
		Integer indiceImpares = 0;
		
		for(int i = 0 ; i < 10; i++) {
			System.out.println("Informe um numero para posição "+(i+1)+": ");
			numeros[i] = t.nextInt();
			if(numeros[i] % 2 == 0) {
				pares[indicePares] = numeros[i];
				indicePares++;
			} else {
				impares[indiceImpares] = numeros[i];
				indiceImpares++;
			}
		}
		
		System.out.println("Numeros pares:");
		for(int i = 0 ; i < indicePares; i++) {
			System.out.println(pares[i]);
		}
		System.out.println("Numeros impares:");
		for(int i = 0 ; i < indiceImpares; i++) {
			System.out.println(impares[i]);
		}
		
		
	}
}
