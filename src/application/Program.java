package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitties.Departament;
import entitties.HourContract;
import entitties.Worker;
import entitties.enums.WorkerLevel;


public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com o departamento: ");
		String departmentName = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador: ");

		System.out.println("Nome: ");
		String workerName = sc.nextLine();

		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.println("Salario Base: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departmentName));
		
		System.out.print("Quantos Contratos para esse trabalhador? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Entre com o contrato #"+i+" data:");
			System.out.print("Data (DD/MM/AAAA): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por Hora: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duracao (horas): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract); 
			
		}
		System.out.println();
		System.out.println("Entre com o mês e ano para calcular o total (MM/AAAA) : ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Nome: "+worker.getName());
		System.out.println("Departamento: "+worker.getDepartament().getName());
		System.out.println("Total para "+monthAndYear+": "+ String.format("%.2f", worker.income(year, month)));
		
		
		sc.close();
	}

}
