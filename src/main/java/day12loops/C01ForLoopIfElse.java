package day12loops;

import java.util.Scanner;

public class C01ForLoopIfElse {


    // example : kullanıcıdan baslangıc ve bitiş degerlerini alın.
    // baslangıc degerinden baslayıp bitis degerine kadar tüm tam
    //sayıları ekrana yazdırınız.


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen baslangıc degerini giriniz:");
        int baslangic = input.nextInt();

        System.out.println("lütfen bitiş degerini giriniz:");
        int bitis = input.nextInt();

        if (baslangic > bitis) {
            System.out.println("verdiğini baslangıç degeri bitiş değerinden küçük olmalı");
        } else {

            for (int i = baslangic; i < bitis; i++) {
                System.out.print(i + " ");

            }
            System.out.println();
            // example : kullanıcıdan baslangıc ve bitiş degerlerini alın.
            // baslangıc degerinden baslayıp bitis degerine kadar aradi  tüm çift tam
            //sayıları ekrana yazdırınız.

            Scanner scan = new Scanner(System.in);
            System.out.print("lütfen baslangıc degerini giriniz:");
            int start = scan.nextInt();

            System.out.print("lütfen bitiş degerini giriniz:");
            int end = scan.nextInt();

            if (start> end) {
                System.out.println("verdiğini baslangıç degeri bitiş değerinden küçük olmalı");
            } else {

                for (int i = start; i <= end; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }

                }
            }

        }}}




