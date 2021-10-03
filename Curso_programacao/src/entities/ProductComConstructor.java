package entities;

public class ProductComConstructor {
	// Encapsulamento
	private String name;
	private double price;
	private int quantity;
	
	// Sobrecarga
	public ProductComConstructor() {}
	
	public ProductComConstructor(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public ProductComConstructor(String name, double price, int quantity) {
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
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public double TotalValueInStock() {
		return quantity * price;
	}

	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}

	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", TotalValueInStock());
	}
}
