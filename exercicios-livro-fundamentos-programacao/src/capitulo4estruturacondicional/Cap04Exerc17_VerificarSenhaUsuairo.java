package capitulo4estruturacondicional;
import java.util.Scanner;

public class Cap04Exerc17_VerificarSenhaUsuairo {

	public static void main(String[] args) {
		
		String senha = "";
		
		Scanner t = new Scanner(System.in);
		System.out.println("Informe a senha: ");
		senha = t.next();
		if(senha.equals("4531")) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Senha incorreta! acesso não permitido");
		}
	}
}
