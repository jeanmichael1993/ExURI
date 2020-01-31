package atividades;


import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {
	
	public static void main (String [] args) {
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    double n,m;
		double nota0 = 0, nota1, nota2 ,nota3 , nota4, nota5, nota6, nota7, nota8, nota9, nota10, nota11;
		
		n = sc.nextDouble();
		
		m = n * 100;
		nota0 = (n/100.0);
		n %= 100;
		nota1 =n / 50;
		n %= 50;
		nota2 = n  / 20;
		n %= 20;
		nota3 = n / 10;
		n %= 10;
		nota4 = n / 5;
		n %= 5;
		nota5 = n / 2;
		n %= 2;
		
		nota6 = n / 1;
		n %= 1;
		
		m = m % 100;
		nota7 =  m / 50;
		m %= 50;
		nota8 = m / 25;
		m %= 25;
		nota9 = m / 10;
		m %= 10;
		nota10 = m / 5;
		m %= 5;
		nota11 = m;
		
		
		
				
		
		
			System.out.println("NOTAS:");
		    System.out.println((int)nota0 + " nota(s) de R$ 100.00");
		    System.out.println((int)nota1 + " nota(s) de R$ 50.00");
		    System.out.println((int)nota2 + " nota(s) de R$ 20.00");
		    System.out.println((int)nota3 + " nota(s) de R$ 10.00");
		    System.out.println((int)nota4 + " nota(s) de R$ 5.00");
		    System.out.println((int)nota5 + " nota(s) de R$ 2.00");
		    System.out.println("MOEDAS:");
		    System.out.println((int)nota6 + " moeda(s) de R$ 1.00");
		    System.out.println((int)nota7 + " moeda(s) de R$ 0.50");
		    System.out.println((int)nota8 + " moeda(s) de R$ 0.25");
		    System.out.println((int)nota9 + " moeda(s) de R$ 0.10");
		    System.out.println((int)nota10 + " moeda(s) de R$ 0.05");
		    System.out.println((int)nota11 + " moeda(s) de R$ 0.01");
		    
		
		
		
		sc.close();
		
		
		
		
	}
	

}
