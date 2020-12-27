package capitulo3estrutursequencial;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Cap03Exerc16_CalcularValorHipotenusaTriangulo {

	public static void main(String[] args) {
		// formula: https://brasilescola.uol.com.br/matematica/teorema-pitagoras.htm
		// a² = b² + c²
		
		Double a = 0.0; //hipotenusa
		Double b = 0.0; // cateto 1
		Double c = 0.0; // cateto 2
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor do primeiro cateto: ");
		b = teclado.nextDouble();
		System.out.println("Informe o valor do segundo cateto: ");
		c = teclado.nextDouble();
		
		a = (Math.sqrt((b * b) + (c * c)));
		
		System.out.println("A hipotenusa é: "+ a);
		

	}
}
