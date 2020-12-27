package capitulo4estruturacondicional;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap04Exerc05_MenuOperacoesDesejadas {

	public static void main(String[] args) {
		
		Double n1 = 0.0;
		Double n2 = 0.0;
		Integer menu = 0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		n1 = t.nextDouble();
		System.out.println("Informe o segundo número: ");
		n2 = t.nextDouble();
		
		System.out.println("***********************************");
		System.out.println("1 - Média entre os números digitados");
		System.out.println("2 - Difereça do maior pelo menor");
		System.out.println("3 - Produto entre os número digitados");
		System.out.println("4 - Divisão do primeiro pelo segundo");
		System.out.print("***********************************");
		System.out.print("\nInforme o número da operação desejada:");
		menu = t.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("Média entre números digitados: "+ (n1 + n2)/ 2);
			break;
		case 2:
			if(n1 > n2) {
				System.out.println("Diferença do Maior pelo menor: "+ (n1 - n2));
			} else if(n2 > n1) {
				System.out.println("Diferença do Maior pelo menor: "+ (n2 - n1));
			} else {
				System.out.println("São iguais");
			}
			break;
		case 3:
			System.out.println("Produto entre números: "+ n1 * n2);
			break;
		case 4: 
			if(n2 != 0) {
				System.out.println("Divsão do primeiro pelo segundo: "+ n1 / n2);
			} else {
				System.out.println("Divisão por zero!");
			}
			break;
		default:
			System.out.println("Opção invalida!");
			break;
		}
		
	}
}
