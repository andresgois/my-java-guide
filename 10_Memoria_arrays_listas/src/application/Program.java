package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import application.model.Employee;
import application.model.Product;
import application.model.Student;

public class Program {
    
    public static void main(String[] args) {
        // programaVetor();
        // exercicioProdutos();
        // exercicioPensionato();
        // lista01();
        //exercicioLista();
        //testStream();
        //matriz();
        matrizExercicio();
    }
    
    public static void programaVetor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade: ");
        int n = sc.nextInt();
        double media = 0.0, altura[] = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite altura #%d = ", i + 1);
            altura[i] = sc.nextDouble();
            media += altura[i];
        }
        
        System.out.print("As altura digitadas foram: [ ");
        int y = 0;
        while (y < n) {
            System.out.print(altura[y]);
            y++;
            if (y != n)
                System.out.print(", ");
        }
        System.out.printf(" ]; com média = %.2f ", (media / n));
        
        sc.close();
    }
    
    public static void exercicioProdutos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade: ");
        int n = sc.nextInt();
        Product[] p = new Product[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do produto");
            String name = sc.next();
            System.out.println("Digite o preço do produto");
            double price = sc.nextDouble();
            p[i] = new Product(name, price);
        }
        
        int y = 0;
        while (y < p.length) {
            System.out.println(p[y]);
            y++;
        }
    }
    
    public static void exercicioPensionato() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de estudantes: ");
        int n = sc.nextInt();
        Student[] quartos = new Student[10];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome, email e quarto do estudante: ");
            String name = sc.next();
            String email = sc.next();
            int q = sc.nextInt();
            quartos[q] = new Student(name, email);
        }
        
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null)
                System.out.println("Quarto [" + i + "]" + quartos[i]);
        }
        
        System.out.println("\n\n");
        
        for (Student s : quartos) {
            if (s != null)
                System.out.println(s);
        }
        sc.close();
    }
    
    public static void lista01() {
        List<String> list = new ArrayList<>();
        
        list.add("Andre");
        list.add("Beatriz");
        list.add("Andreia");
        list.add(1, "Priscila");
        
        List<String> newList = list.stream().filter(x -> x.charAt(0) == 'A')
                .collect(Collectors.toList());
        List<String> newList2 = list.stream().filter(x -> x.charAt(0) == 'A')
                .toList();
        
        for (String i : list) {
            System.out.println(i);
        }
        System.out.println("Tamanho da lista: " + list.size());
        
        // list.remove(0);
        list.removeIf(x -> x.charAt(0) == 'A');
        for (String i : list) {
            System.out.println(i);
        }
        // procura pelo indice
        System.out.println(list.indexOf("Andre"));
        System.out.println("-----------newList2");
        for (String i : newList2) {
            System.out.println(i);
        }
        System.out.println("-----------Filtra nome com a letra P");
        String nomeComA = list.stream().filter(x -> x.charAt(0) == 'P')
                .findFirst().orElse(null);
        System.out.println(nomeComA);
    }
    
    public static void exercicioLista() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("en", "US"));
        
        System.out.print("how many employees wil be registed? ");
        int n = sc.nextInt();
        
        // Employee[] emp = new Employee[n];
        List<Employee> emp = new ArrayList<Employee>();
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d\n", (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            
            emp.add(new Employee(id, name, salary));
        }
        
        System.out.println("Enter the employee id that will have salary increment: ");
        int id = sc.nextInt();
        
        
        Employee e = emp.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
        if(e == null) {
            System.out.println("\n======== Id not found ========\n");
        }else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            e.incrementSalary(percent);
        }
        
        System.out.println("List of Employee: ");
        for (Employee employee : emp) {
            System.out.println(employee);
        }
        
        sc.close();
    }
    
    public static void testStream() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        
        myList.stream().filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        
        for (String s : myList) {
            System.out.println(s);
        }
    }
    
    public static void matriz() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho da matriz: ");
        String md = "";
        int negatives = 0;
        int n = sc.nextInt();
        
        int[][] mat = new int[n][n];
        
        System.out.println("=== Matriz ===");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n=======================\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]+" ");
                if(i == j) {
                    md = md+" "+mat[i][j];
                }
                if(mat[i][j] < 0) {
                    negatives++;
                }
            }
            System.out.println();
        }
        System.out.println("Diagonal principal: "+ md);
        System.out.println("Números negativos: "+ negatives);        
        
        sc.close();
    }

    public static void matrizExercicio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho da matriz: ");
        int l = sc.nextInt();
        int c = sc.nextInt();
        
        int mat[][] = new int[l][c];
        
        System.out.println("=== Matriz ===");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("#[%d][%d]: ",i,j);
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Digite um numero para buscar os vizinhos na matriz: ");
        int n = sc.nextInt();
        
        System.out.println();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if(mat[i][j] == n) {
                    System.out.printf("Posição: %d, %d\n",i,j);
                    if(j-1 >= 0) System.out.println("Left: "+mat[i][j-1]);
                    if(j+1 < c) System.out.println("Right: "+mat[i][j+1]); 
                    if(i-1 >= 0) System.out.println("Down: "+mat[i-1][j]); 
                    if(i+1 <= l) System.out.println("Up: "+mat[i+1][j]); 
                }
            }
        }
    }
}
