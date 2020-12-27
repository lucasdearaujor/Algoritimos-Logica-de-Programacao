package capitulo4estruturacondicional;
import java.util.Scanner;

public class Cap04Exerc15_CalcularValorInvestimento {

	public static void main(String[] args) {
		Double valor = 0.0;
		Integer tipoInvestimento = 0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe o valor do investimento: ");
		valor = t.nextDouble();
		System.out.println("Informe o tipo de investimento: ");
		tipoInvestimento = t.nextInt();
		
		if(tipoInvestimento == 1) {
			System.out.println("Poupança: O valor corrigido é: R$ "+ (valor + (valor * 0.03)) );
		} else 	if(tipoInvestimento == 2) {
			System.out.println("Fundos Renda Fixa: O valor corrigido é: R$ "+ (valor + (valor * 0.04)) );
		}
	}
}
