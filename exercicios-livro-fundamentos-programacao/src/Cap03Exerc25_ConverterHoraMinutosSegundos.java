import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap03Exerc25_ConverterHoraMinutosSegundos {

	public static void main(String[] args) {
		
		Integer hora = 0;
		Integer minutos = 0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe a hora: ");
		hora = t.nextInt();
		System.out.println("Informe os minutos: ");
		minutos = t.nextInt();
		
		System.out.println("Hora informada em minutos: " + hora * 60);
		System.out.println("Total de minutos: " + ((hora * 60) + minutos));
		System.out.println("Total de minutos em segundos: " + ((hora * 60) + minutos) * 60);
		
		
	}
}
