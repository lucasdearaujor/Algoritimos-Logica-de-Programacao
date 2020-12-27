import java.util.Scanner;

public class Cap03Exerc09_CalcularAreaTrapezio {


	
	
public static void main(String[] args) {
		// base maior 6
		// base menor = 9
		// altura = 3
		// area já calculada = 22.5 
		// fomula: A = ((base maior + base menor) * altura) /  2;
	
		try (Scanner teclado = new Scanner(System.in)) {
			Double baseMaior = 0.0;
			Double baseMenor = 0.0;
			Double altura = 0.0;
			System.out.println("Informe a base maior: ");
			baseMaior = teclado.nextDouble();
			System.out.println("Informe a base menor: ");
			baseMenor = teclado.nextDouble();
			System.out.println("Informe a altura: ");
			altura = teclado.nextDouble();
			
			System.out.println("A área do Trapezio é: " + ((baseMaior + baseMenor) * altura) / 2 +" m");

		}
	}
}
