package entities;

public class Company extends TaxPayer{

	private Integer numberEmployees;

	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double tax() {
		Double imp = 0.0;
		if (numberEmployees <= 10 ) {
			imp = getAnualIncome() * 0.16;
		}else {
			imp = (getAnualIncome() * 0.14);
		}
		return imp;
	}
	
	
}
