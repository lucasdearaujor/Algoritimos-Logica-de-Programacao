package capitulo4estruturacondicional;
import java.util.Locale;
import java.util.Scanner;

public class Cap04Exerc21_VerificarProcedenciaProduto {

	public static void main(String[] args) {
		
		Integer codigoOrigem;
		Double valor;
		Scanner t = new Scanner(System.in);
		t.useLocale(Locale.US);
		System.out.println("Informe o codigo Origem: ");
		codigoOrigem = t.nextInt();
		System.out.println("Informe o valor: ");
		valor = t.nextDouble();
		
		if(codigoOrigem == 1) {
			System.out.println("Procedencia Sul");
		} else if(codigoOrigem == 2) {
			System.out.println("Procedencia Norte");
		} else if(codigoOrigem == 3) {
			System.out.println("Procedencia Leste");
		} else if(codigoOrigem == 4) {
			System.out.println("Procedencia Oeste");
		} else if(codigoOrigem == 5 || codigoOrigem == 6) {
			System.out.println("Procedencia Nordeste");
		} else if(codigoOrigem >= 7 && codigoOrigem <= 9) {
			System.out.println("Procedencia Sudeste");
		} else if(codigoOrigem >= 10 && codigoOrigem <= 20) {
			System.out.println("Procedencia Centro-oeste");
		} else if(codigoOrigem >= 21 && codigoOrigem <= 30) {
			System.out.println("Procedencia Nordeste");
		}
		
	}
}
