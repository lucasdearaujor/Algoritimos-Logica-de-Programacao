package capitulo4estruturacondicional;
import java.util.Scanner;

public class Cap04Exerc08_CalcularReajusteSalarios {

	public static void main(String[] args) {
		
		Double salario = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe seu sálario: ");
		salario = t.nextDouble();
		
		if(salario <= 300) {
			System.out.println("Seu sálario com reajuste de 35% é: "+ (salario + (salario * 0.35)));
		} else {
			System.out.println("Seu sálario com reajuste de 15% é: "+ (salario + (salario * 0.15)));
		}
		
	}
}
