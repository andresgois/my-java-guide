package application.exercicio3.model;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    
    private Integer quantity;
    private Double price;
    
    private List<Product> product = new ArrayList<>();

    public OrderItem() {}
    
    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Product> getProduct() {
        return product;
    }
    
    public void addProduct(Product p) {
        product.add(p);
    }
    
    public void removeProduct(Product p) {
        product.remove(p);
    }
    
    public Double subTotal() {
        Double total = 0.0;
        for (Product p : product) {
            total += quantity * p.getPrice();
        }
        return total;
    }
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Product p : product) {
            sb.append(p.getName()+", $");
            sb.append(p.getPrice()+", ");
            sb.append(quantity);
            sb.append(", SubTotal: $ "+subTotal());
        }
        
        return sb.toString();
    }
}
