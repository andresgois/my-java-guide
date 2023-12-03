package br.com.andresgois.equalsHashCode;

import br.com.andresgois.equalsHashCode.entities.Client;

public class Program {

	public static void main(String[] args) {
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.equals(b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		Client c1 = new Client("Maria", "maria@email.com");
		Client c2 = new Client("Maria", "maria@email.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		// compara posições de memória, com exceção de tipos
		System.out.println(c1 == c2);
		
		String s1 = "Teste";
		String s2 = "Teste";
		
		// tratamento especial para literais
		System.out.println(s1 == s2); //true
		System.out.println("Teste" == "Teste"); //true
		System.out.println("Teste" == new String("Teste")); //false - sem tratamento espcial
		 
		
		
	}
}
