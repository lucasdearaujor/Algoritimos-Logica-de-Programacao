package capitulo5estruturaderepeticao;
import java.util.Scanner;

import javax.swing.plaf.multi.MultiPopupMenuUI;

public class Cap05Exerc25_RedimentosInvestimentos {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer codigoCliente = 0;
		Integer tipoInvestimento = 0;
		Double valorInvestido = 0.0;
		Double totalInvestido = 0.0;
		Double totalJurosPagos = 0.0;
		
		do {
			System.out.println("Informe o codigo do cliente: ");
			codigoCliente=  t.nextInt();
			if(codigoCliente <= 0) {
				System.out.println("Entrada de dados encerrada");
				break;
			}
			System.out.println("Informe o tipo de investimento: ");
			tipoInvestimento = t.nextInt();
			System.out.println("Informe o valor investido: ");
			valorInvestido = t.nextDouble();
			
			if(codigoCliente > 0) {
				totalInvestido += valorInvestido;
				
				switch (tipoInvestimento) {
				case 1:
					totalJurosPagos += valorInvestido * 0.015;
					break;
				case 2:
					totalJurosPagos += valorInvestido * 0.02;
					break;
				case 3:
					totalJurosPagos += valorInvestido * 0.04;
					break;
				default:
					break;
				}
			}

		} while (codigoCliente != 0);
		
		System.out.println("Total Investido R$ "+totalInvestido);
		System.out.println("Total de juros pagos R$ "+totalJurosPagos);
		
	}
}
