import java.util.Scanner;

public class Cap03Exerc03_DivisaoNumeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Integer n1 = 0, n2 = 0;

		System.out.println("Informe o primeiro numero: ");
		n1 = teclado.nextInt();
		System.out.println("Informe o segundo numero: ");
		n2 = teclado.nextInt();

		if (n2 != 0) {
			System.out.println(n1 + " / " + n2 + " = " + n1 / n2);
		} else {
			System.out.println("Divisão por zero");
		}

	}
}
