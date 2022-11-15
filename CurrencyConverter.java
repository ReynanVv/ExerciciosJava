package util;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
	public static void main(String[] args) {
		final double IOF = 0.6;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter dollar price: ");
		double dolValue = sc.nextDouble();
		System.out.print("How many dollars you want to bought?: ");
		double dolQnt = sc.nextDouble();
		
		double result = converter(dolValue,dolQnt,IOF);
		System.out.printf("Amount to be paid in reais: %.2f", result);
		
	}
	public static double converter(double dolValue, double dolQnt,double IOF) {
		return (dolQnt * dolValue)  / IOF;
	}
}
