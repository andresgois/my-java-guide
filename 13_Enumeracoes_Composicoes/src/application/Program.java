package application;

import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import application.exercicio.enums.WorkerLevel;
import application.exercicio.model.Department;
import application.exercicio.model.HourContract;
import application.exercicio.model.Worker;

public class Program {
    
    public static void main(String[] args) {
       /* Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);
        // CONVERTER STRING PARA ENUM
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        
        System.out.println(os1);
        System.out.println(os2);*/
        
        /**
         * Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar 
         * do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo 
         * (próxima página).
         */
        Scanner sc = new Scanner(System.in);
        
        Worker w = null;
        
        System.out.print("Enter department's name: ");
        String department = sc.next();
        
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Level: ");
        String level = sc.next();
        System.out.print("Base Salary: ");
        Double baseSalary = sc.nextDouble();
        
        System.out.print("How contracts to this worker? ");
        int contracts = sc.nextInt();
        
        for (int i = 0; i < contracts; i++) {
            
            System.out.printf("Enter contract #%d data: \n",i+1);
            System.out.print("Date (DD/MM/YYYY): ");
            String data = sc.next();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            Integer hours = sc.nextInt();
            
            HourContract contract = new HourContract(new Date(data), valuePerHour, hours);
            WorkerLevel wl = WorkerLevel.valueOf(level);
            w = new Worker(name, baseSalary, wl, new Department(department));
            w.addContract(contract);
        }
        
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String mesAno = sc.next();
        w.income(mesAno);
        System.out.println(w);
    }
    
}
