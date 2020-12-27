import java.util.Scanner;

public class Cap03Exerc05_PrecoProdutoComDesconto {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Double salarioFixo = 0.0;
		Double valorVendas = 0.0;
		Double salarioFinal = 0.0;
		System.out.println("Informe o Salario Fixo: ");
		salarioFixo = teclado.nextDouble();
		System.out.println("Informe o valor das vendas: ");
		valorVendas = teclado.nextDouble();
		salarioFinal = salarioFixo + (valorVendas * 0.04);
		System.out.println("O salario final é: " + salarioFinal);

	}
}
