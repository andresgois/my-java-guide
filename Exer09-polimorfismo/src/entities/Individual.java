package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	
	public Individual(Double healthExpenditures) {
		super();
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		Double imp = 0.0;
		if (getAnualIncome() < 20000.0) {
			imp = getAnualIncome() * 0.15;
		}else {
			imp = (getAnualIncome() * 0.25) - (healthExpenditures * 0.50);
		}
		return imp;
	}

}
