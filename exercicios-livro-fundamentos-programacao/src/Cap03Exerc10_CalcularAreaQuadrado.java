import java.util.Scanner;

public class Cap03Exerc10_CalcularAreaQuadrado {

	public static void main(String[] args) {

		// formula: A = lado * lado
		Scanner teclado = new Scanner(System.in);
		Double lado = 0.0;
		System.out.println("Informe o tamanho do lado: ");
		lado = teclado.nextDouble();
		System.out.println("A área do Quadrado é: " + lado * lado + " m");

	}
}
