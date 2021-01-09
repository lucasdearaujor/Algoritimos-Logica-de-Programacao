package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc12_MostrarQtdNumerosPrimos {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer qtdPrimos = 0;
		
		System.out.println("***INFORME DEZ NUMEROS***");
		for(int i = 1; i <= 10; i++) {
			Integer numero = 0;
			boolean numeroPrimo = false;
			System.out.println("Informe o n° "+i+": ");
			numero = t.nextInt();
			
			for(int j = 2; j < numero; j++) {
				if(numero%j == 0) {
					numeroPrimo = false;
					break;
				}
				numeroPrimo = true;
			}
			
			if(numeroPrimo == true) {
				qtdPrimos++;
			}
			
		}
		
		System.out.println("Quantidade de números Primos: "+ qtdPrimos);
	}
}
