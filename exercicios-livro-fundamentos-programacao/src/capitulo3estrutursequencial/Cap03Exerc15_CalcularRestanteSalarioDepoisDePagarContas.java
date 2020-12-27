package capitulo3estrutursequencial;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Cap03Exerc15_CalcularRestanteSalarioDepoisDePagarContas {

	public static void main(String[] args) {
		
		Double salario = 0.0;
		Double conta1 = 0.0;
		Double conta2 = 0.0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu salário: ");
		salario = teclado.nextDouble();
		System.out.println("Informe o valor da primeira conta atrasada: ");
		conta1 = teclado.nextDouble();
		System.out.println("Informe o valor da segunda conta atrasada: ");
		conta2 = teclado.nextDouble();
		conta1 = conta1 + (conta1 * 0.02);
		conta2 = conta2 + (conta2 * 0.02);
		System.out.println("O valor restante do salário é: R$ "+ (salario - (conta1 + conta2)));
		System.out.println("Conta 1 com juros: R$ "+conta1);
		System.out.println("Conta 2 com juros: R$ "+conta2);

	}
}
