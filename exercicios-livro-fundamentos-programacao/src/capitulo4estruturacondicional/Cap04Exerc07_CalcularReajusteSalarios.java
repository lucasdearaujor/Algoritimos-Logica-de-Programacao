package capitulo4estruturacondicional;
import java.util.Scanner;

public class Cap04Exerc07_CalcularReajusteSalarios {

	public static void main(String[] args) {
		
		Double salario = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe seu s�lario: ");
		salario = t.nextDouble();
		
		if(salario < 500) {
			System.out.println("Seu s�lario com reajuste de 30% �: "+ (salario + (salario * 0.30)));
		} else {
			System.out.println("Voc� n�o tem direito ao reajuste!");
		}
		
	}
}
