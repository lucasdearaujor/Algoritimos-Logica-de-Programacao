import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap03Exerc21_CalcularSalarioReceberHorasTrabalhadas {

	public static void main(String[] args) {

		// hora trabalhada = 1/8 do salario minimo

		Double salarioMinimo = 0.0;
		Double horasTrabalhadas = 0.0;
		Double valorHoraTrabalhada = 0.0;
		Double horasExtrasTrabalhadas = 0.0;
		Double valorHoraExtraTrabalhada = 0.0;
		Double salarioBrunto = 0.0;
		Double valorHorasExtrasReceber = 0.0;
		Double salarioReceber = 0.0;

		Scanner t = new Scanner(System.in);
		System.out.println("Informe o valor do salário minimo: ");
		salarioMinimo = t.nextDouble();
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		horasTrabalhadas = t.nextDouble();
		System.out.println("Informe a quantidade de horas extras trabalhadas: ");
		horasExtrasTrabalhadas = t.nextDouble();

		valorHoraTrabalhada = 1 * (salarioMinimo / 8);
		valorHoraExtraTrabalhada = 1 * (salarioMinimo / 4);
		salarioBrunto = horasTrabalhadas * valorHoraTrabalhada;
		valorHorasExtrasReceber = horasExtrasTrabalhadas * valorHoraExtraTrabalhada;
		salarioReceber = salarioBrunto + valorHorasExtrasReceber;

		System.out.println("Valor da hora trabalhada: R$ " + valorHoraTrabalhada);
		System.out.println("Valor da hora extra trabalhada: R$ " + valorHoraExtraTrabalhada);
		System.out.println("Salario Bruno: R$ " + salarioBrunto);
		System.out.println("Valor a receber horas extras: R$ " + valorHorasExtrasReceber);
		System.out.println("Salario a receber: R$ " + salarioReceber);

	}
}
