package atividades;

import java.util.Scanner;
import java.util.Locale;

/*Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas 
 * efetuadas por ele no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o 
 * sobre suas vendas efetuadas, informar o total a receber no final do m�s, com duas casas
 *  decimais.*/

public class ex1009 {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		String nome;
		Double slfixo, montotal,total;
		nome = sc.nextLine();
		slfixo = sc.nextDouble();
		montotal = sc.nextDouble();
		
		total = montotal * 0.15;
		total = total + slfixo;
		
		
		
		
		
		
		System.out.printf("TOTAL = R$ %.2f%n",total);	
		
		
		
		
		
		sc.close();
		
		
		
	}
	

}
