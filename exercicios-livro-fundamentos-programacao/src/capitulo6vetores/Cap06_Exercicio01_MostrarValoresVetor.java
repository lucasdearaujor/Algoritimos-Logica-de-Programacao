package capitulo6vetores;
import java.util.Scanner;

public class Cap06_Exercicio01_MostrarValoresVetor {

	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		Integer[] numero = new Integer[6];
		Integer qtdNumerosPares = 0;
		Integer qtdNumerosImpares = 0;
		
		for(int i = 0 ; i < 6; i++) {
			System.out.println("Informe o n� "+(i+1)+": ");
			numero[i] = t.nextInt();
		}
		
		//mostrar pares
		for(int i = 0; i < 6; i++) {
			if(numero[i]%2 == 0) {
				qtdNumerosPares++;
				System.out.println("O n�mero "+numero[i]+" � par");
			}
		}
		System.out.println("Total de n�meros Pares: "+qtdNumerosPares);
		
		//mostrar impares
		for(int i = 0; i < 6; i++) {
			if(numero[i]%2 != 0) {
				qtdNumerosImpares++;
				System.out.println("O n�mero "+numero[i]+" � impar");
			}
		}
		System.out.println("Total de n�meros Impares: "+qtdNumerosImpares);
		
	}
}
