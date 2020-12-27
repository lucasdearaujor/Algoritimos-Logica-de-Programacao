package capitulo3estrutursequencial;
import java.util.Scanner;

public class Cap03Exerc12_QuantidadeDeSalriosMinimos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Double salarioMinimo = 0.0;
		Double salarioFuncionario = 0.0;

		System.out.println("Informe o valor do Salario Mínimo: ");
		salarioMinimo = teclado.nextDouble();
		System.out.println("Informe o valor do Salario do Funcionario: ");
		salarioFuncionario = teclado.nextDouble();

		if (salarioFuncionario >= salarioMinimo) {
			System.out.println("O funcionario ganha: " + salarioFuncionario / salarioMinimo + " salarios minimos");
		} else {
			System.out.println("O funcionario ganha menos de um salario minimo.");
		}
	}
}
