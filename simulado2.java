package atividades;

import java.util.Scanner;
import java.util.Locale;

public class simulado2 {
	
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, valorca, entrada, presta;
		
		salario = sc.nextDouble();
		valorca = sc.nextDouble();
		
		if(salario <= 1000.0) {
			
			entrada = valorca * 0.60;
			presta = (valorca - entrada) / 12;
			System.out.printf("ENTRADA = R$ %.2f%n", entrada);
			System.out.printf("PRESTACAO = R$ %.2f%n", presta);
			
			
		}
		
		else if(salario > 1000.0 && salario <= 2000.0) {
			
			entrada = valorca * 0.40;
			presta = (valorca - entrada) / 24;
			System.out.printf("ENTRADA = R$ %.2f%n", entrada);
			System.out.printf("PRESTACAO = R$ %.2f%n", presta);
		}
		
		else if (salario > 2000.0 && salario <= 5000.0) {
			
			entrada = valorca * 0.20;
			presta = (valorca - entrada) / 36;
			System.out.printf("ENTRADA = R$ %.2f%n", entrada);
			System.out.printf("PRESTACAO = R$ %.2f%n", presta);
		}
		
		else {
			
			entrada = valorca * 0.10;
			presta = (valorca - entrada) / 48;
			System.out.printf("ENTRADA = R$ %.2f%n", entrada);
			System.out.printf("PRESTACAO = R$ %.2f%n", presta);
			
		}
		
		sc.close();
		
		
	}

}
