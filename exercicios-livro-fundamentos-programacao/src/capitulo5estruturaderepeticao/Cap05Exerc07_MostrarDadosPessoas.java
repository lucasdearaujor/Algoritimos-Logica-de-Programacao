package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc07_MostrarDadosPessoas {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer qtdPessoasIdadeSuperior50 = 0;
		Double somaAlturas10a20Anos = 0.0;
		Integer qtdPessoas10a20Anos = 0;
		Integer qtdPessoasPesoInferiorA40 = 0;
		Integer qtdTotalPessoas = 0;
		
		for(int i = 0; i < 25; i++) {
			Integer idade = 0;
			Double altura = 0.0;
			Double peso = 0.0;
			System.out.println("Informe a idade da pessoa n° "+(i+1)+": ");
			idade = t.nextInt();
			System.out.println("Informe a altura da pessoa n° "+(i+1)+": ");
			altura = t.nextDouble();
			System.out.println("Informe o peso da pessoa n° "+(i+1)+": ");
			peso = t.nextDouble();
			
			if(idade > 50) {
				qtdPessoasIdadeSuperior50++;
			}
			
			if(idade >= 10 && idade <= 20) {
				qtdPessoas10a20Anos++;
				somaAlturas10a20Anos += altura;
			}
			
			if(peso < 40) {
				qtdPessoasPesoInferiorA40++;
			}
			
			qtdTotalPessoas++;
			
		}
		
		System.out.println("Quantidade de pessoas com idade superior a 50 anos: "+qtdPessoasIdadeSuperior50);
		System.out.println("Media das alturas das pessoas com idade entre 10 a 20 anos: "+ somaAlturas10a20Anos / qtdPessoas10a20Anos);
		System.out.println("Percentagem de pessoas com peso inferior a 40 quilos: "+ (qtdPessoasPesoInferiorA40 * 100) / qtdTotalPessoas + "%") ;
		
	}
}
