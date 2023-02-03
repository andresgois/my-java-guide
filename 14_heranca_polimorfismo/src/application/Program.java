package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import application.exemplo1.Account;
import application.exemplo1.BusinessAccount;
import application.exemplo1.SavingsAccount;
import application.exercicioEmployee.Employee;
import application.exercicioEmployee.OutsourceEmployee;

public class Program {
    
    public static void main(String[] args) {
        // #### Exemplo 1 ####
        /**
         * Classe Account é a *GENERALIZAÇÃO* Classe BusinessAccount é a
         * *ESPECIALIZAÇÃO* BusinessAccount herda todos os atributos,
         * propriedades e método que account tem.
         */
        
        //exemplo01();
        
        exercicio01();
        
    }
    
    public static void exemplo01() {
        Account acc = new Account(1001, "Alex Green", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria brown", 0.0,
                500.0);
        
        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Tania muller", 0.0, 2000.0);
        Account acc3 = new SavingsAccount(1004, "Laila avilar", 0.0, 0.05);
        System.out.println(acc1.getBalance());
        
        // DOWNCASTING - Converte objeto da super classe para o da subclasse
        BusinessAccount acc4 = (BusinessAccount) acc2;
        // Operação não permitida, vai acusar em tempo de execução
        // BusinessAccount acc5 = (BusinessAccount)acc3; // ClassCastException
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(500.0);
            System.out.println("Loan!");
        }
        
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
        
        Account c1 = new Account(11, "Paulo'", 1000.0);
        c1.withdraw(200.0);
        
        Account c2 = new SavingsAccount(12, "Luan", 1000.0, 0.01);
        c2.withdraw(200.0);
        
        Account c3 = new BusinessAccount(12, "Luan", 1000.0, 500.0);
        c3.withdraw(200.0);
        
        System.out.println(c1.getBalance());
        System.out.println(c2.getBalance());
        System.out.println(c3.getBalance());
        
    }

    public static void exercicio01(){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Enter the number of employees: ");
        Integer n = Integer.valueOf(sc.nextLine());
        
        List<Employee> emp = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d data:  \n",(i+1));
            System.out.print("Outsource (y/n): ");
            char valor = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hour = Integer.valueOf(sc.nextLine());
            System.out.print("Value per hour: ");
            Double valuePerHour = Double.valueOf(sc.nextLine());
            
            if(valor == 'y' ) {
                System.out.print("Additional charge: ");
                Double additional = Double.valueOf(sc.nextLine());
                emp.add( new OutsourceEmployee(name, hour, valuePerHour, additional));
            } else {
                emp.add( new Employee(name, hour, valuePerHour));
            }
        }
        
        System.out.println();
        
        System.out.println("PAYMENTE");
        System.out.println(emp);
        
        sc.close();
    }
}
