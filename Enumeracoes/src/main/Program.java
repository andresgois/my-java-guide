package main;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		//trabralhandoComEnums();
		
		
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
	
}
