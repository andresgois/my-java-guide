package application.exercicioProducts;

public class ImportedProduct extends Product{
    
    private Double customFee;

    
    @Override
    public String priceTag() {
        return super.priceTag()+ " Custom fee: $ "+String.format("%.2f", this.customFee);
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
    
    @Override
    public String toString() {
        return this.priceTag();
    }
    
}
