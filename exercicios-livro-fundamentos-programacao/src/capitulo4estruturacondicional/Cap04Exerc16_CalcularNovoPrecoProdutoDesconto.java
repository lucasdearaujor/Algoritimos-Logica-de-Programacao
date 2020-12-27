package capitulo4estruturacondicional;
import java.util.Scanner;

public class Cap04Exerc16_CalcularNovoPrecoProdutoDesconto {

	public static void main(String[] args) {
		
		Double precoProduto = 0.0;
		Double novoPreco = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe o preço do produto: ");
		precoProduto = t.nextDouble();
		
		if(precoProduto <= 30) {
			System.out.println("Sem descontos");
		} else if(precoProduto <= 100) {
			novoPreco = precoProduto - (precoProduto * 0.10);
			System.out.println("Desconto de 10% - Novo preço: R$ "+ novoPreco);
		} else {
			novoPreco = precoProduto - (precoProduto * 0.15);
			System.out.println("Aumento 15% - Novo preço: R$ "+ novoPreco);
		}
	}
}
