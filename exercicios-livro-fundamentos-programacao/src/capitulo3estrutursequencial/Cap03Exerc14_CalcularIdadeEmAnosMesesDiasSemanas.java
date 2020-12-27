package capitulo3estrutursequencial;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Cap03Exerc14_CalcularIdadeEmAnosMesesDiasSemanas {

	public static void main(String[] args) {
		
		Integer anoNascimento = 0;
		Calendar calendar = Calendar.getInstance();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu ano de nascimento: ");
		anoNascimento = teclado.nextInt();
		
		System.out.println("Sua idade em anos: " + (calendar.get(Calendar.YEAR) - anoNascimento));
		System.out.println("Sua idade em meses: " + (calendar.get(Calendar.YEAR) - anoNascimento) * 12);
		System.out.println("Sua idade em dias: " + (calendar.get(Calendar.YEAR) - anoNascimento) * 365);
		System.out.println("Sua idade em semanas: " + ((calendar.get(Calendar.YEAR) - anoNascimento) * 12) * 4);

	}
}
