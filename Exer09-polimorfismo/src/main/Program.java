package main;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax paypers: ");
		int n = sc.nextInt();
		
		for(int i=1; i < n; i++) {
			System.out.print("Tax payer #"+i+" data: ");
			
		}
		
		
		sc.close();
		System.out.println("");
	}

}
