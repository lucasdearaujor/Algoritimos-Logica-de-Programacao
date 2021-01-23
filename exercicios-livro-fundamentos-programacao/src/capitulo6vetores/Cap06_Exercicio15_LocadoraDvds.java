package capitulo6vetores;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import capitulo5estruturaderepeticao.Cap05Exerc12_MostrarQtdNumerosPrimos;

public class Cap06_Exercicio15_LocadoraDvds {

	public static void main(String[] args) {
		
		
		Scanner t = new Scanner(System.in);
		String nomeClientes[] = new String[8];
		Integer qtdDvsLocados[] = new Integer[8];
		
		for(int i = 0 ; i < 8; i++) {
			System.out.println("Digite o nome do "+(i+1)+"° cliente");
			nomeClientes[i] = t.next();
			System.out.println("Digite o a quantidade de locações do cliente "+nomeClientes[i]);
			qtdDvsLocados[i] = t.nextInt();
		}
		
		for(int i = 0 ; i < 8; i++) {
			System.out.println("Nome: "+nomeClientes[i]+" - Qtd. Locações: "+qtdDvsLocados[i]+" - Qtd. Locações Gratis: "+ qtdDvsLocados[i]/ 10);
		}
		
		
	}
		
}
