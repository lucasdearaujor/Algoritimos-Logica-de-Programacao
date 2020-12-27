package capitulo4estruturacondicional;

import java.util.Scanner;

public class Cap04Exerc24_CalcularNovoValorProduto {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		Double preco = 0.0;
		Integer categoria = 0;
		String situacao = "";
		Double valorAumento = 0.0;
		Double valorImposto = 0.0;
		Double novoPreco = 0.0;
		String classificao = "";
		
		System.out.println("Informe o valor do produto: ");
		preco = t.nextDouble();
		System.out.println("Informe a categoria do produto: ");
		categoria = t.nextInt();
		System.out.println("Informe a situação do produto: ");
		situacao = t.next();
		
		if(preco <= 25) {
			if(categoria == 1) {
				valorAumento = preco * 0.05;
			} else if(categoria == 2) {
				valorAumento = preco * 0.08;
			} else if(categoria == 3) {
				valorAumento = preco * 0.10;
			} 
		} else {
			if(categoria == 1) {
				valorAumento = preco * 0.12;
			} else if(categoria == 2) {
				valorAumento = preco * 0.15;
			} else if(categoria == 3) {
				valorAumento = preco * 0.18;
			} 
		}
		
		
		if(categoria == 2 || situacao.equals("R")) {
			valorImposto = preco * 0.05;
		} else {
			valorImposto = preco * 0.08;
		}
		
		novoPreco = preco + valorAumento - valorImposto;
		
		if(novoPreco <= 50.0) {
			classificao = "Barato";
		} else if(novoPreco <= 120.00) {
			classificao = "Normal";
		} else {
			classificao = "Caro";
		}
		
		System.out.println("Valor do aumento: "+valorAumento);
		System.out.println("Valor do imposto: "+valorImposto);
		System.out.println("Novo preço: "+novoPreco);
		System.out.println("Classificação: "+classificao);
		
	}
}
