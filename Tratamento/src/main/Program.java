package main;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Reservation;
import model.Exception.DomainException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		// Solução Ruim
		/*System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in data (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out data (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		// testa se uma data é depois de outra
		if(!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-Out date must be after check-in date");
		}else {
			Reservation reseration = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: "+ reseration);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in data (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out data (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			/* Solução muito Ruin
			 * Date now = new Date();
			
			if(checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future");
			}
			else if(!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: Check-Out date must be after check-in date");
			}else {			
				reseration.updateDates(checkIn, checkOut);
				System.out.println("Reservation: "+ reseration);
			}
			// Solução ruin
			String error = reseration.updateDates(checkIn, checkOut);
			if( error != null) {
				System.out.println("Error in reservation: "+error);
			}else {
				System.out.println("Reservation: "+ reseration);
			}
		}*/
		
		// Solução Boa
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in data (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out data (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reseration = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: "+ reseration);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in data (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out data (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reseration.updateDates(checkIn, checkOut);
			System.out.println("Reservation: "+ reseration);
		} catch (ParseException e) {
			System.out.println("Invalid date format");
			
		} catch (DomainException e) {
			// TODO: handle exception
			System.out.println("Error in reservation: "+e.getMessage());
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("Unexpected error");
		}
		
		
			
		sc.close();
		System.out.println("");
	}

}
