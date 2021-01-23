package capitulo6vetores;
import java.util.Scanner;

public class Cap06_Exercicio16_Produtos {

	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		String nomesProdutos[] = new String[5];
		Double precosProdutos[] = new Double[5];
		Integer qtdProdutosPrecoInferiorCinquenta = 0;
		String nomesProdutosPrecosEntreCinquentaECem = "";
		Double somaProdutosPrecoSuperiorCem = 0.0;
		Integer qtdProdutosPrecoSuperiorCem = 0;
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println("Digite o nome do "+(i+1)+"° produto");
			nomesProdutos[i] = t.next();
			System.out.println("Digita o preço do produto "+nomesProdutos[i]);
			precosProdutos[i] = t.nextDouble();
			
			if(precosProdutos[i] < 50.0) {
				qtdProdutosPrecoInferiorCinquenta++;
			} else if(precosProdutos[i] <= 100.0) {
				nomesProdutosPrecosEntreCinquentaECem += nomesProdutos[i] + ", ";
			} else {
				somaProdutosPrecoSuperiorCem += precosProdutos[i];
				qtdProdutosPrecoSuperiorCem++;
			}
			
		}
		
		System.out.println("Quantidade de produtos com preço inferior a R$ 50,00: "+ qtdProdutosPrecoInferiorCinquenta);
		System.out.println("Nome produtos com preço entre R$ 50,00 e R$ 100,00: "+nomesProdutosPrecosEntreCinquentaECem);
		System.out.println("Média de preços dos produtos com preço superior a R$ 100,00: "+ somaProdutosPrecoSuperiorCem / qtdProdutosPrecoSuperiorCem);
		
		
		
	}
		
}
