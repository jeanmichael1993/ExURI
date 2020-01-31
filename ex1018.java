package atividades;

import java.util.Scanner;
import java.util.Locale;

/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o
 *  valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir 
 *  mostre o valor lido e a relação de notas necessárias.*/


public class ex1018 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor, valor1, valor2, valor3, valor4, valor5, valor6, valor7,valorfim;
		
		valor = sc.nextInt();
		valorfim = valor;
	    valor1 = valor/ 100;
	    valor2 = (valor - (valor1 * 100)) / 50;
	    valor = valor - (valor1 * 100);
	    valor3 = (valor - (valor2 * 50)) / 20;
	    valor = valor - (valor2 *50);
	    valor4 = (valor - (valor3 * 20)) / 10;
	    valor = valor - (valor3 * 20);
	    valor5 = (valor - (valor4 * 10)) / 5;
	    valor = valor - (valor4 * 10);
	    valor6 = (valor - (valor5 * 5)) / 2;
	    valor = valor - (valor5 * 5);
	    valor7 = (valor - (valor6 * 2)) / 1;
	    
	    System.out.println(valorfim);
	    System.out.printf("%d nota(s) de R$ 100,00%n", valor1);
	    System.out.printf("%d nota(s) de R$ 50,00%n", valor2);
	    System.out.printf("%d nota(s) de R$ 20,00%n", valor3);
	    System.out.printf("%d nota(s) de R$ 10,00%n", valor4);
	    System.out.printf("%d nota(s) de R$ 5,00%n", valor5);
	    System.out.printf("%d nota(s) de R$ 2,00%n", valor6);
	    System.out.printf("%d nota(s) de R$ 1,00%n", valor7);
	    
		
		
		
		
		
		
		sc.close();
	}

}






