package day37lambda;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda3 {
    public static void main(String[] args) {
        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //1)Tum "averageScore" larin 91 den buyuk olup olmadigini kontrol kodu yaziniz

       boolean result1= coursesList.stream().allMatch(t->t.getAverageScore()>91);
        System.out.println(result1);

      //2)Kurs isimlerinden en az bırının "Turkısh" kelımesını ıcerıp ıcermedıgını kontrol eden kodu yazınız.
        boolean result2= coursesList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(result2);


        //3)Average score'u en yuksek olan kursun ismini console yazdiran kodu yaziniz.

        String name1=coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                findFirst().
                get().
                getCourseName();

        System.out.println(name1);

        //4) Tüm course objectlerını kucukten buyuge dızınız ve ılk ıkısı harıc lıste halınde konsola yazdırınız
        List<Course> myList=coursesList.
                      stream().
                      sorted(Comparator.comparing(Course::getAverageScore)).
                      skip(2).
                      collect(Collectors.toList());

        System.out.println(myList);

        //5)  Tüm course objectlerını kucukten buyuge dızınız ve ılk ucunu lıste halınde konsola yazdırınız
        List<Course> yourList=coursesList.
                              stream().
                              sorted(Comparator.comparing(Course::getAverageScore)).
                              limit(3).
                              collect(Collectors.toList());

        System.out.println(yourList);

        //6)  Tüm course objectlerını kucukten buyuge dızınız ve ucuncuyu konsola yazdırınız

        Course result5= coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).
                limit(1).
                findFirst().
                get();

        System.out.println(result5);





    }
}
