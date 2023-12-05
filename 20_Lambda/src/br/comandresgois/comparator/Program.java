package br.comandresgois.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import br.comandresgois.comparator.entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Radio", 50.00));
		
		// Exemplo 1
		list.sort(new MyComparator());
		
		System.out.println("--------------------------");
		// Exemplo 2
		Comparator<Product> comp = new Comparator<Product>() {
			
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		list.sort(comp);
		
		System.out.println("--------------------------");
		// Exemplo 3 Lambda
		Comparator<Product> comp2 =  (p1, p2) -> {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		list.sort(comp2);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
