package main;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		System.out.println(bsa.getBalance());
		
	}

}
