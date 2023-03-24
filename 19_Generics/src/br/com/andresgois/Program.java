package br.com.andresgois;

import java.util.Scanner;

import br.com.andresgois.service.PrintService;

public class Program {
    
    public static void main(String[] args) {
        // Aula01
        printService();
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
    
}
