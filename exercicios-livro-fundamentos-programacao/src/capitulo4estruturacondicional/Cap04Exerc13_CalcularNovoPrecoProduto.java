package capitulo4estruturacondicional;
import java.util.Scanner;

public class Cap04Exerc13_CalcularNovoPrecoProduto {

	public static void main(String[] args) {
		
		Double precoProduto = 0.0;
		Double novoPreco = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe o preço do produto: ");
		precoProduto = t.nextDouble();
		
		if(precoProduto <= 50) {
			novoPreco = precoProduto + (precoProduto * 0.05);
			System.out.println("Aumento 5% - Novo preço: R$ "+ novoPreco + " Classifição: " + verificarClassificacao(novoPreco));
		} else if(precoProduto <= 100) {
			novoPreco = precoProduto + (precoProduto * 0.10);
			System.out.println("Aumento 10% - Novo preço: R$ "+ novoPreco + " Classifição: " + verificarClassificacao(novoPreco));
		} else {
			novoPreco = precoProduto + (precoProduto * 0.15);
			System.out.println("Aumento 15% - Novo preço: R$ "+ novoPreco + " Classifição: " + verificarClassificacao(novoPreco));
		}
	}
	
	public static String verificarClassificacao(Double preco) {
		if(preco <= 80.00) {
			return "Barato";
		} else if(preco <= 120.00) {
			return "Normal";
		} else if(preco <= 200.00) {
			return "Caro";
		} else {
			return "Muito Caro";
		}
	}
}
