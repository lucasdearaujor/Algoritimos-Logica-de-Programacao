package capitulo4estruturacondicional;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap04Exerc03_MostrarMaiorNumeroDeDois {

	public static void main(String[] args) {
		
		Double n1 = 0.0;
		Double n2 = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe o primeiro n�mero: ");
		n1 = t.nextDouble();
		System.out.println("Informe o segundo n�mero: ");
		n2 = t.nextDouble();
		
		if(n1 > n2) {
			System.out.println("O primeiro n�mero � maior! " + n1);
		} else if(n2 > n1) {
			System.out.println("O segundo n�mero � maior! "+n2);
		} else {
			System.out.println("S�o iguais!");
		}
	}
}
