package day08nestedif;

import java.util.Scanner;

public class C01_NestedIf {

    ///*
    //TASK : Kullanicidan 3 tane pozitif bir tamsayi aliniz.
    //       Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
    //       Eger ucgen ise "eskenar"
    //       Ucgen olma durumunu
    //       kontrol ediniz.
    //
    //       INFO :
    //       Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
    //                        herhangi iki kenar farki ucuncu kenardan kucuk olmali
    //
    //        a+b>c>a-b
    //        a+c>b>a-c
    //        b+c>a>b-c
    //        a=b=c ise eskenar ucgen

    // java nested kodları calıştırırken cok zaman harcıyor.buna "Time Complexity" denır
    //
    // */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lüütfen ucgenin 3 kenar uzunlugunu giriniz");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {// Ucgen olma Durumu buyuk if

            if (a == b && b == c && a == c) {
                System.out.println("Eskenar Ucgen");
            } else {
                System.out.println("Ucgen ama Eskenar ucgen degildir.");
            }

        } else {//Ucgen Olmama durumu
            System.out.println("Ucgen Degildir");


        }

        //Kullanicidan bir ucgenin kenar uzunlugunu aliniz
        // Uc kenari birbirine esit ise "ESkenar Ucgen " yazdiriniz
        //Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
        //Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("lüütfen ucgenin 3 kenar uzunlugunu giriniz");

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x + y > z && x - y < z && x + z > y && x - z < y && y + z > x && y - z < x) {

            if (x == y && y == z) {
                System.out.println("Eskenar Ucgen");
            } else if (x == y || y == z || x == z) {
                System.out.println("Ikizkenar Ucgen");
            } else  {
                System.out.println("Cesitkenar Ucgen");
            }
        }else{
            System.out.println("Ucgen degildir");
        }



    }//main

    }//
