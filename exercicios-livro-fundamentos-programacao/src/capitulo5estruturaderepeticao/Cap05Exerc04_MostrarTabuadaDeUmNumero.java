package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc04_MostrarTabuadaDeUmNumero {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		int numero = 0;
		System.out.println("Informe um numero: ");
		numero = t.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(numero+" x "+i+" = "+ numero*i);
		}
		
	}
}
