import java.util.Scanner;

public class Cap03Exerc06_ComissaoFuncionario {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Double preco = 0.0;
		Double desconto = 10.0;
		System.out.println("Informe preço do produto: ");
		preco = teclado.nextDouble();

		System.out.println("Preço com desconto de " + desconto + "%: R$ " + (preco - preco * (desconto / 100)));

	}
}
