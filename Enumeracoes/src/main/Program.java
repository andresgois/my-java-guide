package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Department;
import entities.HourContract;
import entities.Order;
import entities.Post;
import entities.Worker;
import entities.enums.OrderStatus;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//trabralhandoComEnums();
		//contractOfEmployee(sc);
		postComment(sc);
		
		sc.close();
		
	}

	public static void trabralhandoComEnums() {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		// CONVERTER STRING PARA ENUM
		
		OrderStatus os1 = OrderStatus.PENDING_PAYMENT;
		OrderStatus os2 = OrderStatus.valueOf("PENDING_PAYMENT");
		
		System.out.println(os1);
		System.out.println(os1.getClass());
		System.out.println(os2);
	}
	
	public static void contractOfEmployee(Scanner sc) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Enter deparment´s name: ");
		String departamentName = sc.nextLine();
		System.out.println("Enter worker data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departamentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter contract #"+(i+1)+" data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double perHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(date, perHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDepartment().getName());
		System.out.println("Income for "+monthAndYear+": "+ worker.income(year, month));
		
	}

	public static void postComment(Scanner sc) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
		//Date date = sdf.parse("28/07/2018 23:14:19");
		
		Post p1 = new Post(sdf.parse("28/07/2018 23:14:19"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		System.out.println(p1);
		System.out.println("");
		
		
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),"Good night guys","See you tomorrow",5);
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		p2.addComment(c3);
		p2.addComment(c4);
		System.out.println(p2);
		
	}
}
