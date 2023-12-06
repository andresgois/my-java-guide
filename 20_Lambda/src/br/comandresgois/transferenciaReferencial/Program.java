package br.comandresgois.transferenciaReferencial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.comandresgois.comparator.entities.Product;

public class Program {

	public static int globalValue = 3;

	public static void main(String[] args) {
		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
		// Exemplo de função que não é referencialmente transparente
		PrimeiraClasse();
		
		exLambda();
	}

	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void PrimeiraClasse() {
		// Utilizamos aqui"method references"
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		// Na programação pode passar uma função como argumento de outra função e pode ser retornando 
		// Isso significa que é um objeto de primeira classe ou primeira ordem
		// 
		list.sort(Program::compareProducts);

		list.forEach(System.out::println);
		// Operador :: Sintaxe: Classe::método
	}

	// Em programação funcional, expressão lambda corresponde a uma
	// função anônima de primeira classe.
	public static void exLambda() {
		Integer sum = 0;
		List<Integer> list = Arrays.asList(9,5,1,2);
		
		for (Integer x : list ) {
			sum += x;
		}
		System.out.println(sum);
		
		Integer sum1 = 0;
		sum1 = list.stream().reduce(0, Integer::sum);
		System.out.println(sum1);
	}
}
