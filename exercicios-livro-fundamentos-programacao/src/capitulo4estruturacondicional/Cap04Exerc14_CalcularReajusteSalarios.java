package capitulo4estruturacondicional;
import java.util.Scanner;

public class Cap04Exerc14_CalcularReajusteSalarios {

	public static void main(String[] args) {
		
		Double salario = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe seu s�lario: ");
		salario = t.nextDouble();
		
		if(salario <= 300) {
			System.out.println("Aumento de 50% R$ "+ (salario * 0.50) + " Novo sal�rio: R$ "+(salario + (salario * 0.50)));
		} else if(salario <= 500) {
			System.out.println("Aumento de 40% R$ "+ (salario * 0.40) + " Novo sal�rio: R$ "+(salario + (salario * 0.40)));
		} else if(salario <= 700) {
			System.out.println("Aumento de 30% R$ "+ (salario * 0.30) + " Novo sal�rio: R$ "+(salario + (salario * 0.30)));
		} else if(salario <= 800){
			System.out.println("Aumento de 20% R$ "+ (salario * 0.20) + " Novo sal�rio: R$ "+(salario + (salario * 0.20)));
		} else if(salario <= 1000){
			System.out.println("Aumento de 10% R$ "+ (salario * 0.10) + " Novo sal�rio: R$ "+(salario + (salario * 0.10)));
		} else {
			System.out.println("Aumento de 5% R$ "+ (salario * 0.05) + " Novo sal�rio: R$ "+(salario + (salario * 0.05)));
		}
		
	}
}
