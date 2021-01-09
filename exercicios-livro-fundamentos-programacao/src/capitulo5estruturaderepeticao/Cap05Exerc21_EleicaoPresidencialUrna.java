package capitulo5estruturaderepeticao;
import java.util.Scanner;

import javax.swing.plaf.multi.MultiPopupMenuUI;

public class Cap05Exerc21_EleicaoPresidencialUrna {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer totalVotosCandidato1 = 0;
		Integer totalVotosCandidato2 = 0;
		Integer totalVotosCandidato3 = 0;
		Integer totalVotosCandidato4 = 0;
		Integer totalVotosNulos = 0;
		Integer totalVotosEmBranco = 0;
		Integer totalDeVotos = 0;
		Integer voto = 0;
		
		
		do {
			System.out.println("Informe o numero do candito, ou 5 - nulo; 6 - branco");
			voto = t.nextInt();
			switch (voto) {
				case 1:
					totalVotosCandidato1++;
					break;
				case 2:
					totalVotosCandidato2++;
					break;
				case 3:
					totalVotosCandidato3++;
					break;
				case 4:
					totalVotosCandidato4++;
					break;
				case 5:
					totalVotosNulos++;
					break;
				case 6:
					totalVotosEmBranco++;
					break;
				default:
					System.out.println("Opção invalida!");
					break;
			}
			
			totalDeVotos++;
			
		} while (voto != 0);
		
		System.out.println("Total de votos candidato 1: "+totalVotosCandidato1);
		System.out.println("Total de votos candidato 2: "+totalVotosCandidato2);
		System.out.println("Total de votos candidato 3: "+totalVotosCandidato3);
		System.out.println("Total de votos candidato 4: "+totalVotosCandidato4);
		System.out.println("Total de votos nulos: "+ totalVotosNulos + " Percetual de "+ ((totalVotosNulos * 100) / totalDeVotos ) + "%");
		System.out.println("Total de votos em branco: "+ totalVotosEmBranco + " Percetual de "+ ((totalVotosEmBranco * 100) / totalDeVotos ) + "%");
		
		
	}
}
