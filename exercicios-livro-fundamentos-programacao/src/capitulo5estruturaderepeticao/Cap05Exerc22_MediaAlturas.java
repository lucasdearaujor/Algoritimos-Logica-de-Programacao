package capitulo5estruturaderepeticao;
import java.util.Scanner;

import javax.swing.plaf.multi.MultiPopupMenuUI;

public class Cap05Exerc22_MediaAlturas {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer idade = 0;
		Double altura = 0.0;
		Double somaAlturas = 0.0;
		Integer qtdPessoas = 0;
		
		System.out.println("*** Informe as idades e para encerrar um numero menor ou igual a zero ***");
		do {
			System.out.println("Informe a idade: ");
			idade = t.nextInt();
			if(idade <= 0) {
				break;
			}
			System.out.println("Informe a altura: ");
			altura = t.nextDouble();
			
			if(idade > 50) {
				somaAlturas += altura;
				qtdPessoas++;
			}
			
		} while (idade > 0);

		System.out.println("A media das alturas da pessoas com idade superior a 50 anos é: "+ (qtdPessoas > 0 ? somaAlturas / qtdPessoas : 0));
	}
}
