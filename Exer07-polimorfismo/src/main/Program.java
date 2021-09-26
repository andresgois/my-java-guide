package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		List<Employee> employee = new ArrayList<>();
		
		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Employee #"+i+" data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("Hours: ");
			int hour = sc.nextInt();
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			
			//if(ch.equalsIgnoreCase("y")) {
			if(ch == 'y') {
				System.out.print("Additional  charge: ");
				double add = sc.nextDouble();
				employee.add(new OutsourcedEmployee(name, hour, value, add));
			}
			else {
				employee.add(new Employee(name, hour, value));
			}
		}
		
		System.out.println("Payments: ");
		for(Employee emp: employee) {
			System.out.println(emp.getName()+" - R$ "+emp.payment());
		}
		
		System.out.println();
		sc.close();
	}
}
