package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc08_MostrarDadosPessoas {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer qtdPessoasIdadeSuperior50 = 0;
		Integer somaIdadesPessoasAlturaInferior = 0;
		Integer qtdPessoasAlturaInferior = 0;
		Double mediaIdadesPessoasAlturaInferior = 0.0;
		Integer qtdPessoasOlhosAzuis = 0;
		Integer qtdPessoasRuivasSemOlhosAzuis = 0;
		Integer qtdTotalPessoas = 0;
		
		for(int i = 0; i < 20; i++) {
			Integer idade = 0;
			Double altura = 0.0;
			Double peso = 0.0;
			String corOlhos = "";
			String corCabelos = "";
			
			System.out.printf("\nInforme a IDADE da pessoa n° "+(i+1)+": ");
			idade = t.nextInt();
			System.out.printf("\nInforme o PESO da pessoa n° "+(i+1)+": ");
			peso = t.nextDouble();
			System.out.print("\nInforme a ALTURA da pessoa n° "+(i+1)+": ");
			altura = t.nextDouble();
			System.out.println("\nInforme a COR DOS OLHOS da pessoa n° "+(i+1)+" A - azul, P - preto, V - verde, C - castanlho:");
			corOlhos = t.next();
			System.out.println("\nInforme a COR DOS CABELHOS da pessoa n° "+(i+1)+" P - preto, C - castanho, L - louro, R - ruivo:");
			corCabelos = t.next();
			
			if(idade > 50 && peso < 60) {
				qtdPessoasIdadeSuperior50++;
			}
			
			if(altura < 1.50) {
				somaIdadesPessoasAlturaInferior += idade;
				qtdPessoasAlturaInferior++;
			}
			
			if(corOlhos.equalsIgnoreCase("A")) {
				qtdPessoasOlhosAzuis++;
			}
			
			if(!corOlhos.equalsIgnoreCase("A") && corCabelos.equalsIgnoreCase("R")) {
				qtdPessoasRuivasSemOlhosAzuis++;
			}
			
			qtdTotalPessoas++;
		}
		
		mediaIdadesPessoasAlturaInferior = qtdPessoasAlturaInferior > 0 ? somaIdadesPessoasAlturaInferior / qtdPessoasAlturaInferior : 0.0;
		
		System.out.println("Quantidade de pessoas com idade superior a 50 anos: "+qtdPessoasIdadeSuperior50);
		System.out.println("Media das idades das pessoas com altura inferior a 1,50 metros: "+ mediaIdadesPessoasAlturaInferior);
		System.out.println("Percentagem de pessoas com olhos azuis entre todas as pessoas analisadas: "+ (qtdPessoasOlhosAzuis * 100) / qtdTotalPessoas);
		System.out.println("Quantidade de pessoas ruivas e que não possuem olhos azuis: " + qtdPessoasRuivasSemOlhosAzuis);
		
	}
}
