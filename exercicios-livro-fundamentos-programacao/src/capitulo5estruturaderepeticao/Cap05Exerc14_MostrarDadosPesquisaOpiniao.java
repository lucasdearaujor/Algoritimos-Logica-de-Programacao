package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc14_MostrarDadosPesquisaOpiniao {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Double somaIdadePessoasResponderamOtimo = 0.0;
		Integer qtdPessoasResponderamOtimo = 0;
		Integer qtdPessoasResponderamRegular = 0;
		Integer qtdPesssoasResponderamBom = 0;
		Integer qtdTotalPessoas = 0;
		
		for(int i = 1; i <= 5; i++) {
			Integer idade = 0;
			Integer opiniao = 0;
			
			System.out.println("Informe a idade da pessoa n° "+i+": ");
			idade = t.nextInt();
			System.out.println("Informe a opiniaõa da pessoa n° "+i+": 1 - Regular, 2 - Bom, 3 - Otimo");
			opiniao = t.nextInt();
			
			switch (opiniao) {
			case 1:
				qtdPessoasResponderamRegular++;
				break;
			case 2:
				qtdPesssoasResponderamBom++;
				break;
			case 3:
				somaIdadePessoasResponderamOtimo += idade;
				qtdPessoasResponderamOtimo++;
			default:
				break;
			}
		}
		
		System.out.println("Média das idades das pessoas que reponderam ótimo: "+ (qtdPessoasResponderamOtimo > 0 ? somaIdadePessoasResponderamOtimo / qtdPessoasResponderamOtimo : 0));
		System.out.println("Quantidade de Pessoas que responderam regular: "+qtdPessoasResponderamRegular);
		System.out.println("Percentagem de pessoas que responderam bom: "+ (qtdPesssoasResponderamBom * 100) / qtdTotalPessoas);
		
	}
}
