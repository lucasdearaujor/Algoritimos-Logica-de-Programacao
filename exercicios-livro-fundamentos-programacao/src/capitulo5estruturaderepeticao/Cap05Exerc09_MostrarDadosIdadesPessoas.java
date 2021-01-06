package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc09_MostrarDadosIdadesPessoas {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer somaIdades = 0;
		Integer qtdPessoasPesoSuperior = 0;
		Integer qtdPessoasIdadeEntreDezETrinta = 0;
		Integer qtdTotalPessoas = 0;
		
		for(int i = 0; i < 5; i++) {
			Integer idade= 0 ;
			Double peso = 0.0;
			Double altura = 0.0;
			
			System.out.println("Informe a idade da pessoa n°"+(i+1)+": ");
			idade = t.nextInt();
			System.out.println("Informe o peso da pessoa n°"+(i+1)+": ");
			peso = t.nextDouble();
			System.out.println("Informe a altura da pessoa n°"+(i+1)+": ");
			altura = t.nextDouble();
			
			somaIdades += idade;
			if(peso > 90 & altura < 1.50) {
				qtdPessoasPesoSuperior++;
			}
			
			if(idade >= 10 && idade <= 30 && altura > 1.90) {
				qtdPessoasIdadeEntreDezETrinta++;
			}
			qtdTotalPessoas++;
		}
		
		
		System.out.println("Média das idades das dez pessoas: "+ somaIdades / qtdTotalPessoas);
		System.out.println("Quantidade de pessoas com peso superior a 90 quilos e altura inferior a 1,50m: "+ qtdPessoasPesoSuperior);
		System.out.println("Percentagem de pessoas com idade entre 10  e 30 anos entre as pessoas que medem mais de 1,90m: "+ (qtdPessoasIdadeEntreDezETrinta * 100) / qtdTotalPessoas );
		
	}
}
