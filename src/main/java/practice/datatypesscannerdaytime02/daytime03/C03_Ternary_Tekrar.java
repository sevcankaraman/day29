package practice.datatypesscannerdaytime02.daytime03;

import java.util.Scanner;

public class C03_Ternary_Tekrar {
    /*TASK :
    Kullanicidan bir character girmesini isteyiniz
    Character harf ise kucuk harf olup olmadigini kontrol ediniz
    Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
    Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
    Harf degilse ekrana "Harf degil" yazdiriniz
    97:a  122:z ascii değeri
    */

    /*
    Ascii degerler verilmeseydi
    char a='a';
    System.out.println(a+0);
     */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char ch=input.next().charAt(0);

        boolean harfMi=(ch<='z'&& ch>='a') || (ch<='Z'&& ch>='A');
        boolean kucukHarf=(ch<='z'&& ch>='a');

        //ternary ile çözümü
        //String result=(harfMi) ? kucukHarf?"kucuk harf:": "buyuk harf  ": "harf değil";
        //        System.out.println("result=" +result);

        //if ile çözümü

        if (harfMi) {
            if (kucukHarf) {
                System.out.println("girdiğiniz harf küçük harftir");
            } else {
                System.out.println("girdiğniz harf büyük harftir");
            }
        } else {
            System.out.println(" girdiğiniz karakter harf değil");
        }


    }
}
