package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities.enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus staus;
	
	Client clients = new Client();
	List<OrderItem> orderItem = new ArrayList<>();
	
	public Order() {}

	public Order(Date moment, OrderStatus staus, Client clients, List<OrderItem> orderItem) {
		this.moment = moment;
		this.staus = staus;
		this.clients = clients;
		this.orderItem = orderItem;
	}

	public void addItem(OrderItem item) {
		orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}
	
	public double total() {
		double total = 0.0;
		
		for(OrderItem item: orderItem) {
			total += item.subTotal();
		}
		
		return total;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStaus() {
		return staus;
	}

	public void setStaus(OrderStatus staus) {
		this.staus = staus;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nOrder moment: ");
		sb.append(sdf2.format(moment)+"\n");
		sb.append("Order status: ");
		sb.append(getStaus()+"\n");
		sb.append("Client: ");
		sb.append(clients.getName()+" ");
		sb.append("("+sdf.format(clients.getBirthDate())+") ");
		sb.append(clients.getEmail()+"\n");		
		sb.append("Order items: \n");
		
		for(int i=0; i<orderItem.size(); i++) {
			sb.append(orderItem.get(i).products.getName()+", $ ");
			sb.append(String.format("%.2f", orderItem.get(i).products.getPrice())+", ");
			sb.append("Quantity: ");
			sb.append(orderItem.get(i).getQuantity()+", ");
			sb.append("Subtotal: $ ");
			sb.append(String.format("%.2f", orderItem.get(i).subTotal())+"\n");
		}
		sb.append("Total Price: $ ");
		sb.append(String.format("%.2f", total()));
				
		return sb.toString();
	}
	
	
	
}
