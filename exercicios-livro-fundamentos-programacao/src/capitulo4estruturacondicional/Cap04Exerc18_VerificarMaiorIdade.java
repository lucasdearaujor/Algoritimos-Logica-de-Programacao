package capitulo4estruturacondicional;
import java.util.Scanner;

public class Cap04Exerc18_VerificarMaiorIdade {

	public static void main(String[] args) {
		
		Integer idade = 0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe a idade: ");
		idade = t.nextInt();
		if(idade < 18) {
			System.out.println("Menor de idade!");
		} else {
			System.out.println("Maior de idade");
		}
	}
}
