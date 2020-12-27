package capitulo4estruturacondicional;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap04Exerc06_MenuOperacoesDesejadas2 {

	public static void main(String[] args) {
		
		Double n1 = 0.0;
		Double n2 = 0.0;
		Integer menu = 0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe o primeiro n�mero: ");
		n1 = t.nextDouble();
		System.out.println("Informe o segundo n�mero: ");
		n2 = t.nextDouble();
		
		System.out.println("***********************************");
		System.out.println("1 - O primeiro n�mero elevado ao segundo n�mero");
		System.out.println("2 - Raiz quadrada de cada um dos n�meros");
		System.out.println("3 - Raiz c�bica de cada um dos n�meros");
		System.out.print("***********************************");
		System.out.print("\nInforme o n�mero da opera��o desejada:");
		menu = t.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("O primeiro n�mero elevado ao segundo n�mero: "+ Math.pow(n1, n2));
			break;
		case 2:
				System.out.println("Raiz quadrada de cada um dos n�meros: N1: "+ Math.sqrt(n1) + " N2: "+ Math.sqrt(n2));
			break;
		case 3:
			System.out.println("Raiz c�bica de cada um dos n�meros N1: "+ Math.cbrt(n1) + " N2: "+ Math.cbrt(n2));
			break;
		default:
			System.out.println("Op��o invalida!");
			break;
		}
		
	}
}
