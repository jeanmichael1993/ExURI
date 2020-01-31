package atividades;

import java.util.Scanner;
import java.util.Locale;


public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, media, pesoA, pesoB, pesoC;
		
		pesoA = 2;
		pesoB = 3;
		pesoC = 5;
		
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		media = (a * pesoA) + (b * pesoB) + (c * pesoC);
		media = media / (pesoA + pesoB + pesoC);
		
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		
		
		
		sc.close();
		
	}
	
}