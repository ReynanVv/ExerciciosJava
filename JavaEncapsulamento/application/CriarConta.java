package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class CriarConta {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta account;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter accont holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Conta(number, holder, initialDeposit);
		}
		else {
			account = new Conta(number, holder);
		}
		
		System.out.println();
		System.out.println("Acount data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposito(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.saque(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
