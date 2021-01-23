package capitulo6vetores;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap06_Exercicio_DezNumerosOrdemDecrescente {

	public static void main(String[] args) {
		
		//receber 10 numeros e mostralos em ordem decrescente
		
		Scanner t = new Scanner(System.in);
		Integer[] numero = new Integer[10];
		Integer auxiliar = 0;
		
		for(int i = 0 ; i < 10; i++) {
			System.out.println("Informe o n° "+(i+1)+": ");
			numero[i] = t.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 9; j++) {
				if(numero[j] < numero[j+1]) {
					auxiliar = numero[j];
					numero[j] = numero[j+1];
					numero[j+1] = auxiliar;
				}
			}
		}
		
		System.out.println("***Numeros Ordenados***");
		for(int i =0; i < 10; i++) {
			System.out.println(numero[i]);
		}
		
	}
}
