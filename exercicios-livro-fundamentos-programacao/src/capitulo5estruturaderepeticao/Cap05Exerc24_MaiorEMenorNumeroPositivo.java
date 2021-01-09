package capitulo5estruturaderepeticao;
import java.util.Scanner;

import javax.swing.plaf.multi.MultiPopupMenuUI;

public class Cap05Exerc24_MaiorEMenorNumeroPositivo {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer numero = 0;
		Integer menorNumero = 0;
		Integer maiorNumero = 0;
		
		do {
			System.out.println("Informe um número: ");
			numero = t.nextInt();
			
			if(numero > 0) {
				if(numero < menorNumero || menorNumero == 0) {
					menorNumero = numero;
				}
				if(numero > maiorNumero) {
					maiorNumero = numero;
				}
				
			} else if(numero == 0) {
				System.out.println("Entrada de dados encerrada");
				break;
			} else if(numero < 0) {
				System.out.println("Número invalido");
			}
			
		} while (numero != 0);
		
		System.out.println("Menor número: "+ menorNumero);
		System.out.println("Maior número: "+ maiorNumero);
		
		
	}
}
