package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc16_MostraMediaDeVariasIdades {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer qtdIdades = 0;
		Double somaIdades = 0.0;
		Integer idade = 0;
		
		System.out.println("*** Informe quantas idades desejar ***");
		System.out.println("*** Para encerrar basta informar: 0 ***");
		do {
			System.out.println("Informe uma idade: ");
			idade = t.nextInt();
			if(idade > 0) {
				qtdIdades++;
				somaIdades += idade;
			} else if (idade == 0){
				System.out.println("Sair e mostrar resultado...");
			} else {
				System.out.println("Idade invalida!");
			}
			
		} while (idade != 0);
		
		
		System.out.println("Media das idades: "+ (qtdIdades > 0 ? somaIdades / qtdIdades : 0));
		
	}
}
