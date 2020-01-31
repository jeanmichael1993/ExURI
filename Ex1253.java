package atividades;

import java.util.Scanner;
import java.util.Locale;

public class Ex1253 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Z_cod = (int) 'Z'; 
		int A_cod = (int) 'A';
		
		int n = sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
			
		String s = sc.next();
		int qtd = sc.nextInt();	
		
		String saida = "";
		
			for(int j=0;j<s.length();j++) {
				
				int codigo = (int)s.charAt(j);
				codigo = codigo - qtd;
				
				if(codigo < A_cod) {
					
					
					codigo = Z_cod - (A_cod - codigo) + 1;
					
					
				}
				
				saida = saida + (char)codigo;
				
				
				
				
				
				
			}
			
			System.out.println(saida);
			
			
		}
				
		
		
		sc.close();
	}

}
	

