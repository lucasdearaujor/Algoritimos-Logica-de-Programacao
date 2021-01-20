package capitulo6vetores;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import capitulo5estruturaderepeticao.Cap05Exerc12_MostrarQtdNumerosPrimos;

public class Cap06_Exercicio12_VetorNumeros {

	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		Integer numeros[] = new Integer[10];
		Integer soma = 0;
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println("Digite o "+(i+1)+"° número");
			numeros[i] = t.nextInt();
		}
		
		System.out.println("Os números digitados foram:");
		for(int i=0; i<5; i++) {
			System.out.print(numeros[i]);
			soma += numeros[i];
			if(i < 4) {
				System.out.print(" + ");
			} else {
				System.out.print(" = "+soma);
			}
			
		}
		
	}
}
