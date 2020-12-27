package capitulo3estrutursequencial;
import java.util.Scanner;

public class Cap03Exerc01_SubtracaoNumeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Integer n1 = 0, n2 = 0;

		System.out.println("Digite um numero: ");
		n1 = teclado.nextInt();
		System.out.println("Digte outro numero: ");
		n2 = teclado.nextInt();

		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));

	}

}
