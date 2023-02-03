package application.exercicioEmployee;

public class OutsourceEmployee extends Employee {
    
    private Double additionalCharge;

    public OutsourceEmployee(String name, Integer hour, Double valuePerHour,
            Double additionalCharge) {
        super(name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    
    @Override
    public Double payment() {
        Double total = (this.additionalCharge * 110) / 100;
        return super.payment() + total;
    }
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.getName());
        sb.append(" - $ ");
        sb.append( String.format("%.2f", payment()));
        return sb.toString();
    }
}
