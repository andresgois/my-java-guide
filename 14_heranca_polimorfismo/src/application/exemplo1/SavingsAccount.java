package application.exemplo1;

public class SavingsAccount extends Account {
    
    private Double interesrRate;

    public SavingsAccount(Double interesrRate) {
        super();
        this.interesrRate = interesrRate;
    }

    public SavingsAccount(Integer number, String holder, Double balance,
            Double interesrRate) {
        super(number, holder, balance);
        this.interesrRate = interesrRate;
    }

    public Double getInteresrRate() {
        return interesrRate;
    }

    public void setInteresrRate(Double interesrRate) {
        this.interesrRate = interesrRate;
    }
    
    public void updateBalance() {
        balance += balance * interesrRate;
    }
    
    @Override
    public void withdraw(Double amount) {
        this.balance -= amount;
    }
}
