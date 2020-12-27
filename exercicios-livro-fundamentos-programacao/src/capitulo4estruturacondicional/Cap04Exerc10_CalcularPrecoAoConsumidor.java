package capitulo4estruturacondicional;
import java.util.Scanner;

public class Cap04Exerc10_CalcularPrecoAoConsumidor {

	public static void main(String[] args) {
		
		Double precoFabricao = 0.0;
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe o preço de fabrica: ");
		precoFabricao = t.nextDouble();
		
		if(precoFabricao <= 12000) {
			System.out.println("Preço ao consumidor(5%): R$ "+ (precoFabricao + (precoFabricao * 0.05))); 
		} else if(precoFabricao <= 25000) {
			System.out.println("Preço ao consumidor(25%): R$ "+ (precoFabricao + (precoFabricao * 0.25)));
		} else {
			System.out.println("Preço ao consumidor(35%): R$ "+ (precoFabricao + (precoFabricao * 0.35)));
		}
	}
}
