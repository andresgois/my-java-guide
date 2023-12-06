package br.comandresgois.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.comandresgois.comparator.entities.Product;
import br.comandresgois.predicate.util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("HeadSet", 80.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Conector RJ", 10.00));

		//list.removeIf(x -> x.getPrice() > 100);
		list.removeIf(new ProductPredicate());
		
		// referencia para método
		list.removeIf(Product::staticProductPredicate);
		
		// outro exemplo
		Predicate<Product> pred = p->p.getPrice() > 10;
		list.removeIf(pred);

		list.forEach(System.out::println);
	}
	
	
}
