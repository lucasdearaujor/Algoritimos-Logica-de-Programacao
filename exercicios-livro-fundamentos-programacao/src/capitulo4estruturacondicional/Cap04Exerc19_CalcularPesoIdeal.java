package capitulo4estruturacondicional;
import java.util.Locale;
import java.util.Scanner;

public class Cap04Exerc19_CalcularPesoIdeal {

	public static void main(String[] args) {
		
		Double altura;
		String sexo = "";
		
		Scanner t = new Scanner(System.in);
		t.useLocale(Locale.US);
		System.out.println("Informe sua altura: ");
		altura = t.nextDouble();
		System.out.println("Informe seu sexo(M - Masculino ou F - Feminino): ");
		sexo = t.next();
		
		switch (sexo) {
		case "M":
			System.out.println("Seu peso ideal é: "+ ((72.7 * altura) - 58));
			break;
		case "F":
			System.out.println("Seu peso ideal é: "+ ((62.1 * altura) - 44.7));
			break;
		default:
			System.out.println("Sexo invalido");
			break;
		}
	}
}
