package atividades;
import java.util.Scanner;
import java.util.Locale;

/*Escreva um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por hora e calcula 
 * o sal�rio desse funcion�rio.
 *  A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.*/

public class ex1008 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salarioFunc, salarioF;
		int numfun, qtdhtr;
		
		numfun = sc.nextInt();
		qtdhtr = sc.nextInt();
		salarioFunc = sc.nextDouble();
		
		salarioF = qtdhtr * salarioFunc;
		
			
		
		System.out.println("NUMBER = " + numfun);
		System.out.printf("SALARY = U$ %.2f%n", salarioF);

		
		
		sc.close();
		
		
		
	}
	

}
