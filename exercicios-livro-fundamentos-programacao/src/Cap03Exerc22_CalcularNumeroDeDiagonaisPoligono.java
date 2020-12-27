import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap03Exerc22_CalcularNumeroDeDiagonaisPoligono {

	public static void main(String[] args) {
		// formula ND = N * (N - 3) / 2

		Double numeroLadosPoligono = 0.0;
		Double numeroDiagonais = 0.0;
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o número de Lados do Polígono: ");
		numeroLadosPoligono = s.nextDouble();
		
		numeroDiagonais = numeroLadosPoligono * (numeroLadosPoligono - 3) / 2;
		
		System.out.println("O numero de diagonais do Polígono é : "+ numeroDiagonais);
		
		
	}
}
