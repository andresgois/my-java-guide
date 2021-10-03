package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax paypers: ");
		int n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			System.out.println("Tax payer #"+i+" data: ");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Individual or campany: ");
			char op = sc.next().charAt(0);
			System.out.print("Anual Income: ");
			double income = sc.nextDouble();
			
			if(op == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble(); 
				
				list.add(new Individual(name, income, health));
			}else {
				System.out.print("Number of employee: ");
				int number = sc.nextInt();
				list.add(new Company(name, income, number));
			}
		}
		
		System.out.println();
		System.out.print("TAXES PAID:");
		for(TaxPayer tp: list) {
			System.out.println(tp.getName()+" : R$ "+String.format("%.2f", tp.tax()));
		}
		
		System.out.println();
		Double total = 0.0;
		for(TaxPayer tp: list) {
			total +=  tp.tax();
		}
		System.out.println("Total Taxes: R$ "+String.format("%.2f", total));
		
		
		sc.close();
		System.out.println("");
	}

}
