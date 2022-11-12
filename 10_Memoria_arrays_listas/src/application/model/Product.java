package application.model;

public class Product {
  
    private String name;
    private double price;
    
    public Product() {}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Product: [ ");
        sb.append("Name: ");
        sb.append(this.name);
        sb.append(" - ");
        sb.append("Price: R$ ");
        sb.append(String.format("%.2f", this.price));
        sb.append("] ");
        return sb.toString();
    }
}
