package capitulo4estruturacondicional;
import java.util.Scanner;

public class Cap04Exerc08_CalcularReajusteSalarios {

	public static void main(String[] args) {
		
		Double salario = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe seu s�lario: ");
		salario = t.nextDouble();
		
		if(salario <= 300) {
			System.out.println("Seu s�lario com reajuste de 35% �: "+ (salario + (salario * 0.35)));
		} else {
			System.out.println("Seu s�lario com reajuste de 15% �: "+ (salario + (salario * 0.15)));
		}
		
	}
}
