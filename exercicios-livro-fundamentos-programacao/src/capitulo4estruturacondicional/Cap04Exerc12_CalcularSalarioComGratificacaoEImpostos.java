package capitulo4estruturacondicional;
import java.util.Scanner;

public class Cap04Exerc12_CalcularSalarioComGratificacaoEImpostos {

	public static void main(String[] args) {
		
		Double salario = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe seu s�lario: ");
		salario = t.nextDouble();
		
		if(salario <= 350) {
			System.out.println("Gratifica��o R$ 100.00, Salario R$ " + salario + ", imposto R$ "+ (salario * 0.07) + " Valor a receber: R$ "+(100 + salario - (salario * 0.07)));
		} else if(salario <= 600) {
			System.out.println("Gratifica��o R$ 75.00, Salario R$ " + salario + ", imposto R$ "+ (salario * 0.07) + " Valor a receber: R$ "+(75 + salario - (salario * 0.07)));
		} else if(salario <= 900) {
			System.out.println("Gratifica��o R$ 50.00, Salario R$ " + salario + ", imposto R$ "+ (salario * 0.07) + " Valor a receber: R$ "+(50 + salario - (salario * 0.07)));
		} else {
			System.out.println("Gratifica��o R$ 35.00, Salario R$ " + salario + ", imposto R$ "+ (salario * 0.07) + " Valor a receber: R$ "+(35 + salario - (salario * 0.07)));
		}
		
	}
}
