package practice.datatypesscannerdaytime02.daytime03;

import java.util.Locale;
import java.util.Scanner;

public class C01_StringManipulations {

  /*
                               String Class Methodlari

            1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
    ii)equals() method'u "boolean" return eder.
            2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf
    kucuk harfe dikkat etmeden anlamamiza yarar.
    ii) equalsIgnoreCase() method'u "boolean" return eder.
            3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
    ii) toLowerCase() method'u "String" return eder
            4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
    ii) toUpperCase() method'u "String" return eder
            5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
            ii) charAt() method'u "char" return eder.
            6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
    ii) length() method'u "int" return eder.
            7)contains(): i)Bir String'de belli bir characterin veya
    characterlerin var olup olmadigini anlamak icin
    kullanilir
    ii) contains() method'u "boolean" return eder.
            8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar
    ii)split() method'u "Array" return eder.
            9)replace () i)Metin icerisindeki karakter ya da karakterlerin,
    istenilen karakter ya da metinle degistirilmesini saglar.
    Sonuc String'dir..
            10)replaceFirst()
    i) Replace ile aynı sadece ilk bulunan karakteri değiştirir
     */
         /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
         1) \\d    ==> tum rakamlar (digit)
             \\D    ==> tum rakam disi character ler
         2) \\w   ==> A->Z        a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
             \\W  ==> A->Z        a->z         0->9    _ disindaki hersey
         3) \\s   ==> space tum bosluklar
             \\S   ==> space disindaki hersey
               12) + Concat: Bir stringe diğerini ekler.
            Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
            her ikisi String ise Java toplama degil BIRLESTIRME==YANYANA yazdirma yapar.
        ONEMLI NOT=JAVA YUKARIDAN ASAGI SOLDAN SAGA CALISIR.
         */

    public static void main(String[] args) {


        System.out.println(15+20+"merhaba");
        System.out.println("merhaba"+15+20);
        System.out.println("merhaba"+(15+20));
        System.out.println("merhaba"+15*20);

        //example: kullanıcıdan ismini ve soy ismini girmesini isteyin
        //sonrasında kullanıcı nasıl girerse girsin konsol da buyuk harfle yazılmasını saglayın

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen adınızı ve soyadınızı girin");
        String isim=input.nextLine(),soyad=input.nextLine();// multiple declaration : coklu tanımlama araya virgül
        // koyulur ; değil
        String tamisim=isim.concat(" "+"soyad").toUpperCase();
        System.out.println("tamisim = " + tamisim);

        //rakam haricindekileri silin
        String str="45.99$";
        str=str.replaceAll("\\D","");
        System.out.println("str = " + str);

        // verilen bir cumleyi yıldız * ile gizleyin,10. karakterden sonrasını yazdırın

        String cumle="Her dert java gibi olsa";
        System.out.println(cumle.replaceAll("\\w","*")+cumle.substring(10));

        //a harfi yerine @ isareti yerleştiriniz

        String kelime="olaganustu";
        System.out.println(kelime.replace("a","@"));

        //txt deki bütün 'a' 'e' ile değiştirin

        String txt="Merhaba Dünya";
        System.out.println(txt.replace("a","e"));

          //txt deki ilk bulunan 'a' yı 'e'yapın
        System.out.println(txt.replaceFirst("a","e"));

        //"kalem" yerine "biber" yazdırın
        String str2="dolma kalem ile bir dünya kaleme aldık";
        System.out.println(str2.replaceAll("kalem","biber"));

        String str3="bugun hava yagmurlu";
        System.out.println(str3.length());

        String str4="";
        System.out.println("str4.length()="+str4.length());

        String str5=" ";
        System.out.println("str5.length()="+str5.length());

        //kullanıcıdan isim ve soyisim girmesini isteyin ve
        // hangisisinin daha uzun oldugunu yazdıran koduru giriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isim ve soyisminizi girin:\nisim:");
        String name=input.next();
        System.out.println("soyisim:");
        String surname= input.next();

        if (name.length()>surname.length());
        System.out.println();











    }
}
