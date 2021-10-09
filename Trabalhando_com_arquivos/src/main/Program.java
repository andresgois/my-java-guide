package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Temp\\in.txt");
		
		// Scanner - Leitor de texto
		/*
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
		}*/
		
		// FileReader e BufferReader
		/*
		BufferedReader bf = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			bf = new BufferedReader(fr);
			
			String line = bf.readLine();
			while(line != null) {
				System.out.println(line);
				line = bf.readLine();
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error: "+e.getMessage());
		} finally {
			try {
				if(bf != null) {
					bf.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}*/
		
		
		// Bloco try-with-resources
		
	}

}
