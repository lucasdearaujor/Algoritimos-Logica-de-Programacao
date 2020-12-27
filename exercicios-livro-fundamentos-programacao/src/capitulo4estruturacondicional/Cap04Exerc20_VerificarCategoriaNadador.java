package capitulo4estruturacondicional;
import java.util.Locale;
import java.util.Scanner;

public class Cap04Exerc20_VerificarCategoriaNadador {

	public static void main(String[] args) {
		
		Integer idade;
		Scanner t = new Scanner(System.in);
		t.useLocale(Locale.US);
		System.out.println("Informe sua idade: ");
		idade = t.nextInt();
		
		if(idade < 5) {
			System.out.println("Sem categoria");
		} else 	if(idade >= 5 && idade <= 7) {
			System.out.println("Categoria Infantil");
		} else if(idade <= 10) {
			System.out.println("Categoria Juvenil");
		} else if(idade <= 15) {
			System.out.println("Categoria Adolescente");
		} else if(idade <= 30) {
			System.out.println("Categoria Adulto");
		} else {
			System.out.println("Categoria Senior");
		}
		
	}
}
