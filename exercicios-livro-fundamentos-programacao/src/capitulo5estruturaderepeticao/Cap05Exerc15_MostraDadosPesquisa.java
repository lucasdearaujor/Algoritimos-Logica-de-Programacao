package capitulo5estruturaderepeticao;
import java.util.Scanner;

public class Cap05Exerc15_MostraDadosPesquisa {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Integer qtdPessoasSim = 0;
		Integer qtdPessoasNao = 0;
		Integer qtdMulheresSim = 0;
		Integer qtdHomensNao = 0;
		Integer qtdHomens = 0;

		for(int i = 1; i <= 10; i++) {
			String gostouProduto = "";
			String sexo = "";
			
			System.out.println("Informe o sexo da pessoa n� "+ i + " M - Masculino, F - Feminino: ");
			sexo = t.next();
			System.out.println("Pessoa gostou do produto? S - Sim, N - N�o");
			gostouProduto = t.next();
			
			if(gostouProduto.equalsIgnoreCase("S")) {
				qtdPessoasSim++;
				if(sexo.equalsIgnoreCase("F")) {
					qtdMulheresSim++;
				}
			} else if(gostouProduto.equalsIgnoreCase("N")) {
				qtdPessoasNao++;
				if(sexo.equalsIgnoreCase("M")) {
					qtdHomensNao++;
				}
			}
			
			if(sexo.equalsIgnoreCase("M")) {
				qtdHomens++;
			}
		}
		
		System.out.println("N�mero de pessoas que responderam sim: "+qtdPessoasSim);
		System.out.println("N�mero de pessoas que responderam n�o: "+qtdPessoasNao);
		System.out.println("N�mero de mulheres que responderam sim: "+qtdMulheresSim);
		System.out.println("Percentagem de homens que responderam n�o: "+ (qtdHomens > 0 ? (qtdHomensNao * 100)/qtdHomens : 0) +"%");
		
	}
}
