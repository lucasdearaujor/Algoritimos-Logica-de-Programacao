package capitulo4estruturacondicional;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap04Exerc02_CalcularMediaNotas2 {

	public static void main(String[] args) {
		
		Double n1 = 0.0;
		Double n2 = 0.0;
		Double media = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe a primeira nota: ");
		n1 = t.nextDouble();
		System.out.println("Informe a segunda nota: ");
		n2 = t.nextDouble();
		
		media = (n1 + n2) / 2;
		
		if(media >= 0.0 && media <= 4.0) {
			System.out.println("Reprovado! media: "+media);
		} else if(media > 4.0 && media <= 7.0) {
			System.out.println("Exame! media: "+media);
		} else if(media > 7.0 && media <= 10.0) {
			System.out.println("Aprovado! media: "+media);
		}
	}
}
