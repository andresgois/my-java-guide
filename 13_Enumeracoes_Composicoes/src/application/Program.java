package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import application.exercicio.enums.WorkerLevel;
import application.exercicio.model.Department;
import application.exercicio.model.HourContract;
import application.exercicio.model.Worker;
import application.exercicio2.model.Comment;
import application.exercicio2.model.Post;

public class Program {
    
    public static void main(String[] args) throws ParseException {
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
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Enter department's name: ");
        String department = sc.next();
        
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Level: ");
        String level = sc.next();
        System.out.print("Base Salary: ");
        Double baseSalary = sc.nextDouble();
        
        Worker w = new Worker(name, baseSalary, WorkerLevel.valueOf(level), new Department(department));
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
            
            Date datac = sdf1.parse(data);
            
            HourContract contract = new HourContract(datac, valuePerHour, hours);
            
            w.addContract(contract);
        }
        
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String mesAno = sc.next();
        Double v = w.income(mesAno);
        System.out.println(w);
        System.out.println("Income for "+mesAno+": "+v);*/
        
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        System.out.print("Digite o titulo: ");
        String title = sc.nextLine();
        System.out.print("Quantidade de likes: ");
        int likes = Integer.valueOf(sc.nextLine());
        System.out.print("Digite a Data: ");
        String d = sc.nextLine();
        System.out.print("Digite o conteúdo: ");
        String content = sc.nextLine();
        Date data = sdf2.parse(d);
        
        Post p = new Post(data, title, content, likes);
        
        // Comentários
        System.out.println("Digite quantos comentários deseja fazer");
        int comments = Integer.valueOf(sc.nextLine());
        
        for (int i = 0; i < comments; i++) {
            System.out.println("Comentário: ");
            String comment = sc.nextLine();
            
            Comment c = new Comment(comment);
            p.addComment(c);
        }
        
        System.out.println("");
        System.out.println(p);
        
    }
    
}
