package capitulo4estruturacondicional;
import java.util.Scanner;

public class Cap04Exerc09_CalcularCreditoEspecialClientes {

	public static void main(String[] args) {
		
		Double saldoMedio = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe o saldo médio: ");
		saldoMedio = t.nextDouble();
		
		if(saldoMedio > 400) {
			System.out.println("Valor do crédito(30%): "+ (saldoMedio * 0.30));
		} else if(saldoMedio >= 300) {
			System.out.println("Valor do crédito(25%): "+  (saldoMedio * 0.25));
		} else if (saldoMedio >= 200) {
			System.out.println("Valor do crédito(20%): "+  (saldoMedio * 0.20));
		} else {
			System.out.println("Valor do crédito(10%): "+ (saldoMedio * 0.10));
		}
		
	}
}
