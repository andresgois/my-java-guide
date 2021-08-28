package br.com.principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.ProductComConstructor;
import entities.ProductVector;
import entities.Rooms;


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
		//Employee(sc);
		// CLASSE COM MÈTODOS ESTÁTICOS
		/*double x = calculator(50);
		System.out.printf("Valor:\t%.2f\n",x);
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		int qtd = sc.nextInt();
		double v = CurrencyConverter.converte(dollar, qtd);
		System.out.printf("Amount to be paid in reais = %.2f\n",v);*/
		
		//EmployeeComConstructor(sc);
		//vetores(sc);
		//ProductVetc(sc);
		room(sc);
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

	public static void Employee(Scanner sc) {
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
	
	public static double calculator(int x) {
		return x*x;
	}
	
	public static void EmployeeComConstructor(Scanner sc) {
		
		//ProductComConstructor p = new ProductComConstructor();
		
		System.out.println("Enter product data:");
		System.out.print("Name:  ");
		String name = sc.next();
		System.out.print("Price:  ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock:  ");
		int quantity = sc.nextInt();
		
		ProductComConstructor p = new ProductComConstructor(name, price, quantity);
		
		p.setName("Computer");
		System.out.println("Update product name: "+p.getName());
		p.setPrice(1200.00);
		System.out.println("Update product price: "+p.getPrice());
		
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
	
	public static void vetores(Scanner sc) {
				
		System.out.println("Quantidade de pessoas");
		int n = sc.nextInt();
		double[] altura = new double[n];
		double m = 0.0;
		
		
		System.out.println("Digite as alturas");
		for(int i=0; i< n; i++) {
			altura[i] = sc.nextDouble();
			m += altura[i];
		}
		System.out.printf("Média de altura = %.2f",(m/n));
		
		
	}

	public static void ProductVetc(Scanner sc) {
		double sum = 0.0;
		System.out.print("qunatity of products: ");
		int n = sc.nextInt();
		
		ProductVector[] products = new ProductVector[n];
		
		for(int i = 0; i < products.length; i++) {
			System.out.println("Enter Product #"+(i+1));
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			products[i] = new ProductVector(name, price);
			sum += products[i].getPrice();
		}
		
		
		System.out.printf("Total = %.2f",sum);
	}

	public static void room(Scanner sc) {
		
		Rooms[] room = new Rooms[10];
		
		System.out.print("Number of students: ");
		int n = sc.nextInt();
		
		for(int i=0; i< n;i++) {
			sc.nextLine();
			System.out.println("Enter name, email and room number of students:");
			System.out.println("Rent #"+(i+1));
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int q = sc.nextInt();
			System.out.println();
			room[q] = new Rooms(name, email);
		}
		
		System.out.println("Busy rooms");
		int x = 0;
		
		while(x < 10) {
			if(room[x] != null) System.out.println(x+": "+room[x]);
			x++;
		}
		
	}
	
	
}
