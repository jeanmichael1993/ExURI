package atividades;

import java.util.Scanner;
import java.util.Locale;

/*Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem, 
 * ao utilizar um autom�vel que faz 12 KM/L. Para isso, ele gostaria que voc� o auxiliasse atrav�s de um simples programa.
 *  Para efetuar o c�lculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade m�dia durante a mesma (em km/h). 
 *  Assim, pode-se obter dist�ncia percorrida e, em seguida, calcular quantos litros seriam necess�rios. Mostre o valor com 3 casas decimais ap�s o ponto.*/


public class ex1017 {
	
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int auto = 12, temgasto, velomedia;
		double qtdl, tempot;
		
		temgasto = sc.nextInt();
		velomedia = sc.nextInt();
		
		
		tempot = temgasto * velomedia;
		
		qtdl = tempot / auto;
		
		
		System.out.printf("%.3f%n", qtdl);
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}
	

}
