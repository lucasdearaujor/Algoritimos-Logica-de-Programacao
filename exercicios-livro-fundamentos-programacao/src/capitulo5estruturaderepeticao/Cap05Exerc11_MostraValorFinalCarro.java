package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc11_MostraValorFinalCarro {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Double valorFinal = 0.0;
		Integer qtdParcelas = 0;
		Double valorParcela = 0.0;
		Double percetualAcrescimo = 0.0;
		
		System.out.println("Informe o valor final: ");
		valorFinal = t.nextDouble();
		System.out.println("Informe o quantidade de parcelas: ");
		qtdParcelas = t.nextInt();
		System.out.println("Informe o valor da parcela: ");
		valorParcela = 0.0;
		
		switch (qtdParcelas) {
			case 6:
				percetualAcrescimo = 3.0;
				break;
			case 12:
				percetualAcrescimo = 6.0;
				break;
			case 18:
				percetualAcrescimo = 9.0;
				break;
			case 24:
				percetualAcrescimo = 12.0;
				break;
			case 30:
				percetualAcrescimo = 15.0;
				break;
			case 36:
				percetualAcrescimo = 18.0;
				break;
			case 42:
				percetualAcrescimo = 21.0;
				break;
			case 48:
				percetualAcrescimo = 24.0;
				break;
			case 54:
				percetualAcrescimo = 27.0;
				break;
			case 60:
				percetualAcrescimo = 30.0;
				break;
			default:
				break;
		}
		
		System.out.println("Preço final á vista: R$ "+ (valorFinal - (valorFinal * 0.20)));
		System.out.println("Valor final com percentual de acréscimo de "+percetualAcrescimo+"%: R$ "+(valorFinal + (valorFinal * (percetualAcrescimo / 100))));
		
		
	}
}