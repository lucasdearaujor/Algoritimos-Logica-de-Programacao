package capitulo4estruturacondicional;
import java.util.Scanner;

public class Cap04Exerc07_CalcularReajusteSalarios {

	public static void main(String[] args) {
		
		Double salario = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe seu sálario: ");
		salario = t.nextDouble();
		
		if(salario < 500) {
			System.out.println("Seu sálario com reajuste de 30% é: "+ (salario + (salario * 0.30)));
		} else {
			System.out.println("Você não tem direito ao reajuste!");
		}
		
	}
}
