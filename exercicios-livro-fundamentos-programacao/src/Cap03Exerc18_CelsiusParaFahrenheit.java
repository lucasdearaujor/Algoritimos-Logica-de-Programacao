import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Cap03Exerc18_CelsiusParaFahrenheit {

	public static void main(String[] args) {
		// formula F = c * 1.8 + 32;
		
		Double c = 0.0;  
		Double f = 0.0; 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a temperatura em Celsius: ");
		c = teclado.nextDouble();
		
		f = c * 1.8 + 32;
		System.out.println("Temperatura em Fahrenheit: " + f);
		

	}
}
