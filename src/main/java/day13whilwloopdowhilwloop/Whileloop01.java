package day13whilwloopdowhilwloop;

import java.util.Scanner;

public class Whileloop01 {
    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        //            3 ==> 3x1=3  3x2=6  3x3=9  3x4=12 ... 3x10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz...");
        int num = input.nextInt();
        int i = 1;

        while(i<11){
            System.out.println(num + "x" + i + "=" + (num * i));
            i++;
        }

        //Example 2: Verilen bir String'de her harfin sonrasina "*" sembolunu ekleyiniz.
        //           Java ==> J*a*v*a*
        System.out.println("Bir kelime giriniz");
        String word = input.next(); // burdakı strıng datayı değiştireceğim için asagıda yenı bır strıng data olusturudm
        String newWord = ""; // farklı bır data ıcın memory de yenı bır yer olusturdum

        int k = 0;// Stringlerde indeks 0 dan baslar bende ilk harften baslayacagım0 dan baslayacagım ıcın k=0 dedim

        while(k<word.length()){// Stringin son karakterine gideceğim için ,,son karakterın ındeksı length den bır azdı.
            newWord = newWord + word.charAt(k) + "*";// newworde ekleme yap, neyı ekle word stringinden karakteri al indeksine bakarak,yanına bır de yıldız koy.bu sonucu da al newword un ıcıne koy
            k++;
        }
        System.out.println(newWord);
    }
}

