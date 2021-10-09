package Application;

import java.util.Locale;
import java.util.Scanner;

import Model.Domain.Exception.DomainException;
import Model.entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Name: ");
			String holder = sc.next();
			System.out.print("Initial Balance: ");
			Double balance = sc.nextDouble();
			System.out.print("withdraw limit: ");
			Double limit = sc.nextDouble();
			
			Account ac = new Account(number, holder, balance, limit);
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			Double withdraw = sc.nextDouble();
			ac.withdraw(withdraw);
			
			System.out.println();
			System.out.println("New balance: "+String.format("%.2f", ac.getBalance()));
		} catch(DomainException e) {
			System.out.println("Withdraw error: "+e.getMessage());
		}	
		
		System.out.println();
	}

}
