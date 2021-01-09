package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc17_MostraDadosPesquisaTVCanais {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer canal = 0;
		Integer qtdPessoasAssistindo = 0;
		Integer qtdPessoasCanal4 = 0;
		Integer qtdPessoasCanal5 = 0;
		Integer qtdPessoasCanal7 = 0;
		Integer qtdPessoasCanal12 = 0;
		Integer qtdTotalPessoas = 0;
		
		System.out.println("*** Para encerrar a pesquisa basta informar: 0 ***");
		do {
			System.out.println("Informe o canal: ");
			canal = t.nextInt();
			System.out.println("Informe a quantidade de pessoas assistindo: ");
			qtdPessoasAssistindo = t.nextInt();
			
			qtdTotalPessoas += qtdPessoasAssistindo;
			
			switch (canal) {
				case 4:
					qtdPessoasCanal4++;
					break;
				case 5:
					qtdPessoasCanal5++;
					break;
				case 7:
					qtdPessoasCanal7++;
					break;
				case 12:
					qtdPessoasCanal12++;
					break;
				case 0:
					System.out.println("Encerrando pesquisa e mostrando resultados...");
					break;
				default:
					System.out.println("Canal Inexistente!");
					break;
			}
			
			
		} while (canal != 0);
		
		System.out.println("Total audiência: "+qtdTotalPessoas+" pessoas");
		System.out.println("Percentagem de audiência canal 4: "+(qtdPessoasCanal4 > 0 ? (qtdPessoasCanal4 * 100) / qtdTotalPessoas : 0) + "%");
		System.out.println("Percentagem de audiência canal 5: "+(qtdPessoasCanal5 > 0 ? (qtdPessoasCanal5 * 100) / qtdTotalPessoas : 0) + "%");
		System.out.println("Percentagem de audiência canal 7: "+(qtdPessoasCanal7 > 0 ? (qtdPessoasCanal7 * 100) / qtdTotalPessoas : 0) + "%");
		System.out.println("Percentagem de audiência canal 12: "+(qtdPessoasCanal12 > 0 ? (qtdPessoasCanal12 * 100) / qtdTotalPessoas : 0) + "%");
		
	}
}
