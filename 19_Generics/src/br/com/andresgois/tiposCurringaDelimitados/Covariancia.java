package br.com.andresgois.tiposCurringaDelimitados;

import java.util.ArrayList;
import java.util.List;

public class Covariancia {

	public static void main(String[] args) {
		// Princípio get/put - covariância
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		List<? extends Number> list = intList;
		Number x = list.get(0);
		//list.add(20); // erro de compilacao
		//get - OK
		//put - ERROR

	}

}
