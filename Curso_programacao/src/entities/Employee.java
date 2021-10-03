package entities;

public class Employee {

	
	private int id;
	private String nome;
	private double salary;
	
	public Employee() {}
	
	public Employee(int id, String nome, double salary) {
		this.id = id;
		this.nome = nome;
		this.salary = salary;
	}
	
	public void incrementSalary(double percentage) {
		this.salary += salary * (percentage / 100); 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalary() {
		return salary;
	}

	
	
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return id+", "+nome+", "+String.format("%.2f", salary);
	}
	
}
