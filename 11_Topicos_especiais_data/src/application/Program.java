package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {
    
    public static void main(String[] args) {
        // Instanciação
        // Intsaciacao()
        // ConvertendoDataHoraGlobalParaLocal();
        // calculoComData();
        
        String data = "202010"+"01";
        //DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate d08 = LocalDate.parse(data, DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println("Ano: "+d08.getYear()+" Mês: "+d08.getMonthValue());
    }
    
    public static void Intsaciacao() {
        // (agora) ➞ Data//hora
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);
        
        // Texto ISO 8601 ➞ Data//hora
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);
        
        // Texto formato customizado ➞ Data-hora
        // Data Hora GMT - Global - Horário de Londres
        Instant d03 = Instant.now();
        System.out.println(d03);
        
        // dia, mês, ano, [horário] ➞ Data-hora local
        // Formatação
        // Data//hora ➞ Texto ISO 8601 ano-mes-dia
        LocalDate d04 = LocalDate.parse("2022-11-12");
        System.out.println(d04);
        
        LocalDateTime d05 = LocalDateTime.parse("2022-11-22T01:30:26");
        System.out.println(d05);
        
        Instant d06 = Instant.parse("2022-11-22T01:30:26Z");
        System.out.println(d06);
        
        // GMT - salvando com hora local
        Instant d07 = Instant.parse("2022-11-22T01:30:26-03:00");
        System.out.println(d07);
        
        // Formatação
        // Data//hora ➞ Texto ISO 8601 ano-mes-dia
        // Data//hora ➞ Texto formato customizado
        System.out.println("\nData-hora ➞ Texto formato customizado");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("12/11/2022", dtf1);
        
        System.out.println("d08: " + d08);
        
        DateTimeFormatter dtf2 = DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("12/11/2022 01:30", dtf2);
        
        System.out.println("d09: " + d09);
        // dia, mês, ano, [horário] ➞ Data-hora local
        System.out.println("\ndia, mês, ano, [horário] ➞ Data-hora local");
        LocalDate d10 = LocalDate.of(2022, 10, 22);
        System.out.println("d10: " + d10);
        
        LocalDateTime d11 = LocalDateTime.of(2022, 10, 22, 1, 30);
        System.out.println("d10: " + d11);
        
        // Formatação
        System.out.println("\nFormatação");
        LocalDate d12 = LocalDate.parse("2022-07-20");
        LocalDateTime d13 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d14 = Instant.parse("2022-11-12T14:56:26Z");
        
        // Data//hora ➞ Texto ISO 8601 ano-mes-dia
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm");
        // pega timezone do usuário
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM")
                .withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        // para data instant
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
        
        System.out.println("Sem formatação - d12: " + d12);
        System.out.println("Com formatação fmt1 - d12: " + d12.format(fmt1));
        System.out.println("Outra forma - d12: " + fmt1.format(d12));
        System.out.println("-------------------------------------");
        System.out.println("fmt1 - d13: " + d13.format(fmt1));
        System.out.println("fmt2 - d13: " + d13.format(fmt2));
        System.out.println("Pegou uma Hora GMT e tranformou para a hora local");
        System.out.println("fmt3 - d14: " + fmt3.format(d14));
        System.out.println("fmt4 - d13: " + d13.format(fmt4));
        
        System.out.println("fmt5 - d14: " + fmt5.format(d14));
        
        // Convertendo data-hora global para local
    }
    
    public static void ConvertendoDataHoraGlobalParaLocal() {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        
        // ZoneId.getAvailableZoneIds();
        // converter timezone global em local
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        
        // Obter dados de uma data-hora-local
        System.out.println("d04 Dia = " + d04.getDayOfMonth());
        System.out.println("d04 Mês = " + d04.getMonth());
        System.out.println("d04 Mês = " + d04.getMonthValue());
        
        System.out.println("d05 Hora = " + d05.getHour());
        System.out.println("d05 Minuto = " + d05.getMinute());
    }
    
    public static void calculoComData() {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        
        LocalDate semanaAnterior = d04.minusDays(7);
        LocalDate proximaSemana = d04.plusDays(7);
        
        System.out.println("-7 dias = " + semanaAnterior);
        System.out.println("+7 dias = " + proximaSemana);
        
        LocalDateTime semanaAnteriorTime = d05.minusDays(7);
        LocalDateTime proximaSemanaTime = d05.plusDays(7);
        LocalDateTime proximaHoraTime = d05.plusHours(5);
        
        System.out.println("-7 dias = " + semanaAnteriorTime);
        System.out.println("+7 dias = " + proximaSemanaTime);
        System.out.println("+5 horas = " + proximaHoraTime);
        
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        
        System.out.println("-7 dias Instant: " + pastWeekInstant);
        
        // Duração entre duas datas
        Duration t1 = Duration.between(semanaAnterior, d04);
        System.out.println("T1 dias: " + t1.toDays());
    }
}
