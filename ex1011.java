package atividades;

import java.util.Scanner;
import java.util.Locale;

/* Fa�a um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
 *  A f�rmula para calcular o volume �: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.

Dica: Ao utilizar a f�rmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), assumem que o resultado da
 divis�o entre dois inteiros � outro inteiro.*/

public class ex1011 {
	
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double r, vol, pi = 3.14159;
		
		r = sc.nextDouble();
		
		vol = (4.0/3) * pi * Math.pow(r,3);
		
		
		
		System.out.printf("VOLUME = %.3f%n", vol);
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}

}
