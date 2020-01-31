package atividades;
import java.util.Scanner;
import java.util.Locale;


/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) 
 * e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:
 */



public class ex1015 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double x1, y1, x2, y2, dista;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble(); 
		y2 = sc.nextDouble();
		
		dista = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
		
		
		System.out.printf("%.4f%n", dista);
		
		
		
		
		
		sc.close();
		
		
		
		
	}

}
