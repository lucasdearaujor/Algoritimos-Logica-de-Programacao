package capitulo3estrutursequencial;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap03Exerc23_CalcularMedidaTerceiroAnguloTriangulo {

	public static void main(String[] args) {
		// soma angulos de um triangulo é 180

		Double angulo1 = 0.0;
		Double angulo2 = 0.0;
		Double angulo3 = 0.0;
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o primeiro angulo: ");
		angulo1 = s.nextDouble();
		System.out.println("Informe o segundo angulo: ");
		angulo2 = s.nextDouble();
		
		angulo3 = 180.00 - (angulo1 + angulo2);
		
		System.out.println("O terceiro angulo é : "+ angulo3);
		
		
	}
}
