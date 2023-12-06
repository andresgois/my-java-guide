package br.comandresgois.predicate.util;

import java.util.function.Predicate;

import br.comandresgois.comparator.entities.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product t) {
		return t.getPrice() > 100;
	}

}
