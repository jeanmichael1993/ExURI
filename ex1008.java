package atividades;
import java.util.Scanner;
import java.util.Locale;

/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula 
 * o salário desse funcionário.
 *  A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/

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
