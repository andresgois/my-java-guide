package Entities;

public class Student {
	
	public String name;
	public double notes[] = new double[3];
	
	
	public String PassedOn() {
		if(finalGrade() > 60.00) {
			return "PASS";
		}else {
			return "FAILED\nMISSING "+String.format("%.2f", (60.00 - finalGrade()))+" POINTS";
		}
	}
	
	public double finalGrade() {
		double total = 0.0;
		for(int i=0; i < notes.length; i++) {
			total += notes[i];
		}
		return total;
	}
	
		
}
