package capitulo6vetores;

import java.util.Scanner;

public class Cap06_Exercicio09_Produtos {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		Integer codigosProdutos[] = new Integer[10];
		String nomesProdutos[] = new String[10];
		Double precosProdutos[] = new Double[10];
		Double percentualAumento = 0.0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o codigo do " + (i + 1) + "° produto");
			codigosProdutos[i] = t.nextInt();
			System.out.println("Digite o nome do " + (i + 1) + "º produto");
			nomesProdutos[i] = t.next();
			System.out.println("Digite o preço do produto " + nomesProdutos[i]);
			precosProdutos[i] = t.nextDouble();

		}

		for (int i = 0; i < 10; i++) {
			if (codigosProdutos[i] % 2 == 0 && precosProdutos[i] > 1000.0) {
				percentualAumento = 20.0;
			} else if (codigosProdutos[i] % 2 == 0) {
				percentualAumento = 15.0;
			} else if (precosProdutos[i] > 1000.0) {
				percentualAumento = 10.0;
			}
			
			System.out.println(codigosProdutos[i]+" "+nomesProdutos[i]+" R$ "+precosProdutos[i]);
		}

	}
}
