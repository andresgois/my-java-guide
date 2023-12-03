package br.com.andresgois.tiposCurringa;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5,2,10);
		printList(myInts);
		
		List<String> myInts2 = Arrays.asList("Andre","Bia", "Priscila");
		printList(myInts2);
	}
	// tipo curringa "?"
	private static void printList(List<?> myInts) {
		for (Object obj : myInts) {
			System.out.println(obj);
		}
	}
}
