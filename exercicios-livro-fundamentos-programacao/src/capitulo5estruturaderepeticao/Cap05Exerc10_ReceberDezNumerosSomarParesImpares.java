package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc10_ReceberDezNumerosSomarParesImpares {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Double somaPares = 0.0;
		Double somaPrimos = 0.0;
		
		System.out.println("***INFORME DEZ NUMEROS***");
		for(int i = 1; i <= 10; i++) {
			Double numero = 0.0;
			boolean numeroPrimo = false;
			System.out.println("Informe o n° "+i+": ");
			numero = t.nextDouble();
			
			if(numero%2 == 0) {
				somaPares += numero;
			} 
			
			for(int j = 2; j < numero; j++) {
				if(numero%j == 0) {
					numeroPrimo = false;
					break;
				}
				numeroPrimo = true;
			}
			
			if(numeroPrimo == true) {
				somaPrimos += numero;
			}
			
		}
		
		System.out.println("***RESULTADO***");
		System.out.println("Soma dos números Pares: "+ somaPares);
		System.out.println("Soma dos números Primos: "+ somaPrimos);
	}
}
