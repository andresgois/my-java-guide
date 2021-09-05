package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {

	private Integer Id;
	private Date momment;
	private OrderStatus status;
	
	public Order() {}

	public Order(Integer id, Date momment, OrderStatus status) {
		Id = id;
		this.momment = momment;
		this.status = status;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Date getMomment() {
		return momment;
	}

	public void setMomment(Date momment) {
		this.momment = momment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [Id=" + Id + ", momment=" + momment + ", status=" + status + "]";
	}
	
	
}
