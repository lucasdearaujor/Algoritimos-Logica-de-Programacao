package capitulo4estruturacondicional;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap04Exerc05_MenuOperacoesDesejadas {

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
		System.out.println("1 - M�dia entre os n�meros digitados");
		System.out.println("2 - Difere�a do maior pelo menor");
		System.out.println("3 - Produto entre os n�mero digitados");
		System.out.println("4 - Divis�o do primeiro pelo segundo");
		System.out.print("***********************************");
		System.out.print("\nInforme o n�mero da opera��o desejada:");
		menu = t.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("M�dia entre n�meros digitados: "+ (n1 + n2)/ 2);
			break;
		case 2:
			if(n1 > n2) {
				System.out.println("Diferen�a do Maior pelo menor: "+ (n1 - n2));
			} else if(n2 > n1) {
				System.out.println("Diferen�a do Maior pelo menor: "+ (n2 - n1));
			} else {
				System.out.println("S�o iguais");
			}
			break;
		case 3:
			System.out.println("Produto entre n�meros: "+ n1 * n2);
			break;
		case 4: 
			if(n2 != 0) {
				System.out.println("Divs�o do primeiro pelo segundo: "+ n1 / n2);
			} else {
				System.out.println("Divis�o por zero!");
			}
			break;
		default:
			System.out.println("Op��o invalida!");
			break;
		}
		
	}
}
