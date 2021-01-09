package capitulo5estruturaderepeticao;
import java.util.Scanner;

import javax.swing.plaf.multi.MultiPopupMenuUI;

public class Cap05Exerc23_DadosFuncionario {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer opcao = 0;
		
		System.out.println("***********************");
		System.out.println("1. Novo sálario");
		System.out.println("2. Ferias");
		System.out.println("3. Decimo terceiro");
		System.out.println("4. Sair");
		System.out.println("***********************");
		opcao = t.nextInt();
		
		switch (opcao) {
			case 1:
				System.out.println("***Novo Salário***");
				Double salario = 0.0;
				System.out.println("Informe o salário: ");
				salario = t.nextDouble();
				if(salario >= 210.0) {
					salario += salario * 0.15;
				} else if(salario <= 600) {
					salario += salario * 0.10;
				} else if(salario > 600) {
					salario += salario * 0.05;
				}
				System.out.println("O novo salário é: "+ salario);
				break;
			case 2:
				System.out.println("***Ferias***");
				Double salarioBruno = 0.0;
				System.out.println("Informe o salário: ");
				salarioBruno = t.nextDouble();
				System.out.println("Ferias R$ "+ (salarioBruno + (salarioBruno / 3)));
				
				break;
			case 3:
				System.out.println("***Decimo Terceiro***");
				Double salarioBruto = 0.0;
				Integer qtdMesesTrabalhados = 0;
				System.out.println("Informe o salario: ");
				salarioBruto = t.nextDouble();
				System.out.println("Informe a qtd de meses trabalhados: ");
				qtdMesesTrabalhados = t.nextInt();
				if(qtdMesesTrabalhados > 12) {
					System.out.println("Numero de meses invalidos");
					break;
				}
				
				System.out.println("Decimo terceiro R$ "+ ((salarioBruto * qtdMesesTrabalhados) / 12));
				break;
			case 4:
				System.out.println("Sistema encerrado!");
				break;	
			default:
				System.out.println();
				break;
		}
		
		
	}
}
