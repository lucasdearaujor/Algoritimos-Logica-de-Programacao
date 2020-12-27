import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Cap03Exerc17_CalcularComprimentoAreaVolumeEsfera {

	public static void main(String[] args) {
		// formula comprimento: C = 2 * PI * R;
		// formula area: A = PI * R�
		// formula volume: V = 3/4 * PI * R�.
		
		Double r = 0.0;  
		Double c = 0.0; 
		Double a = 0.0; 
		Double v = 0.0; 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o raio da esfera: ");
		r = teclado.nextDouble();
		
		c = 2 * Math.PI * r;
		a = Math.PI * Math.pow(r, 2);
		v = (4 * Math.PI * Math.pow(r, 3)) / 3;
		
		System.out.println("O comprimeiro da esfera �: "+ c);
		System.out.println("A �rea da esfera �: "+ a);
		System.out.println("O volume da esfera �: "+ v);
		

	}
}
