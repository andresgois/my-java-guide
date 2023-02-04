package application.exercicioProducts;

public class ImportedProduct extends Product{
    
    private Double customFee;

    
    @Override
    public String priceTag() {
        return getName() 
                + " $ " 
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ " 
                + String.format("%.2f", customFee)
                + ")";
    }
    
    public Double totalPrice() {
        return this.getPrice() + customFee;
    }
    
    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

}
