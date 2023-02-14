package lambdaRecap;

import day37lambda.Utilities;

import java.util.*;
import java.util.stream.Collectors;


public class Lambda01 {

    public static void main(String[] args) {


        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        ciftVePozitifLamExYazdir(sayi);
        System.out.println(" \n  *******");
        ciftVePozitifMetRef(sayi);
        System.out.println(" \n  *******");
        kareYazdir(sayi);
        System.out.println(" \n  *******");
        kareTekrarsiz(sayi);
        System.out.println(" \n  *******");
        buyKucSirala(sayi);
        System.out.println(" \n  *******");
        pozitifKupBirlerBas5(sayi);
        System.out.println(" \n  *******");
        toplamMetRef(sayi);
        System.out.println(" \n  *******");
        toplamLamExp(sayi);
        System.out.println(" \n  *******");
        System.out.println(pozitifElemanCarpim(sayi));
        System.out.println(" \n  *******");
        System.out.println(ciftElKareleriKucukBuyuk(sayi));


    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifLamExYazdir(List<Integer> sayi){

        sayi.stream().filter(t->t%2==0 && t>0).forEach(t-> System.out.print(t + " "));
    }
    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVePozitifMetRef(List<Integer> sayi){

        sayi.stream().filter(t->t%2==0 && t>0).forEach(Utils::yazdir);
    }
    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın

    public static void kareYazdir(List<Integer> sayi){

        //  sayi.stream().map(t->t*t).forEach(Utils::yazdir);

        sayi.stream().map(Utils::kareBul).forEach(Utils::yazdir);
    }
    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın

    public static void kareTekrarsiz(List<Integer> sayi){

        sayi.stream().map(Utils::kareBul).distinct().forEach(Utils::yazdir);
    }
    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyKucSirala(List<Integer>sayi){

        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);
    }
    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız

    public static void pozitifKupBirlerBas5(List<Integer>sayi){
        sayi.
                stream().
                filter(Utilities::pozitifMi).
                map(Utilities::kupu).
                filter(t->t%10==5).
                forEach(Utils::yazdir);
    }
    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın

    public static void toplamMetRef(List<Integer>sayi){

        Optional<Integer> sonuc=sayi.//reduce nın null exceptıon fırlatma ıhtımalı oldugu ıcın optional ınteger yaptık
                stream().
                reduce(Integer::sum);
        //reduce methodu termınal methoddur.
        //terminal methodlardan sonra hiçbir  method kullanılamaz.
        System.out.println(sonuc);
    }
    // SORU 8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın

    public static void toplamLamExp(List<Integer>sayi){

        System.out.println(sayi.stream().reduce(0,(a,b)->a+b));/// identity ilk deger

        //a değişkeni ilk elemanı identity den alır sonraki değerlerini toplamdan
        //b ise her zaman streamden(akıştan) alır

    }

    //SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın

    public static int pozitifElemanCarpim(List<Integer>sayi){

        int sonuc=sayi.
                stream().
                filter(t->t>0).
                reduce(1,(a,b)->a*b);

        return sonuc;
    }

    public static Optional<Integer> pozitifElemanCarpimMethoRef(List<Integer>sayi){

        Optional<Integer> sonuc=sayi.
                stream().
                filter(Utilities::pozitifMi).

                reduce(Utilities::carpim);

        return sonuc;//yukarıdakı sorunun method referance ıle kendım yaptım
    }

   //SORU10 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde
    // return ederek yazdırınız

    public static List<Integer>  ciftElKareleriKucukBuyuk(List<Integer> sayi){

        List<Integer> sonuc =  sayi.
                stream().
                filter(t-> t%2==0).
                map(t-> t*t).sorted().
                collect(Collectors.toList());
        return sonuc;
    }














}