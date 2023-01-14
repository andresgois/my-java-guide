package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    
    public static void main(String[] args) {
        System.out.println("(agora) ➞ Data-hora");
        instanciandoDataDoAgora();
        System.out.println("Texto ISO 8601 ➞ Data-hora");
        textoIso8601();
        System.out.println("Texto formato customizado ➞ Data-hora");
        textoFormatoCustomizado();
    }
    // Java 8+
    public static void instanciandoDataDoAgora() {
        //- (agora) ➞ Data-hora
        System.out.println("========== LocalDate");
        LocalDate d01 = LocalDate.now();                    // Saída: 2023-01-13
        System.out.println(d01);
        
        System.out.println("========== LocalDateTime");
        LocalDateTime d02 = LocalDateTime.now();            // Saída: 2023-01-13T21:56:18.270
        System.out.println(d02);
        
        System.out.println("========== Instant");
        Instant d03 = Instant.now();                        // Saída: 2023-01-14T00:56:18.270Z
        System.out.println(d03);
    }
    
    public static void textoIso8601() {
        //- (agora) ➞ Data-hora
        System.out.println("========== ISO 8601");
        LocalDate d01 = LocalDate.parse("2023-01-13");                  // Saída: 2023-01-13
        System.out.println(d01);
        
        System.out.println("========== LocalDateTime ISO 8601");
        LocalDateTime d02 = LocalDateTime.parse("2023-01-10T01:30:26");  // Saída: 2023-01-10T01:30:26
        System.out.println(d02);
        
        System.out.println("========== Instant ISO 8601");
        Instant d03 = Instant.parse("2023-01-20T21:13:10Z");             // Saída: 2023-01-20T21:13:10Z
        System.out.println(d03);
        
        System.out.println("========== Instant TimeZone diferente do GMT");
        // só funciona do java 11 acima = Instant d04 = Instant.parse("2023-01-20T21:13:10-03:00");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Instant d04 = null;
        try {
            d04 = sdf.parse("2022-07-20T01:30:26-03:00").toInstant();     // Saída: 2022-07-20T04:30:26Z
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d04);
    }
    
    public static void textoFormatoCustomizado() {
        System.out.println("========== LocalDate");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d01 = LocalDate.parse("13/01/2023", dtf1);                //Saída: 2023-01-13
        System.out.println(d01);
        
        System.out.println("========== LocalDateTime");         
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d02 = LocalDateTime.parse("20/07/2023 01:30", dtf2);  //Saída: 2023-07-20T01:30
        System.out.println(d02);
        
        System.out.println("========== Data separada");                           
        LocalDate d03 = LocalDate.of(2022, 7, 20);
        System.out.println(d03);                                            //Saída: 2022-07-20
        
        System.out.println("========== Data separada DateTime");                           
        LocalDateTime d04 = LocalDateTime.of(2022, 7, 20, 1, 30);           //Saída: 2022-07-20T01:30
        System.out.println(d04); 
    }
    // Java 7
    
   
    /*
    public static void teste() {
        Instant d06 = Instant.parse("2022-12-15T16:13:42.060Z");
        System.out.println(d06.getClass());
        System.out.println(d06);
        LocalDateTime r1 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        System.out.println(r1);
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm");
        String agoraFormatado = r1.format(formatter);
        System.out
                .println("LocalDateTime depois de formatar: " + agoraFormatado);
    }
    */
}
