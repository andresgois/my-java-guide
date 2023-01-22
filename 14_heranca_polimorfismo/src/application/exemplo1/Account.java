package application.exemplo1;

public class Account {
   
    private Integer number;
    private String holder;
    protected Double balance;
    
    public Account() {}

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    
    public void deposit(Double amount) {
        this.balance += amount;
    }
    
    public void withdraw(Double amount) {
        this.balance -= amount;
    }
    
}
