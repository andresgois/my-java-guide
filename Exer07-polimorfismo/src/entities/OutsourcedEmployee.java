package entities;

public class OutsourcedEmployee extends Employee {

	private double additionalChange;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, double valuePerhour, double additionalChange) {
		super(name, hours, valuePerhour);
		this.additionalChange = additionalChange;
	}

	public double getAdditionalChange() {
		return additionalChange;
	}

	public void setAdditionalChange(double additionalChange) {

		this.additionalChange = additionalChange;
	}
	

	@Override
	public double payment() {
		return super.payment() + (additionalChange * 1.1);
	}
	
	

	
	
}
