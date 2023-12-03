package br.com.andresgois.delimitadores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.andresgois.delimitadores.CalculationService;
import br.com.andresgois.delimitadores.Product;

public class Program {
    
    public static void main(String[] args) {  
        // Aula 02
        //calculateService1();
    	
    	calculateService2();
    }
 
    public static void calculateService1() {
        List<Integer> list = new ArrayList<>();
        String path = "/home/andre/num.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line = br.readLine();
            while(line != null) {
                list.add(Integer.parseInt(line));
                line = br.readLine();
            }
            
            Integer x = CalculationService.maxVersao1(list);
            System.out.println("Max: ");
            System.out.println(x);
        } catch( IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
   
    
    public static void calculateService2() {
        Locale.setDefault(Locale.US);
        String path = "/home/andre/products.txt";
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
