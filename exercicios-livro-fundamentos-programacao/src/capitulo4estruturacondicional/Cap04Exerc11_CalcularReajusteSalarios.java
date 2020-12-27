package capitulo4estruturacondicional;
import java.util.Scanner;

public class Cap04Exerc11_CalcularReajusteSalarios {

	public static void main(String[] args) {
		
		Double salario = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe seu sálario: ");
		salario = t.nextDouble();
		
		if(salario <= 300) {
			System.out.println("Aumento de 15% R$ "+ (salario * 0.15) + " Novo salário: R$ "+(salario + (salario * 0.15)));
		} else if(salario <= 600) {
			System.out.println("Aumento de 10% R$ "+ (salario * 0.10) + " Novo salário: R$ "+(salario + (salario * 0.10)));
		} else if(salario <= 900) {
			System.out.println("Aumento de 5% R$ "+ (salario * 0.05) + " Novo salário: R$ "+(salario + (salario * 0.05)));
		} else {
			System.out.println("Aumento de 0% R$ "+ (salario * 0.00) + " Novo salário: R$ "+(salario + (salario * 0.00)));
		}
		
	}
}
