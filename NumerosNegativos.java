package application;

import java.util.Locale;
import java.util.Scanner;

public class NumerosNegativos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		int []vetor = new int[n];
		
		for(int i=0; i<vetor.length;i++) {
			System.out.println("Digite um numero:");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos:");
		for(int i=0; i<vetor.length;i++) {
			if(vetor[i]<0) {
				System.out.printf("%d%n", vetor[i]);
			}
		}
		
		sc.close();
	}
}
