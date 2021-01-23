package capitulo6vetores;
import java.util.Scanner;

public class Cap06_Exercicio06_VendasLoja {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		String nomesVendedores[] = new String[10];
		Double totaisVendasVendedores[] = new Double[10];
		Double percentualComissaoVendedores[] = new Double[10];
		Double comissoesVendedores[] = new Double[10];
		Double totalVendasTodos = 0.0;
		Double maiorValorAReceber = 0.0;
		Integer posicaoMairoValorAReceber = 0;
		Double menorValorAReceber = 0.0;
		Integer posicaoMenorValorAReceber = 0;
		
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite o nome do "+(i+1)+"° vendedor:");
			nomesVendedores[i] = t.next();
			System.out.println("Digite o total vendido pelo "+nomesVendedores[i]);
			totaisVendasVendedores[i] = t.nextDouble();
			System.out.println("Digite o percentual de comissão do "+nomesVendedores[i]);
			percentualComissaoVendedores[i] = t.nextDouble();
			
			totalVendasTodos += totaisVendasVendedores[i];
			comissoesVendedores[i] = (totaisVendasVendedores[i] * (percentualComissaoVendedores[i] / 100));
			if(i == 0) { // inicializar menor e maior valor
				maiorValorAReceber = comissoesVendedores[i];
				posicaoMairoValorAReceber = i;
				menorValorAReceber = comissoesVendedores[i];
				posicaoMenorValorAReceber = i;
					
			} else {
				 if(comissoesVendedores[i] > maiorValorAReceber) {
						maiorValorAReceber = comissoesVendedores[i];
						posicaoMairoValorAReceber = i;
				 }
				 if (comissoesVendedores[i] < menorValorAReceber) {
					menorValorAReceber = comissoesVendedores[i];
					posicaoMenorValorAReceber = i;
				 }
			}
								
		}
		
		System.out.println("***Nome e valores de comissão ***");
		for(int i = 0; i < 4; i++) {
			System.out.println(nomesVendedores[i] + " R$ "+comissoesVendedores[i]);
		}
		System.out.println("***Total das vendas de todos os vendedores ***");
		System.out.println("R$ "+totalVendasTodos);
		System.out.println("*** Maior valor a receber e o nome de quem o receberá");
		System.out.println("R$ "+comissoesVendedores[posicaoMairoValorAReceber]+" "+nomesVendedores[posicaoMairoValorAReceber]);
		System.out.println("*** Menor valor a receber e o nome de quem o receberá");
		System.out.println("R$ "+comissoesVendedores[posicaoMenorValorAReceber]+" "+nomesVendedores[posicaoMenorValorAReceber]);
		
	}
}
