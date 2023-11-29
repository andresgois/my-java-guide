package br.com.andresgois;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.andresgois.model.Product;
import br.com.andresgois.service.CalculationService;
import br.com.andresgois.service.PrintService;
import br.com.andresgois.service.PrintServiceString;

public class Program {
    
    public static void main(String[] args) {  
        // Aula 01
        //printService();
        //printServiceString();
    	printServiceGeneric();
        // Aula 02
        //calculateService();
    }
    
    public static void printService() {
        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();
        
        System.out.print("How many values? ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);
        
        sc.close();
    }
    
    public static void printServiceString() {
        Scanner sc = new Scanner(System.in);
        PrintServiceString<String> ps = new PrintServiceString<>();
        
        System.out.print("How many values? ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
        	String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        String x = ps.first();
        System.out.println("First: " + x);
        
        sc.close();
    }

    public static void printServiceGeneric() {
        Scanner sc = new Scanner(System.in);
        PrintServiceString<Integer> ps = new PrintServiceString<>();
        
        System.out.print("How many values? ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
        	Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);
        
        sc.close();
    }
    /*
    public static void calculateService() {
        List<Integer> list = new ArrayList<>();
        String path = "D:\\temp\\num.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line = br.readLine();
            while(line != null) {
                list.add(Integer.parseInt(line));
                line = br.readLine();
            }
            
            Integer x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);
        } catch( IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    */
    
    public static void calculateService() {
        Locale.setDefault(Locale.US);
        String path = "D:\\temp\\products.txt";
        List<Product> pro = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line = br.readLine();
            while(line != null) {
                String[] p = line.split(",");
                pro.add(new Product(p[0], Double.valueOf(p[1])));
                line = br.readLine();
            }
            
            Product x = CalculationService.max(pro);
            System.out.println("Max: ");
            System.out.println(x);
        } catch( IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
