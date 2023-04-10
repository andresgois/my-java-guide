package application;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainBase64 {
    
    public static void main(String[] args) {
        String data = "20170930"; // 02/03/2020 00:00:00
        /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate ld = LocalDate.parse(data, formatter);
        
        System.out.println(ld);
        LocalDate localDate = LocalDate.parse("2019-01-04");
        
        DateTimeFormatter formatter2 = DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm:ss");
        // Beginning of the day
        LocalDateTime localDateTime1 = localDate.atStartOfDay();
        System.out.println(localDateTime1);
        String x = localDateTime1.format(formatter2);
        System.out.println(x);*/
        
        //formatData(data);
        //System.out.println(formatData2(data));
        // Current time
        /*
         * LocalDateTime localDateTime2 = localDate.atTime(LocalTime.now());
         * System.out.println(localDateTime2);
         * 
         * //Specific time LocalDateTime localDateTime3 = localDate.atTime(04,
         * 30, 56); System.out.println(localDateTime3);
         */
        
        System.out.println(formataValor("1"));
        System.out.println(formataValor("2.0"));
        System.out.println(formataValor("30"));
        System.out.println(formataValor("1089,1"));
        System.out.println(formataValor("985"));
        System.out.println(formataValor("9.59"));
        System.out.println(formataValor("0.59"));
        System.out.println(formataValor("0,89"));
        System.out.println(formataValor("13754.65"));
        System.out.println(formataValor("14754,65"));
        System.out.println(formataValor("15754,65"));
        //System.out.println(formataValor("1.558,56"));
        
    }
    
    public static String formataValor(String v) {
        DecimalFormat df = new DecimalFormat("######0.00");
        Double valor = Double.valueOf(v.replace(",", "."));
        return String.valueOf(df.format(valor));
    }
    
    public static String formatData(String data) {
        LocalDate localDate = LocalDate.parse(data);
        DateTimeFormatter formatter2 = DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime localDateTime1 = localDate.atStartOfDay();
        System.out.println(localDateTime1);
        String novaData = localDateTime1.format(formatter2);
        System.out.println(novaData);
        return novaData;
    }
    
    public static String formatData2(String data) {
        final LocalDate ld = LocalDate.parse(data, DateTimeFormatter.ofPattern("yyyyMMdd"));
        final LocalDateTime localDateTime1 = ld.atStartOfDay();
        return localDateTime1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
    
    /*public String formataValor(String vlCancelamento) {
        final String vlFormatado = vlCancelamento.replace(",", "");
        String decimal;
        String inteiro;
        if (vlFormatado.contains(".")) {
            final String[] div = vlFormatado.split("\\.");
            inteiro = StringUtils.leftPad(div[0], 15, "0");
            decimal = StringUtils.rightPad(div[1], 2, "0");
        } else {
            inteiro = StringUtils.leftPad(vlFormatado, 15, "0");
            decimal = "00";
        }
        return inteiro + decimal;
    }*/
}
