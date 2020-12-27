package capitulo3estrutursequencial;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Cap03Exerc19_PotenciaIluminacaoNecessarioParaUmComodo {

	public static void main(String[] args) {
		// formula area = l * l; // supondo que o comodo seja um quadrado
		
		Double l = 0.0;  
		Double a = 0.0;
		Double potencia = 0.0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe tamanho de algum lado: ");
		l = teclado.nextDouble();
		
		a = l * l;
		potencia = a * 18.0;
		System.out.println("Potencia necessaria: " + potencia);
		

	}
}
