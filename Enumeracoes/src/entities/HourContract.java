package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private double valuesPerHour;
	private Integer hours;
	
	public HourContract() {}

	public HourContract(Date date, double valuesPerHour, Integer hours) {
		this.date = date;
		this.valuesPerHour = valuesPerHour;
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuesPerHour * hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuesPerHour() {
		return valuesPerHour;
	}

	public void setValuesPerHour(double valuesPerHour) {
		this.valuesPerHour = valuesPerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	
	
	
}
