package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc13_MostrarMediasDosPesosPesosDaMesmaFaxaEtaria {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Double somaPesosFaixaEtaria1a10 = 0.0;
		Integer qtdPessoasFaxaEtaria1a10 = 0;
		Double somaPesosFaixaEtaria11a20 = 0.0;
		Integer qtdPessoasFaxaEtaria11a20 = 0;
		Double somaPesosFaixaEtaria21a30 = 0.0;
		Integer qtdPessoasFaxaEtaria21a30 = 0;
		Double somaPesosFaixaEtariaAcimaDe30 = 0.0;
		Integer qtdPessoasFaxaEtariaAcimaDe30 = 0;
		
		for(int i = 1; i <= 15; i++) {
			Integer idade = 0;
			Double peso = 0.0;
			
			System.out.println("Informe a idade da pessoa n° "+i+": ");
			idade = t.nextInt();
			System.out.println("Informe o peso da pessoa n° "+i+": ");
			peso = t.nextDouble();
			
			if(idade >= 1 && idade <= 10) {
				somaPesosFaixaEtaria1a10 += peso;
				qtdPessoasFaxaEtaria1a10++;
			} else if(idade >= 11 && idade <= 20) {
				somaPesosFaixaEtaria11a20 += peso;
				qtdPessoasFaxaEtaria11a20++;
			} else if(idade >= 21 && idade <= 30) {
				somaPesosFaixaEtaria21a30 += peso;
				qtdPessoasFaxaEtaria21a30++;
			} else if(idade >= 31) {
				somaPesosFaixaEtariaAcimaDe30 += peso;
				qtdPessoasFaxaEtariaAcimaDe30++;
			}
			
		}
		
		System.out.println("Média pesos faixa etária 1 a 10 anos: "+ (qtdPessoasFaxaEtaria1a10 > 0 ? somaPesosFaixaEtaria1a10 / qtdPessoasFaxaEtaria1a10 : 0));
		System.out.println("Média pesos faixa etária 11 a 20 anos: "+ (qtdPessoasFaxaEtaria11a20 > 0 ? somaPesosFaixaEtaria11a20 / qtdPessoasFaxaEtaria11a20 : 0));
		System.out.println("Média pesos faixa etária 21 a 30 anos: "+ (qtdPessoasFaxaEtaria21a30 > 0 ? somaPesosFaixaEtaria21a30 / qtdPessoasFaxaEtaria21a30 : 0));
		System.out.println("Média pesos faixa etária acima de 31 anos: "+  (qtdPessoasFaxaEtariaAcimaDe30 > 0 ? somaPesosFaixaEtariaAcimaDe30 / qtdPessoasFaxaEtariaAcimaDe30 : 0));
		
		
		
	}
}
