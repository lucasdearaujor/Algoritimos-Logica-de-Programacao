package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc06_MostrarInformacoesDasCompras {

	public static void main(String[] args) {
		
		// V - transação a vista
		// P - transação a praso
		// ler valor e forma de pagamento de 15 transações
		Scanner t = new Scanner(System.in);
		Double valorTotalAVista = 0.0;
		Double valorTotalAPrazo = 0.0;
		Double valorTotalGeral = 0.0;
		
		for(int i = 0; i < 15; i++) {
			Double valor = 0.0;
			String formaPagamento = "";
			System.out.println("Informe o valor da "+(i  + 1)+"° transação:");
			valor = t.nextDouble();
			System.out.println("Informe a forma de pagamento (V) - A vista | (P) - prazo ): ");
			formaPagamento = t.next();
			
			valorTotalGeral += valor;
			if(formaPagamento.equalsIgnoreCase("V")) {
				valorTotalAVista += valor;
			} else if(formaPagamento.equalsIgnoreCase("P")) {
				valorTotalAPrazo += valor;
			} 
						
		}
		
		System.out.println("Valor total á vista: R$ "+valorTotalAVista);
		System.out.println("Valor total á Prazo: R$ "+valorTotalAPrazo);
		System.out.println("Valor total geral: R$ "+valorTotalGeral);
		System.out.println("Valor da primeira prestação: "+ valorTotalAPrazo / 3);
		
	}
}
