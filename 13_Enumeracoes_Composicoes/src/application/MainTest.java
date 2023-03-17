package application;

import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoUnit;

import application.enums.MotivoSustacaoEnum;
import application.enums.SituacaoChequeEnum;

public class MainTest {
    
    public static void main(String[] args) {
        //SuperString();
        /*String s = "05/11/2020 21:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
          LocalDateTime dateTime = LocalDateTime.parse(s, formatter);
          System.out.println(dateTime.format(formatter));
          
          ZoneId zoneId = ZoneId.of("America/Sao_Paulo"); //ZoneId.systemDefault(); // or: ZoneId.of("Europe/Oslo");
          long epoch = dateTime.atZone(zoneId).toEpochSecond();
          System.out.println(epoch);
          
          String data2 = "20170627";
          String p = formatDataPadrao( data2);
          System.out.println(p);*/
          //dataAtualizacaoRegistro
          // 2023-02-14T11:19:48.084Z"
          // 2023-02-14T14:19:48.329Z
          Integer dataAtualizacaoRegistro=20230214; 
          Integer horaAtualizacaoRegistro=111948;
          
          String teste = concatDataHora(dataAtualizacaoRegistro.toString(), horaAtualizacaoRegistro.toString());
          System.out.println(teste);
          // dataAtualizacaoRegistro
          // dataSolicitacaoTalao
          /*System.out.println("29/02/2016 eh uma data valida? " + isDateValid("29/02/2016"));
          System.out.println("29/02/2017 eh uma data valida? " + isDateValid("29/02/2017"));
          System.out.println("31/06/2017 eh uma data valida? " + isDateValid("30/01/2017"));
          System.out.println("31/04/2017 eh uma data valida? " + isDateValid("31/04/2017"));*/
          System.out.println("29/02/2017 eh uma data valida? " + isDateValid("20170229"));
          System.out.println("31/06/2017 eh uma data valida? " + isDateValid("20170130"));
          System.out.println("31/06/2017 eh uma data valida? " + isDateValid("20230230"));
          String p = isDateValid("00000000") ? "data": " - ";
          System.out.println("31/06/2017 eh uma data valida? " + p);
          System.out.println("31/06/2017 eh uma data valida? " + isDateValid("20170627"));
    }
    
    public static boolean isDateValid(String strDate) {
        //String dateFormat = "dd/MM/uuuu";
        String dateFormat = "uuuuMMdd";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
        .ofPattern(dateFormat)
        .withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate date = LocalDate.parse(strDate, dateTimeFormatter);
            return true;
        } catch (DateTimeParseException e) {
           return false;
        } 
    }

    private static String concatDataHora(String data, String hora) {
        LocalDate d1 = LocalDate.parse(data, DateTimeFormatter.ofPattern("yyyyMMdd"));
        LocalTime h1 = LocalTime.parse(hora, DateTimeFormatter.ofPattern("HHmmss"));
        
        LocalTime localTime = LocalTime.parse(h1.toString()).plus(100, ChronoUnit.MILLIS);
        String dataHora = d1+" "+localTime;
        LocalDateTime localDateTime = LocalDateTime.parse(dataHora, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        return localDateTime.atZone(ZoneOffset.UTC).toInstant().toString(); //ZoneId.of("America/Sao_Paulo"
        //return instant.toString();
     }

    private static String concatDataHora2(Integer d, Integer h) {
       String data = d.toString();
       String hora = h.toString();
       LocalDate d1 = LocalDate.parse(data, DateTimeFormatter.ofPattern("yyyyMMdd"));
       LocalTime h1 = LocalTime.parse(hora, DateTimeFormatter.ofPattern("HHmmss"));
       String dataHora = d1+" "+h1;
       
       LocalDateTime n = LocalDateTime.parse(dataHora, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
       System.out.println(n);
       
       Instant instant = n.atZone(ZoneId.of("America/Sao_Paulo")).toInstant();
       System.out.println(instant); // 2017-06-15T11:39:00Z
       
       DateTimeFormatter timeColonFormatter = DateTimeFormatter.ofPattern("HH:mm:ss SSS");
       LocalTime colonTime = LocalTime.parse(h1.toString()).plus(329, ChronoUnit.MILLIS);
       System.out.println(colonTime);
       dataHora = d1+" "+colonTime;
       n = LocalDateTime.parse(dataHora, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
       System.out.println(n);
       instant = n.atZone(ZoneId.of("America/Sao_Paulo")).toInstant();
       System.out.println(instant);
        return null;
        
        //ld.format(DateTimeFormatter.ISO_INSTANT);
    }

    private static String formatDataPadrao(String data) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
          LocalDate ld = LocalDate.parse(data, dtf);
          return ld.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    
    public static void SuperString() {
        String response = "BMFB2017062700000000000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        int tamanhoResponse = response.length(); //1261
        int tamanhoEventos = response.substring(541,tamanhoResponse).length();
        
        
    }
    
    public static void enums() {
        System.out.println(MotivoSustacaoEnum.valueOf("RN").getDescricao());
        
        System.out.println(MotivoSustacaoEnum.getByCodigo("CE"));
        System.out.println(MotivoSustacaoEnum.getByCodigo("CO"));
        
        System.out.println(SituacaoChequeEnum.getByCodigo(0));
        System.out.println(SituacaoChequeEnum.getByCodigo(10));  
    }
}
