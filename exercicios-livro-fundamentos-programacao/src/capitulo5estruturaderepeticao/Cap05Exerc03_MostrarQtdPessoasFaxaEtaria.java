package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc03_MostrarQtdPessoasFaxaEtaria {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		int idade = 0;
		int countFaixa1 = 0;
		int countFaixa2 = 0;
		int countFaixa3 = 0;
		int countFaixa4 = 0;
		int countFaixa5 = 0;
		for(int i = 0; i < 15; i++) {
			
			System.out.println("Informe a idade da pessoa n° "+i+": ");
			idade = t.nextInt();
			
			if(idade <= 15) {
				countFaixa1++;
			} else if(idade <= 30) {
				countFaixa2++;
			} else if(idade <= 45) {
				countFaixa3++;
			} else if(idade <= 60) {
				countFaixa4++;
			} else {
				countFaixa5++;
			}
			
		}
		
		System.out.println("Percentagem de pessoas na faixa 1 (Até 15 anos): "+ (countFaixa1 * 100)/15 +"%");
		System.out.println("Percentagem de pessoas na faixa 5 (De 16 a 30 anos): "+ (countFaixa5 * 100)/15 +"%");

		
	}
}
