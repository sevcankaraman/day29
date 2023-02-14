package day37lambda;

import day36lambda.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda2 {

    /*AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
    bu şarta uyması durumunda true dönecektir.


            NoneMatch: Şarta göre Stream içindeki hiç bir
    elemanın şartı sağlamaması durumunda true dönecektir.

    bu methodları otomasyon testerlerın kullandıgı 3 methoddur . onemlı

     */
    public static void main(String[] args) throws IOException {

        //1)LambdaTextFile dosyası ıcındekı metnı konsola yazdıran kodu yazınız

        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).forEach(System.out::println);

        //lines() ==> verdiğiniz adresteki dosyaya gidip ordaki satirlari stream() olarak veriyor

        //Files.Lines() Methodu path i stream e cevirir.
        //file classina git sag tikla "copy Path reference" ile adresi alip
        // "Paths.get()" in icine koyuyoruz ve yazdirinca textFile i consolda okuruz

        //2)LambdaTextFile dosyası ıcındekı her karakteri uppercase yapınız

        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //3)LambdaTextFile dosyası ıcınde herhangı bır kelımenın var olup olmadıgını gosteren kodu yazınız

       boolean result= Files.
                       lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                       map(t->t.split(" ")).
                       flatMap(Arrays::stream).
                       anyMatch(t->t.contains("Java"));//herhangı bır kelıme java ıse sonuc true olur

        System.out.println(result);

        //AnyMatch: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
        //herhangi bir elemanla eşleşme durumunda true dönecektir.

        //4) LambdaTextFile dosyası ıcındeki her kelımenın "a" içerip içermediğini gösteren kodu yazınız

        boolean result2= Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                allMatch(t->t.contains("a"));//her kelıme a harfını ıcerıyorsa sonuc true olur aksı halde false olur

        System.out.println(result2);

       // 5) LambdaTextFile dosyasi icindeki hicbir kelimenin "x" icermedigini gosteren kodu yaziniz
        boolean result3= Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                noneMatch(t->t.contains("x"));

        System.out.println(result3);

        //6) LambdaTextFile dosyasi icinde "r" ile biten kelimeleri sayan kodu yaziniz
        //1.yol
        long result4= Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).
                count();

        System.out.println(result4);
       //2.yol tavsiye edilmez
        long result5= Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).
                collect(Collectors.toList()).
                size();

        System.out.println(result5);






    }
}
