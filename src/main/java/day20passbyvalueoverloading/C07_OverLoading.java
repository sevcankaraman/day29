package day20passbyvalueoverloading;

public class C07_OverLoading {
    public static void main(String[] args) {

        /*
        AYNI İSİMDE AYNI CLASS DA BİRDEN FAZLA METHOD OLUŞTURABILIR MIYIZ?

        1)Java aynı isimde aynı class da bırden fazla method oldugunda içerisindeki Data type ına
         data sayısına yada yerlerıne göre en uygun olanı secer. eger bir class da isimleri aynı
         data typeları farklı methodlar olusturursak buna method overloadıng denır.
         java hangı methodu kullanacagına karar verırken en optımızasyona gıder.
         En uygun olanı en az autowidenıng gerektireni secer.

         */

        String str="Java ile guzel Dunya";
        System.out.println(str.substring(2));//va ile guzel Dunya
        System.out.println(str.replace("Java", "*"));//* ile guzel Dunya
        System.out.println(str.replace('J', '*'));//*ava ile guzel Dunya

        topla(3,5);
        topla(8.6,5);
        topla(2.4,6.8);



    }//main
    private static void topla(double a, double b) {
        System.out.println(a+b);

    }
    private static void topla(double a, int b) {
        System.out.println(a+b);

    }

    private static void topla(int a, int b) {
        System.out.println(a+b);

    }


}