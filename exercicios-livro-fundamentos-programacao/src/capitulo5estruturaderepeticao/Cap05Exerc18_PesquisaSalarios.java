package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc18_PesquisaSalarios {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer idade = 0;
		Double salario = 0.0;
		String sexo = "";
		Double somaSalrios = 0.0;
		Integer qtdPessoas = 0;
		Integer maiorIdade = 0;
		Integer menorIdade = 0;
		Integer qtdMulheresSalarioMenorQueDuzentos = 0;
		Double menorSalario = 0.0;
		Integer idadePessoaMenorSalario = 0;
		String sexoPessoaMenorSalario = "";
		
		System.out.println("*** Para encerrar a pesquisa basta informa uma idade negativa ***");
		while(idade >= 0) {
			System.out.println("Informe a idade da pessoa n° "+(qtdPessoas+1)+": ");
			idade = t.nextInt();
			if(idade < 0) {
				System.out.println("Encerrando Pesquisa...");
				break;
			}
			System.out.println("Informe o sexo da pessoa n° "+(qtdPessoas+1)+": ");
			sexo = t.next();
			System.out.println("Informe o salario da pessoa n° "+(qtdPessoas+1)+": ");
			salario = t.nextDouble();
			
			if(idade > maiorIdade) {
				maiorIdade = idade;
			}
			
			if(idade < menorIdade || menorIdade == 0) {
				menorIdade = idade;
			}
			
			if(salario < menorSalario || menorSalario == 0.0) {
				menorSalario = salario;
				idadePessoaMenorSalario = idade;
				sexoPessoaMenorSalario = sexo;
			}
			
			if(sexo.equalsIgnoreCase("F") && salario < 200.00) {
				qtdMulheresSalarioMenorQueDuzentos++;
			}
			
			qtdPessoas++;
			somaSalrios += salario ;
			
		}
		
		System.out.println("Medias dos salarios do grupo: "+ (qtdPessoas > 0 ? somaSalrios/qtdPessoas : 0));
		System.out.println("Maior idade: "+maiorIdade);
		System.out.println("Menor idade: "+menorIdade);
		System.out.println("Qtd de mulheres com salario até R$ 200,00: "+qtdMulheresSalarioMenorQueDuzentos);
		System.out.println("Idade e sexo pessoa que possui o menor salario: "+idadePessoaMenorSalario+" anos - "+sexoPessoaMenorSalario+" - R$ "+menorSalario);
	}
}
