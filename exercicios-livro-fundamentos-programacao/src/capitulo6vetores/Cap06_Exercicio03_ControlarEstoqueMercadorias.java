package capitulo6vetores;
import java.util.Scanner;

public class Cap06_Exercicio03_ControlarEstoqueMercadorias {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer codigosProdutos[] = new Integer[10];
		Integer estoquesProdutos[] = new Integer[10];
		Integer codigoCliente = 1;
		Integer codigoProduto = 0;
		Integer quantidadeDesejada = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o codigo do "+(i+1)+" produto");
			codigosProdutos[i] = t.nextInt();
			System.out.println("Digite a quantidade de estoque do produto codigo "+codigosProdutos[i]);
			estoquesProdutos[i] = t.nextInt();
			
		}
		
		while(codigoCliente != 0 ) {
			System.out.println("Digite o codigo do cliente");
			codigoCliente = t.nextInt();
			if(codigoCliente == 0) {
				break;
			}
			System.out.println("Digite o codigo e quantidade do produto vendido: ");
			codigoProduto = t.nextInt();
			quantidadeDesejada = t.nextInt();
			
			boolean produtoExiste = false;
			for(int i = 0; i < 10; i++) {
				if(codigoProduto == codigosProdutos[i]) {
					produtoExiste = true;
					if(estoquesProdutos[i] >= quantidadeDesejada) {
						estoquesProdutos[i] -= quantidadeDesejada; 
						System.out.println("Pedido Atendido. Obrigado e volte sempre");
						
					} else {
						System.out.println("Não temos estoque suficiente desta mercadoria");
					}
					break;
				}else {
					produtoExiste = false;
				}
			}
			
			if(!produtoExiste) {
				System.out.println("Código de produto inexistente");
			}
			
		}
		
		System.out.println("*** Relatorio de Produtos ***");
		for(int i = 0; i < 10; i++) {
			System.out.println("Cod. Produto: "+codigosProdutos[i]+" Estoque: "+estoquesProdutos[i]);
		}
	}
}
