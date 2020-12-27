package capitulo4estruturacondicional;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap04Exerc01_CalcularMediaNotas {

	public static void main(String[] args) {
		
		Double n1 = 0.0;
		Double n2 = 0.0;
		Double n3 = 0.0;
		Double n4 = 0.0;
		Double media = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe a primeira nota: ");
		n1 = t.nextDouble();
		System.out.println("Informe a segunda nota: ");
		n2 = t.nextDouble();
		System.out.println("Informe a terceira nota: ");
		n3 = t.nextDouble();
		System.out.println("Informe a quarta nota: ");
		n4 = t.nextDouble();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		if(media >= 7.0) {
			System.out.println("Aprovado! media: "+media);
		} else {
			System.out.println("Reprovado! media: "+media);
		}
		
		System.out.println("");
		
		
	}
}
