package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		List<Products> product = new ArrayList<>();
		product.add(new Products("TV", 1290.99, 1));
		product.add(new Products("Vídeo Game Chair", 900.00, 3));
		product.add(new Products("Iphone X", 900.00, 2));
		product.add(new Products("Samsung Galaxy 9", 850.00, 2));		

		//String path = "C:\\Temp\\products.csv";		
		File path2 = new File(strPath);
		boolean success = new File(path2.getParent() + "\\out").mkdir();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2.getParent()+"\\out\\sumary.csv"))){			
			for(Products p: product) {
				bw.write(p.toString());;
				bw.newLine();
			}
		   System.out.println("file created successfully");
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}*/
		
		List<Products> list = new ArrayList<>();

		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out2").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out2\\summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String itemCsv = br.readLine();
			while (itemCsv != null) {

				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				list.add(new Products(name, price, quantity));

				itemCsv = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Products item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");
				
			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();
	}

}
