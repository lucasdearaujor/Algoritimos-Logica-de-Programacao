package capitulo5estruturaderepeticao;
import java.util.Scanner;

import javax.swing.plaf.multi.MultiPopupMenuUI;

public class Cap05Exerc20_MediaAritimeticaOuPonderada {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer opcao = 0;
		System.out.println("********************");
		System.out.println("1. Media aritmética");
		System.out.println("2. Media ");
		System.out.println("3. Sair");
		System.out.println("********************");
		opcao = t.nextInt();
		
		switch (opcao) {
			case 1:
				Double somaNotas = 0.0;
				System.out.println("***Media Aritimetica 2 notas***");
				System.out.println("Informe a nota 1: ");
				somaNotas += t.nextDouble();
				System.out.println("Informe a nota 2:");
				somaNotas += t.nextDouble();
				System.out.println("A média é: "+ somaNotas / 2);
				break;
			case 2:
				Double nota1 = 0.0;
				Integer peso1 = 0;
				Double nota2 = 0.0;
				Integer peso2 = 0;
				Double nota3 = 0.0;
				Integer peso3 = 0;
				
				System.out.println("***Média ponderada 3 notas***");
				System.out.println("Informe a nota 1: ");
				nota1 = t.nextDouble();
				System.out.println("Informe a peso 1: ");
				peso1 = t.nextInt();
				
				System.out.println("Informe a nota 2: ");
				nota2 = t.nextDouble();
				System.out.println("Informe a peso 2: ");
				peso2 = t.nextInt();
				
				System.out.println("Informe a nota 3: ");
				nota3 = t.nextDouble();
				System.out.println("Informe a peso 3: ");
				peso3 = t.nextInt();
				
				Double somaTresNotas = (nota1 * peso1) + ( nota2 * peso2) + (nota3 * peso3);
				Integer somaTresPesos = peso1 + peso2 + peso3;
				
				System.out.println("A media ponderada é: "+ somaTresNotas / somaTresPesos );
				break;
			case 3:
				System.out.println("Sistema fechado!");
				break;
			default:
				System.out.println("Opção invalida!");
				break;
		}
		
	}
}
