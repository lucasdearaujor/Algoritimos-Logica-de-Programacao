package capitulo3estrutursequencial;
import java.util.Scanner;

public class Cap03Exerc13_MostrarTabuadaDoNumeroDigitado {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Integer numero = 0;

		System.out.println("Informe um número para visualizar sua tabuada: ");
		numero = teclado.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
	}
}
