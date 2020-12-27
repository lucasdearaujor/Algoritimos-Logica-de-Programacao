import java.util.Scanner;

public class Cap03Exerc04_MediaNotasPesos {


	
	
public static void main(String[] args) {
		
		try (Scanner teclado = new Scanner(System.in)) {
			Integer n1 = 0, n2 = 0;
			
			System.out.println("Informe a primeira nota: ");
			n1 = teclado.nextInt();
			n1 = n1 * 2;
			System.out.println("Informe a segunda nota: ");
			n2 = teclado.nextInt();
			n2 = n2 * 3;
			
			System.out.println("Média Notas: "+ (n1 + n2) / 2);

		}
	}
}
