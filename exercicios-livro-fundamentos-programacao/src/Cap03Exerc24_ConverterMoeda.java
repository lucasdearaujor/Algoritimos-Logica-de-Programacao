import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap03Exerc24_ConverterMoeda {

	public static void main(String[] args) {

		Double dinheiro = 0.0;
	
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o valor em reais: ");
		dinheiro = s.nextDouble();
		
		System.out.println("O valor em D�lar � : "+ 1.8 * dinheiro);
		System.out.println("O valor em Marco Alem�o � : "+ 2 * dinheiro);
		System.out.println("O valor em Libra Estelina � : "+ 1.57 * dinheiro);
		
		
	}
}
