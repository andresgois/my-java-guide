package Entities;

public class Employee {
	
	public String name;
	public double gossSalary;
	public double tax;
	
	public double NetSalary() {
		return gossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		this.gossSalary += (this.gossSalary * (percentage / 100));
	}
	
	public String toString() {
		return name
				+", $"
				+String.format("%.2f", NetSalary());
	}
}
