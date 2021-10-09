package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
		/*
		try (BufferedReader bf = new BufferedReader(new FileReader(file))) {

			String line = bf.readLine();
			while(line != null) {
				System.out.println(line);
				line = bf.readLine();
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error: "+e.getMessage());
		}*/
		
		// FileWriter e BufferedWriter
		/*
		String[] lines = new String[] {"Good morning","Good afternoon","Good night"};
		
		String path = "C:\\Temp\\out.txt";
		
		// Passando o true ele não cria um novo arquivo, mas sim adiciona ao final da linha os novos dados
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			
			for(String line: lines) {
				bw.write(line);;
				bw.newLine();
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		*/
		
		// Manipulando pastas com File
		/*Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc2.next();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders");
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for(File file2: files) {
			System.out.println(file2);
		}
		
		System.out.println();
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: "+success);
		
		sc2.close();*/
		
		
		//Informações do caminho do arquivo
		Scanner sc3 = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath2 = sc3.nextLine();

		File path2 = new File(strPath2);
		System.out.println("getPath: " 
		+ path2.getPath());
		System.out.println("getParent: " + path2.getParent());
		System.out.println("getName: " + path2.getName());

		sc3.close();
		
		
	}

}
