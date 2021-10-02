package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Enums.Color;
import entities.Circle;
import entities.Retangulo;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * Exemplo01
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING	
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		// Verifica se acc3 é instância de BusinessAccount
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account conta = new Account(1001, "Alex", 1000.0);
		conta.withDraw(100.0);
		System.out.println(conta.getBalance());
		
		SavingsAccount contaSave = new SavingsAccount(10, "Andre", 1000.0, 0.01);
		contaSave.withDraw(100.0);
		System.out.println(contaSave.getBalance());
		
		BusinessAccount bsa = new BusinessAccount(145, "Márcio", 1000.0, 0.01);
		bsa.withDraw(100.0);
		System.out.println(bsa.getBalance());*/
		
		// Exemplo 02
		/*
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withDraw(50.0);
		y.withDraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		*/
		
		// Exemplo 03
		/*List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Andre", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Andreia", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Beatriz", 500.0, 500.0));
		
		double sum = 0.0;
		for(Account c: list) {
			sum += c.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for(Account c: list) {
			c.deposit(10.0);
		}
		
		for(Account c: list) {
			System.out.printf("Update balance for account %d: %.2f%n", c.getNumber(),c.getBalance());
		}*/
		
		// Exercício 04
		List<Shape> list = new ArrayList<>();
		System.out.println("Enter the number of shapes");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #"+i+" data:");
			System.out.print("Rectangle or Circle (r/c)?  ");
			char op = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color cor = Color.valueOf(sc.next());
			
			if(op == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Retangulo(cor, width, height));
			}else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(radius));
			}					
		}
		
		System.out.println("\nSHAPE AREAS:");
		for(Shape s: list) {
			System.out.println(String.format("%.2f",s.area()));
		}
		
		sc.close();
		System.out.println();
	}

}
