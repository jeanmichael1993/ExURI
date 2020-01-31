import java.util.Scanner;
import java.util.Locale;

public class Ex1047 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int a0,a1,a2,a3;
		int hora, min , duracao;

		a0 = sc.nextInt();
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		a3 = sc.nextInt();
		
		
		a0 = a0 * 60 + a1;
		a2 = a2 * 60 + a3;
		
		if (a0 < a2) {
			
			duracao = a2 - a0;
		}
		
		else {
			
			duracao = (24 * 60 - a0) + a2;
		}
		
		
		hora = duracao / 60;
		min = duracao % 60;
		

		System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + min+ " MINUTO(S)");

		sc.close();

	}
}
