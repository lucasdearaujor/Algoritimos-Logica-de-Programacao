package capitulo3estrutursequencial;
import java.util.Scanner;

public class Cap03Exerc08_CalcularPesoEmGramas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Double peso = 0.0;
		System.out.println("Informe o peso: ");
		peso = teclado.nextDouble();

		System.out.println("Peso em gramas " + (peso * 1000));

	}
}
