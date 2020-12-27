import java.util.Scanner;

public class Cap03Exerc11_CalcularAreaLosango {


	
	
public static void main(String[] args) {
		
		// formula: A = (diagonal maior * diagonal menor ) / 2;
	
		try (Scanner teclado = new Scanner(System.in)) {
			Double diagonalMenor = 0.0;
			Double diagonalMaior = 0.0;

			System.out.println("Informe o tamanho da diagonal menor: ");
			diagonalMenor = teclado.nextDouble();
			System.out.println("Informe o tamanho da diagonal maior: ");
			diagonalMaior = teclado.nextDouble();
						
			System.out.println("A área do Quadrado é: " + (diagonalMenor * diagonalMaior) / 2 +" m");

		}
	}
}
