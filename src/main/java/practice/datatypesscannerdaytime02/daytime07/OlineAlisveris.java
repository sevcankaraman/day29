package practice.datatypesscannerdaytime02.daytime07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OlineAlisveris {

    /*
     * Basit bir online alisveris programi yaziniz.
     *
     * 1. Adim : "urunListesi"nden urun sectir ve kac adet istedigini sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini "toplamOdeme" ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

     * */

    static List<String> urunlistesi=new ArrayList<String>();
    static List <Double> urunfiyatlari=new ArrayList<>();
    static double toplamodeme;
    static Scanner input=new Scanner(System.in);


    public static void main(String[] args) {
        urunlistesi.add("saat : urun kodu 1");
        urunlistesi.add("monitor : urun kodu 2");
        urunlistesi.add("canta : urun kodu 3");
        urunlistesi.add("kitap : urun kodu 4");
        urunlistesi.add("top : urun kodu 5");

        urunfiyatlari.add(15.0);// 0. indeks get methodu 0.indeksten baslar
        urunfiyatlari.add(200.0);//1.indeks
        urunfiyatlari.add(50.0);//2. indeks
        urunfiyatlari.add(10.0);//3. indeks
        urunfiyatlari.add(500.0);//4. indeks

        System.out.println(urunlistesi);
        musteriSecim();
    }//main

        private static void musteriSecim(){
            System.out.println("lütfen sectiğiniz urunun kodunu gırınız");
            int secim=input.nextInt();
            System.out.println("lütfen sectiğiniz urunden kac adet istediğinizi giriniz");
            int adet=input.nextInt();

            double urunTutari=adet*urunfiyatlari.get(secim-1);
            toplamodeme+=urunTutari;

            System.out.println("devam ise 1\nodeme için 2 seciniz");
            int devamMi= input.nextInt();

            if (devamMi==1) {
                musteriSecim(); // recursive method ==> method içinde method cağırmak ıcın
            }else
                odeme();

    }//musteri secim

    private static void odeme() {
        LocalDate kurulusGunumuz=LocalDate.of(2023,01,10);
        LocalDate date=LocalDate.now();

        if (date.isEqual(kurulusGunumuz)){
            System.out.println("bugun bizim kurulus gunumuz borcunuz yoktur***");
        }else
            System.out.println("yıne beklerız : ödemeniz "+ toplamodeme);
    }//odeme()


}
