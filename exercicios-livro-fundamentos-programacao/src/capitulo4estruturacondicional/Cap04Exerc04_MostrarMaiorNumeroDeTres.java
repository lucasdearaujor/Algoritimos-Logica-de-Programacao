package capitulo4estruturacondicional;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap04Exerc04_MostrarMaiorNumeroDeTres {

	public static void main(String[] args) {
		
		Double n1 = 0.0;
		Double n2 = 0.0;
		Double n3 = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe o primeiro n�mero: ");
		n1 = t.nextDouble();
		System.out.println("Informe o segundo n�mero: ");
		n2 = t.nextDouble();
		System.out.println("Informe o terceiro n�mero: ");
		n3 = t.nextDouble();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O primeiro n�mero � maior! " + n1);
		} else if(n2 > n1 && n2 > n3) {
			System.out.println("O segundo n�mero � maior! " + n2);
		} else if (n3 > n1 && n3 > n2) {
			System.out.println("O terceiro n�mero � maior! " + n3);
		} else {
			System.out.println("Alguns n�meros s�o iguais");
		}
	}
}
