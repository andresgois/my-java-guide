package entities;

public class Products {

	private String name;
	private Double price;
	private Integer quantity;
	
	public Products() {}
	
	public Products(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double total() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return "Product: "+name + ", R$ "+String.format("%.2f", total());
	}
	
	
}