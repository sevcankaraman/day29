package day23datetimestringbuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //example 1: Time ı formatlayınız

        LocalTime myTime=LocalTime.now();
        System.out.println(myTime);//21:38:35.555920300

        //hh==> 12 lik saat sistemini kullanır.
        //HH==> 24 lük saat sistemini kullanır.
        //hh kullandıgınızda AM veya PM demelisiniz,bunu demek için "a" yazmanız yeterlidir.
        //yan, ; "hh:mm a"

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(dtf.format(myTime));

    }
}
