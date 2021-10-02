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
		// TODO Auto-generated method stub
		return null;
	}

}
