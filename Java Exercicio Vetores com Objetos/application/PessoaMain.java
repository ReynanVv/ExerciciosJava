package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class PessoaMain {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		Pessoa[] vet = new Pessoa[n];
		double[] alturas = new double[n];
		for(int i=0;i<n;i++) {
			System.out.println("Dados da "+(i+1)+" pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
						
			System.out.print("Idade: ");
			int idade = sc.nextInt();

			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			alturas[i] = altura;
			
			vet[i] = new Pessoa(nome,idade,altura);
		}
		System.out.println();
		System.out.print("Altura media: ");
		
		double alturatotal = 0;
	    for (int i=0; i<n; i++) {
	        alturatotal = alturatotal + alturas[i];
	    }
	    double alturamedia = alturatotal / n;
		System.out.printf("%.2f", alturamedia);
		
		System.out.println();
		System.out.println("Pessoas: ");
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.println(vet[i]);
		}
		sc.close();
	}
}
