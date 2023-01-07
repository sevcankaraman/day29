package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {
        Date myDate=new Date();
        System.out.println("myDate = " + myDate);//myDate = Sat Jan 07 23:28:45 TRT 2023
        System.out.println("myDate.getTime() = " + myDate.getTime());//1673123325971=1 ocak 1970 den su ana kadarkı mılı sanıye mıktarıdır
        // 1ocak 1970 te baslar dijital tarihin baslangıcı

        //içinde bulundugumuz an nasıl alınır?

        //Dünyanın herhangı bır saat dılımındekı saatı nasıl alırız?

        System.out.println("LocalDate.now() = " + LocalDate.now());//LocalDate.now() = 2023-01-07
        System.out.println("LocalTime.now() = " + LocalTime.now());//LocalTime.now() = 23:34:54.155904100
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());//LocalDateTime.now() = 2023-01-07T23:36:09.302398200
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));

        //İleriki bir tarihe nasıl gidilir?
        System.out.println( LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));

        //Geriki tarihe nasıl gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));

         //İleriki bir zamana nasıl gıdılır?
        System.out.println(LocalTime.now().plusHours(3));

        //geriki bir saata nasıl gıdılır?
        System.out.println(LocalTime.now().minusMinutes(45));

       // Zaman da bellı bır bolumu nasıl alırız?
        System.out.println(LocalTime.now().getHour() + " : " + LocalTime.now().getMinute());

        //Tarih de belli bir bolumu nasıl alırız?
        System.out.println(LocalDate.now().getMonth() + ":" + LocalDate.now().getDayOfMonth());//isim olarak ayı verir

        System.out.println(LocalDate.now().getMonthValue() + ":" + LocalDate.now().getDayOfMonth());//sayı olarak ayı verır

        //İki tarih nasıl karşılastırılır?
        //02/13/2005 - 03/01/2007

        boolean result =LocalDate.of(2005, 02,13).isBefore(  LocalDate.of(2007,03,01));
        System.out.println(result); //true // isAfter ==> "sonra mı" anlamında.

        //Tarihlerin formatları nasıl değiştirilir?

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        //kucuk m ler dakıka ıcın kullanılıyor onun ıcın buyuk M kullandık.
        //tek M = 1
        // ıkı M =01
        // üc MMM= ay isminin 3 harfını yazar
        //dört MMMM= ay isminin tamammını yazar
        // M için geçerli kurallar d için de gecerli
        // tarih yazarken yılın son ıkı rakamını kullanabılırız.

        //d==> tek rakamla gun nosunu yazar
        // dd==> 2 rakamla gun nosunu yazar
        // yy==> yılın son ıkı rakamını yazar
        // yyyy==> yılın tamamını yazar

        System.out.println(dtf.format(LocalDate.now()));//08/01/2023
        //pattern ==>kalıp demek

    }
}
