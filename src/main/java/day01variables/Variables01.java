package day01variables;

import com.sun.source.util.SourcePositions;

public class Variables01 {

    //primitive data types --> char - boolean - byte - short - int - long - float - double
    //float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
    //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112
    //Note 1: primitive data type'larini Java olusturmustur, biz olusturamayiz
    //Note 2: primitive data type'larinin isimlerinde sadece kucuk harf kullanilir
    //Note 3: primitive data'lar data type'lara gore memory de farkli farkli yer kaplarlar
    //Note 4: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar

    public static void main(String[] args) {

        //Ornek 1: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.

        //Note: Java "Decimal Numbers" i otomatik olarak "double" kabul eder.
        //      Siz data type'ini "float" yazarsaniz hata verir.
        //      float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz
        //      float memory'de 4 byte yer kaplar, double 8 byte yer kaplar

         float shirtPrice = 12.99f;
         float shoesPrice = 15.89f;

        //System.out.println() ekrana yazdirir ve "pointer" i bir sonraki satira koyar
        //System.out.print() ekrana yazdirir ve "pointer" i ayni satirda tutar

         System.out.println(shirtPrice+shoesPrice);

        //System.out.println() yazdirmanin kisa yolu ==> "sout" yaz ve Enter'a bas

        System.out.println();

        //Ornek 2: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve
        // agirliklari farkini ekrana yazdirin

        double weightCell = 0.000000000000112;
        double weightAmip = 0.000000000000023;

        System.out.println(weightCell-weightAmip);
        //8.9E-14 ==> 0.000000000000089 ==> "8.9 carpi 10 uzeri -14"  "E ==> Exponent"

        //Ornek 3: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.

        int yas= 13;
        System.out.println(yas);

        //Ornek 4: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.

        String studentName= "sevcan";
        System.out.println(studentName);

        //Ornek 5: char data type'inda ilk ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.

        char isminIlkHarfi = 's';
        System.out.println(isminIlkHarfi);

        //Ornek 6: boolean data type'inde emeklimisin icin bir variable olusturun ve false degerini atayin.

        boolean emekliMisin = false;
        System.out.println(emekliMisin);

        //Ornek 7: Site nufusu icin bir variable olusturup deger atayiniz.

        short siteNufusu = 12000;
        System.out.println(siteNufusu);

        //Ornek 8: Ulke nufuslari icin bir variable olusturup deger atamasi yapiniz

        int ulkeNufuslari= 1234567890;
        System.out.println(ulkeNufuslari);

        //Ornek 9: insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.

        //Note: Bir deger long ise sonuna "L"(Tercih edilir) veya "l" konulur.

        long cellNumberInHumanBody= 879456738495999L;
        System.out.println(cellNumberInHumanBody);

        //Eger long'a atadiginiz deger int'lerin araliginda ise sonuna "L" koymaya gerek yok

        long weightOfSun = 1234567;
        


    }


    }
