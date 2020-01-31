package atividades;

import java.util.Scanner;
import java.util.Locale;

public class Ex1181 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int linha = sc.nextInt();
		char t = sc.next().charAt(0);

		double[][] m = new double[4][4];
		double soma = 0.0, media = 0.0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				m[i][j] = sc.nextDouble();

			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				if (linha == i) {

					soma = m[i][j] + soma;

				}

			}

		}

		if (t == 'S') {

			System.out.printf("%.1f%n", soma);
		}

		else {
			media = soma / 4;
			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}

}
