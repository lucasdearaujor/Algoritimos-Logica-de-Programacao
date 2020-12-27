import java.util.Scanner;

public class Cap03Exerc07_CalcularNovoPeso {


	
	
public static void main(String[] args) {
		
		try (Scanner teclado = new Scanner(System.in)) {
			Double peso = 0.0;
			System.out.println("Informe o peso: ");
			peso = teclado.nextDouble();
			System.out.println("Peso se engordar 15% " + (peso + peso * 0.15));
			System.out.println("Peso se emagrecer 20% " + (peso - peso * 0.20));

		}
	}
}
