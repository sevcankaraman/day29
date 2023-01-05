package day08nestedif;

import java.util.Locale;
import java.util.Scanner;

public class C03_NestedIf {

    /*

    kullanıcıdan 0 dan küçük 120 den büyük değer giremeyecek sekilde datalari aldiktan sonra
    eğer calisan kadınsa 60 yasından buyukse "emekli olabilir"
    calısan erkekse 65 yasından buyukse "emekli olabilir" yazdıran kodu olusturunuz

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen cisiyetinizi giriniz ?\nKadın için K harfi\nErkek için E harfi");
        char cinsiyet=input.next().toUpperCase().charAt(0);

        System.out.println("lütfen yaşınızı girin");
        int yas= input.nextInt();

        if (cinsiyet == 'K') {//auter if
            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen giridiginiz yas degerini kontrol ediniz");
            } else if (yas > 60) {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Emekli Olamazsin "  + (60 - yas) + " yil daha  calisman gerekir");
            }

        } else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen giridiginiz yas degerini kontrol ediniz");
            } else if (yas > 65) {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Emekli Olamazsin " +(65 - yas) + " yil daha calisman gerekir");
            }

        } else {
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
        }

    }


}