package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc05_MostrarTabuadaDeUmADez {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		int numero = 0;
		System.out.println("*** TABUADA DE 1 A 10 ***");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("*** TABUADA DE "+i+" ***");
			for(int j = 1; j <= 10; j++) {
				System.out.println(i+" x "+j+" = "+ i*j);
			}
			
		}
		
	}
}
