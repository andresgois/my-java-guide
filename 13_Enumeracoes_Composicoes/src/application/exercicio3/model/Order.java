package application.exercicio3.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import application.enums.OrderStatus;

public class Order {
    
    private static final SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static final SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    
    private Date moment;
    private OrderStatus status;
    
    private List<OrderItem> orderItens = new ArrayList<>();
    private Client client;
    
    public Order() {}

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItens() {
        return orderItens;
    }

    
    public void addItem(OrderItem item) {
        orderItens.add(item);
    }
    
    public void addRemove(OrderItem item) {
        orderItens.remove(item);
    }
    
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double total() {
        Double total = 0.0;
        for (OrderItem orderItem : orderItens) {
            total += orderItem.subTotal();
        }
        return total;
    }
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Order moment: ");
        sb.append(sdf1.format(moment));
        sb.append("\n");
        sb.append("Order status: ");
        sb.append(status);
        sb.append("\n");
        sb.append("Client: ");
        sb.append(getClient().getName() + "("+sdf2.format(getClient().getBithDate())+") - "+getClient().getEmail());
        sb.append("\n");
        sb.append("Order itens: \n");
        for (OrderItem orderItem : orderItens) {
            sb.append(orderItem);
            sb.append("\n");
        }
        sb.append("Total price: $ ");
        sb.append(total());
        
        return sb.toString();
    }
    
}
