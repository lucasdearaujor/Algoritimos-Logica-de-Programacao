package capitulo4estruturacondicional;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap04Exerc03_MostrarMaiorNumeroDeDois {

	public static void main(String[] args) {
		
		Double n1 = 0.0;
		Double n2 = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		n1 = t.nextDouble();
		System.out.println("Informe o segundo número: ");
		n2 = t.nextDouble();
		
		if(n1 > n2) {
			System.out.println("O primeiro número é maior! " + n1);
		} else if(n2 > n1) {
			System.out.println("O segundo número é maior! "+n2);
		} else {
			System.out.println("São iguais!");
		}
	}
}
