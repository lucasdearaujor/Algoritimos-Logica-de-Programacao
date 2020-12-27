package capitulo4estruturacondicional;
import java.util.Locale;
import java.util.Scanner;

public class Cap04Exerc22_VerificarGrupoDeRiscoPessoa {

	public static void main(String[] args) {
		
		Integer idade;
		Double peso;
		Scanner t = new Scanner(System.in);
		t.useLocale(Locale.US);
		System.out.println("Informe a sua idade: ");
		idade = t.nextInt();
		System.out.println("Informe o seu peso: ");
		peso = t.nextDouble();
		
		if(idade < 20 && peso <= 60) {
			System.out.println("Grupo de Risco: 9");
		} else if(idade < 20 && peso <= 90) {
			System.out.println("Grupo de Risco: 8");
		} else if(idade < 20) {
			System.out.println("Grupo de Risco: 7");
		} else if(idade <= 50 && peso <= 60) {
			System.out.println("Grupo de Risco: 6");
		} else if(idade <= 50 && peso <= 90) {
			System.out.println("Grupo de Risco: 5");
		} else if(idade <= 50) {
			System.out.println("Grupo de Risco: 4");
		} else if(peso <= 60) {
			System.out.println("Grupo de Risco: 3");
		} else if(peso <= 90) {
			System.out.println("Grupo de Risco: 2");
		} else {
			System.out.println("Grupo de Risco: 1");
		}
		
		
	}
}
