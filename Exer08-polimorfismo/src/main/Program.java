package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitties.ImportedProduct;
import entitties.Product;
import entitties.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> product = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			System.out.println("Prodcut #"+i+" data: ");
			System.out.print("Common, used or imported (c/u/i): ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Customs fee: ");
				double custom = sc.nextDouble();
				product.add(new ImportedProduct(name, price, custom));
				
			}else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY) :");
				Date data = sdf.parse( sc.next());
				product.add(new UsedProduct(name, price, data));
			}else {
				product.add(new Product(name, price));
			}
		}
		
		
		System.out.println("\nPRICE TAGS:");
		for(Product p: product) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
		
	}

}
