package atividades;
import java.util.Scanner;
import java.util.Locale;

public class Ex1168 {
	
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);	
	Locale.setDefault(Locale.US);
		
	int[] leds = {6,2,5,5,4,5,6,3,7,6};
	
	int n = sc.nextInt();
	
	for(int i=0;i<n;i++) {
		
		String numero = sc.next();
		int soma = 0;
		for(int j=0;j<numero.length();j++) {
			
			
			soma = soma + leds[numero.charAt(j) - '0'];
			
			
		}
		
		System.out.println(soma + "leds");
		
	}
		
		
		
		
	
	
	sc.close();
		
	}

}
