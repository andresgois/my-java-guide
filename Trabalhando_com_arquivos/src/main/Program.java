package main;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Temp\\in.txt");
		
		// Scanner - Leitor de texto
		
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			// Verifica se ainda existe uma próxima linha
			while( sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
