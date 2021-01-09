package capitulo5estruturaderepeticao;
import java.util.Scanner;

import javax.swing.plaf.multi.MultiPopupMenuUI;

public class Cap05Exerc19_CompraVendaAcoes {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		String tipoAcao = "";
		Double precoDeCompra = 0.0;
		Double precoDeVenda = 0.0;
		Integer qtdAcoesLucroSuperiorMil = 0;
		Integer qtdAcoesLucroInferiorDuzentos = 0;
		Double lucroTotal = 0.0;
		
		System.out.println("*** Para encerrar a pesquisa basta informa uma idade negativa ***");
		while(!tipoAcao.equalsIgnoreCase("F")) {
			System.out.println("Informe o tipo da ação: ");
			tipoAcao = t.next();
			if(tipoAcao.equalsIgnoreCase("F")) {
				break;
			}
			System.out.println("Informe o preço de compra: ");
			precoDeCompra = t.nextDouble();
			System.out.println("Informe o preço de venda: ");
			precoDeVenda = t.nextDouble();
			
			System.out.println("Lucro: R$ "+ (precoDeVenda - precoDeCompra));
			lucroTotal += precoDeVenda - precoDeCompra;
			
			if(precoDeVenda - precoDeCompra > 1000) {
				qtdAcoesLucroSuperiorMil++;				
			} else if(precoDeVenda - precoDeCompra < 200) {
				qtdAcoesLucroInferiorDuzentos++;
			}
			
		}
		
		System.out.println("Quantidadede de ações com lucro superior R$ 1.000,00: "+ qtdAcoesLucroSuperiorMil);
		System.out.println("Quantidade de ações com lucro inferior a R$ 200,00: "+qtdAcoesLucroInferiorDuzentos);
		System.out.println("Lucro da empresa: "+lucroTotal);
		
	}
}
