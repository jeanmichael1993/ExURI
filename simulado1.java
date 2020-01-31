package atividades;

import java.util.Scanner;
import java.util.Locale;

public class simulado1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double a, b, c, media, mediafim;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		
		media = (a + b + c) / 3;
		
		if(media >= 7.0) {
			
			System.out.printf("MEDIA = %.1f%n", media);
			System.out.println("Aprovado");
			
		}
		else if (media <= 4.0) {
			
			System.out.printf("MEDIA = %.1f%n", media);
			System.out.println("Reprovado");
			
		}
		else {
			
			System.out.printf("MEDIA = %.1f%n", media);
			System.out.println("Exame");
			mediafim = 7.0 - media;
			System.out.printf("Faltaram %.1f pontos", mediafim);
			
		}
		

		
		
		sc.close();
		
		
		
		
	}
	
	

}
