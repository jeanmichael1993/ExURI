package atividades;

import java.util.Scanner;
import java.util.Locale;

/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B. */


public class ex1012 {
	
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double a, b, c, trian, circu, trape, quadra, retan, pi;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		pi = 3.14159;
		
		trian = 0.5 * (a * c);
		circu = pi * (c * c);
		trape = c * (a + b) / 2;	
		quadra = b * b;
		retan = a * b;
		
		
		
		System.out.printf("TRIANGULO: %.3f%n", trian);
		System.out.printf("CIRCULO: %.3f%n", circu);
		System.out.printf("TRAPEZIO: %.3f%n", trape);
		System.out.printf("QUADRADO: %.3f%n", quadra);
		System.out.printf("RETANGULO: %.3f%n", retan);
		
		
		
		sc.close();
		
		
		
		
		
	}

}
