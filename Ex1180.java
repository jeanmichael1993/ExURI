package atividades;

import java.util.Scanner;
import java.util.Locale;

public class Ex1180 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, menor = 0, posicao = 0, maior = 0;

		n = sc.nextInt();
		int[] x = new int[n];

		for (int i = 0; i < n; i++) {

			x[i] = sc.nextInt();

			if (x[i] > maior) {

				maior = x[i];
			}
		}
		menor = maior;
		for(int i=0;i<n;i++) {
			
			if(x[i] < menor) {
				
				menor = x[i];
				posicao = i;
				
			}
			
		}
		
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posicao);
		sc.close();
	}

}
