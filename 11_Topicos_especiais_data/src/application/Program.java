package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {
    
    public static void main(String[] args) {
        /*System.out.println("(agora) ➞ Data-hora");
        instanciandoDataDoAgora();
        
        System.out.println("Texto ISO 8601 ➞ Data-hora");
        textoIso8601();
        
        System.out.println("Texto formato customizado ➞ Data-hora");
        textoFormatoCustomizado();
        
        System.out.println("Data e hora para texto");
        dataHoraParaTexto(); 
        
        System.out.println("Converter Data e Hora Local Para Global");
        converterDataHoraLocalParaGlobal();
        
        System.out.println("Obter Dados De Uma Data Hora Local");
        obterDadosDeUmaDataHoraLocal();
        
        System.out.println("Calculo com data e hora");
        calculoDataHora();
        
        System.out.println("Duração entre datas");
        DuracaoEntreDatas();*/
        
        System.out.println("Trabalhando com datas java 7 - Date");
        trabalhandoComDatasJava7();
        System.out.println("Manipulando um Date com Calendar - Java 7");
        //manipulandoDateComCalendarJava7();
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
    
    public static void  dataHoraParaTexto() {
        LocalDate d01 = LocalDate.parse("2022-07-20");                 
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");          
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
        
        // formatos
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // defini o fuso horário que vai usar, pega o fuso d PC do usuário: ZoneId.systemDefault()
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
        
        System.out.println("LocalDate - Formato ISO-8601: "+d01);                       // Saída: 2022-07-20
        
        System.out.println("LocalDate - Com format: "+d01.format(fmt1));                // Saída: 20/07/2022
        
        System.out.println("LocalDate - Com format invertido: "+fmt1.format(d01));      // Saída: 20/07/2022
        
        System.out.println("LocalDateTime - Com format: "+d02.format(fmt1));            // Saída: 20/07/2022
        
        System.out.println("LocalDateTime - Com format: "+d02.format(fmt2));            // Saída: 20/07/2022 01:30
        
        System.out.println("Instant - : "+d03);                                         // Saída: 2022-07-20T01:30:26Z
        
        System.out.println("TimeZone - : "+fmt3.format(d03));                           // Saída: 19/07/2022 22:30
        // Todo *instant* deve ter especificado o fuso
        
        System.out.println("LocalDateTime - ISO_DATE_TIME: "+d02.format(fmt4));         // Saída: 2022-07-20T01:30:26
        
        System.out.println("TimeZone - ISO_INSTANT: "+fmt5.format(d03));                // Saída: 2022-07-20T01:30:26Z
    }
    
    public static void  converterDataHoraLocalParaGlobal() {
       // sempre colocar o timezone
       // ZoneId.getAvailableZoneIds(); -> retorna coleção com os nomes dos fuso horários customizados
        LocalDate d01 = LocalDate.parse("2022-07-20");                 
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");          
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
        
        //LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r2 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());    
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
        
        //System.out.println("r1: "+r1);                            // Saída: 
        System.out.println("r2: "+r2);                              // Saída: 2022-07-19T22:30:26
        System.out.println("r3: "+r3);                              // Saída: 2022-07-20T02:30:26
    }
    
    public static void  obterDadosDeUmaDataHoraLocal() {
         LocalDate d01 = LocalDate.parse("2022-07-20");                 
         LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");          
         Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
         
         System.out.println("Dia: "+d01.getDayOfMonth());       //Saída: 20
         System.out.println("Mês: "+d01.getMonth());            //Saída: JULY
         System.out.println("Hora: "+d02.getHour());            //Saída: 1
         System.out.println("Hora: "+d02.getMinute());          //Saída: 30
     }
    
    public static void  calculoDataHora() {
        // Data e hora são objetos imutaveis
        LocalDate d01 = LocalDate.parse("2022-07-20");                 
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");          
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
        
        LocalDate pastWeekLocalDate = d01.minusDays(7);
        System.out.println("pastWeekLocalDate: "+pastWeekLocalDate);                //Saída: 2022-07-13
        
        LocalDate nextWeekLocalDate = d01.plusDays(7);
        System.out.println("nextWeekLocalDate: "+nextWeekLocalDate);                //Saída: 2022-07-27
        
        LocalDateTime pastWeekLocalDateTime = d02.minusHours(3);
        System.out.println("pastWeekLocalDateTime: "+pastWeekLocalDateTime);       //Saída: 2022-07-19T22:30:26
        
        LocalDateTime nextWeekLocalDateTime = d02.plusMinutes(20);
        System.out.println("nextWeekLocalDateTime: "+nextWeekLocalDateTime);       //Saída: 2022-07-20T01:50:26
        
        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant: "+pastWeekInstant);                    //Saída: 2022-07-13T01:30:26Z
        
        Instant nextWeekInstant = d03.plus(10, ChronoUnit.DAYS);
        System.out.println("nextWeekInstant: "+nextWeekInstant);                    //Saída: 2022-07-30T01:30:26Z
    }
    
    public static void  DuracaoEntreDatas() {
        // Data e hora são objetos imutaveis
        LocalDate d01 = LocalDate.parse("2022-07-20");                 
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");          
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
        
        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDateTime pastWeekLocalDateTime = d02.minusDays(3);
        
        Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
        System.out.println("Duration: "+t1.toDays());                                //Saída: 3
        
        Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atTime(0,0));
        System.out.println("Duration: "+t2.toDays());                                //Saída: 7
        
        // converte para localDateTime a meia noite
        Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        System.out.println("Duration: "+t3.toDays());                                //Saída: 7
        
        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Duration t4 = Duration.between(pastWeekInstant, d03);
        System.out.println("Duration: "+t4.toDays());                                //Saída: 7

        // datas invertidas
        Duration t5 = Duration.between(d03, pastWeekInstant);
        System.out.println("Duration: "+t5.toDays());                                //Saída: -7
    }
    
    // Java 7
    public static void trabalhandoComDatasJava7() {
        
    }
   
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
