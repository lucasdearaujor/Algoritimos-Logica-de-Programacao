package capitulo4estruturacondicional;

import java.util.Scanner;

public class Cap04Exerc23_CalcularValorProdutoNota {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		Integer codigo = 0;
		Integer qtd = 0;
		Double precoUnitario = 0.0;
		Double precoTotal;
		Double valorDesconto = 0.0;
		Double valorFinalNotal = 0.0;
		
		System.out.println("Informe o codigo do produto");
		codigo = t.nextInt();
		System.out.println("Informe a quantidade: ");
		qtd = t.nextInt();
		
		if(codigo >= 1 && codigo  <= 10) {
			precoUnitario = 10.00;
		} else if(codigo >= 11 && codigo <= 20) {
			precoUnitario = 15.00;
		} else if(codigo >= 21 && codigo <= 30) {
			precoUnitario = 20.00;
		} else if(codigo >= 31 && codigo <= 40) {
			precoUnitario = 30.00;
		}
		
		precoTotal = precoUnitario * qtd;
		
		if(precoTotal <= 250.00) {
			valorDesconto = precoTotal * 0.05;
		} else if (precoTotal <= 500) {
			valorDesconto = precoTotal * 0.10;
		} else {
			valorDesconto = precoTotal * 0.15;
		}
		
		valorFinalNotal = precoTotal - valorDesconto;
		
		System.out.println("Preço unitario: R$ "+precoUnitario);
		System.out.println("Preço total da nota: R$ "+precoTotal);
		System.out.println("Valor do desconto: R$ "+valorDesconto);
		System.out.println("Preço final da nota: R$ "+valorFinalNotal);
		
		
			
		
		
		
		
	}
}
