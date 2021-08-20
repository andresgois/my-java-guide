package br.com.principal;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int x = sc.nextInt();
		while(x > 1){
			System.out.println("Hello: "+x);
			x--;
		}
		
		
	}

}
