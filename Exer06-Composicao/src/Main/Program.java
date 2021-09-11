package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import Entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Date d = new Date();		
		//System.out.println(d); 						//Sat Sep 11 09:46:21 BRT 2021
		//System.out.println(sdf.format(new Date()));	//11/09/2021 09:46:21
		Client client = new Client();

		// Adding a client
		System.out.println("Enter cliente data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		client = new Client(name, email, birthDate);
		

		System.out.println("Enter order data:");		
		System.out.print("Status: ");
		String status = sc.next();
		sc.nextLine();
		

		List<OrderItem> item = new ArrayList<>();
		OrderItem it;
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter #"+(i+1)+" item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			it = new OrderItem(quantity, price,new Product(productName, price));			
			item.add(it);
			
		}
		Date moment = new Date();
		Order order = new Order(moment, OrderStatus.valueOf(status), client, item);
		
		
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
	}

}
