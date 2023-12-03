package br.com.andresgois.tiposCurringaDelimitados;

import java.util.ArrayList;
import java.util.List;

public class Contravariancia {
	public static void main(String[] args) {
		//Princípio get/put - contravariância
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		//Number x = myNums.get(0); // erro de compilacao
		//get - ERROR
		//put - OK
	}
}
