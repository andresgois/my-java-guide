package br.com.principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*System.out.println("Digite um número");
		int x = sc.nextInt();
		testeFor(x);
		funcaoesString();*/
		Product p = new Product();
		System.out.println("Enter product data:");
		System.out.print("Name:  ");
		p.name = sc.next();
		System.out.print("Price:  ");
		p.price = sc.nextDouble();
		System.out.print("Quantity in stock:  ");
		p.quantity = sc.nextInt();
		
		//System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f",p.name,p.price,p.quantity, p.TotalValueInStock());
		System.out.println("Product data: "+p);
		System.out.println("\nEnter the number of products to be added in stock: ");
		int num = sc.nextInt();
		p.AddProducts(num);
		//System.out.printf("\nUpdate data: %s, $ %.2f, %d units, Total: $ %.2f",p.name,p.price,p.quantity, p.TotalValueInStock());
		System.out.println("Update data: "+p);
		
		System.out.println("\nEnter the number of products to be removed from stock: ");
		num = sc.nextInt();
		p.RemoveProducts(num);
		//System.out.printf("\nUpdate data: %s, $ %.2f, %d units, Total: $ %.2f",p.name,p.price,p.quantity, p.TotalValueInStock());
		System.out.println("Update data: "+p);
		
		sc.close();
	}
	
	public static int testeFor(int x) {
		
		while (x >= 1) {
			System.out.println("Hello: " + x);
			x--;
		}
		System.out.println("\n");
		int i;
		for (i = 0; i < 5; i++) {
			System.out.printf("[i] = %d\n", i);
		}
		return x;
	}

	public static void funcaoesString() {
		// 0123456789 10 11 12 13 14 15 16
		String original = "  olá como vai?  ";

		System.out.println(original);
		System.out.println(original.toLowerCase());
		System.out.println(original.toUpperCase());
		System.out.println(original.trim());
		System.out.println(original.substring(8));
		System.out.println(original.substring(2, 9));
		System.out.println(original.replace("o", "0"));
		System.out.println(original.indexOf("ai"));
		System.out.println(original.lastIndexOf("ai"));
		// 0 1 0
		String s = "limão,uva,manga";
		String[] vet = s.split(",");
		System.out.println(vet[2]);
	}

}
