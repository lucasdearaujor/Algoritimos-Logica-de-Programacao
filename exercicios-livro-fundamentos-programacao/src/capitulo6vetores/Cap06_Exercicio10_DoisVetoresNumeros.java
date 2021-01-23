package capitulo6vetores;

import java.util.Scanner;

import capitulo5estruturaderepeticao.Cap05Exerc10_ReceberDezNumerosSomarParesImpares;

public class Cap06_Exercicio10_DoisVetoresNumeros {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		Integer primeiroVetor[] = new Integer[10];
		Integer segundoVetor[] = new Integer[5];
		Integer somaParComTodosOsNumerosDoSegundoVetor[] = new Integer[10];
		Integer posicaoVetorSomaPar = 0 ;
		Integer qtdDivisoresNumerosImparQueCadaNumeroNoPrimeiroVetorTemNoSegundo[] = new Integer[10];
		Integer posicaoQtdDivisores = 0 ;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o numero "+(i+1)+ "° numero");
			primeiroVetor[i] = t.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o numero "+(i+1)+ "° numero");
			segundoVetor[i] = t.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			if(primeiroVetor[i] % 2 == 0) {
				somaParComTodosOsNumerosDoSegundoVetor[posicaoVetorSomaPar] = primeiroVetor[i];
				for(int j = 0; j < 5; j++) {
					somaParComTodosOsNumerosDoSegundoVetor[posicaoVetorSomaPar] += segundoVetor[j];
				}	
				posicaoVetorSomaPar++;
			}
			
			if(primeiroVetor[i] % 2 != 0) {
				qtdDivisoresNumerosImparQueCadaNumeroNoPrimeiroVetorTemNoSegundo[posicaoQtdDivisores] = 0;
				
				for(int j = 0; j < 5; j++) {
					if(primeiroVetor[i] % segundoVetor[j] == 0) {
						qtdDivisoresNumerosImparQueCadaNumeroNoPrimeiroVetorTemNoSegundo[posicaoQtdDivisores]++;
					}
				}	
				posicaoQtdDivisores++;
			}

			
		}
		
		System.out.println("*** Soma dos numeros pares do primeiro Vetor com todos os numeros do segundo vetor ***");
		for(int i = 0; i < 10; i++) {
			System.out.println(somaParComTodosOsNumerosDoSegundoVetor[i]);
		}
		System.out.println("*** Quantidade de divisores que cada número impar do primeiro vetor tem no segundo vetor ***");
		for(int i = 0; i < 10; i++) {
			System.out.println(qtdDivisoresNumerosImparQueCadaNumeroNoPrimeiroVetorTemNoSegundo[i]);
		}

	}
}
