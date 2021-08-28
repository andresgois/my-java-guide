package curso;

import java.util.Locale;
import java.util.Scanner;

import entity.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account ac;
		System.out.print("Enter account number: ");
		String numberAccount = sc.next();
		System.out.print("Enter account holder: ");
		String name = sc.next();
		System.out.print("Is there na initial deposit (y/n)? ");
		String deposit = sc.next();
		sc.nextLine();
		if(deposit.equalsIgnoreCase("y")) {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			ac = new Account(numberAccount, name, initialDeposit);
		}else {
			ac = new Account(numberAccount, name);
		}
		
		System.out.println("Account data: ");
		System.out.println(ac);
		// Deposit
		System.out.print("Enter a deposit value: ");
		double depo = sc.nextDouble();
		ac.deposit(depo);
		
		System.out.println("Updated account data:");
		System.out.println(ac);
		// WithDraw
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		ac.withdraw(withdraw);
		
		System.out.println("Updated account data:");
		System.out.println(ac);
	}

}
