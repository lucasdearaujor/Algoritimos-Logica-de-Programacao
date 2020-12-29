package capitulo5estruturaderepeticao;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cap05Exerc01_MostrarValoresGruposOrdenados {

	public static void main(String[] args) {
		
		String[][] grupoValores = new String[5][4];
		Scanner t = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println("Informe o valor para Grupo: "+(i+1)+" valor: "+(j+1)+": " );
				grupoValores[i][j] = t.next();
			}
		}
		
		//Mostrar valores na ordem que foram incluidos
		System.out.println("***Mostrando valores na ordem lida***");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println("Grupo: "+(i+1)+" valor: "+(j+1)+": "+ grupoValores[i][j]);
			}
		}
		
		//Mostrar valores em odem crescente
		
		//Mostrar valores em odem decrescente
	}
}
