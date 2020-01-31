package atividades;
import java.util.Locale;
import java.util.Scanner;

/* Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2
 * . Após, calcule e mostre o valor a ser pago.*/



public class ex1010 {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a1, b1, a2, b2;
		double c1, c2, valorf;
		
		
		a1 = sc.nextInt();
		b1 = sc.nextInt();
		c1 = sc.nextDouble();
		a2 = sc.nextInt();
		b2 = sc.nextInt();
		c2 = sc.nextDouble();
		
		valorf = (b1 * c1) + (b2 * c2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorf);
	    
		
		sc.close();
		
		
	}

}
