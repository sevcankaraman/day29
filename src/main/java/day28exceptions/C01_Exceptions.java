package day28exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {

        /*

1)"Exception" (istisnai hata) javada kodlarimizi
         calistirirken meydana gelen beklenmedik durumlardir.
2) Exception lar ile calismanin iki yolu vardir
      a) try-catch block kullanma ve exception
         olussa bile calısmayı devam ettirme
      b) throw exception kullanarak calismayi
         durdurma (mesela yazdigimiz kod geregi bir
         dosya uzerinden okuma yapmamız
         gerekiyor ise bu dosyamız eger silinmis ise java dosyayi bulamaz ve
         application devam etmez)
3) Eger exception'ı handle etmez isek (sorunu halletmezsek) java calismayi durdurur.
4) try-catch kullanirken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz
5) try ; catch olmadan tek basina kullanilamaz.
6) Eger yazmis oldugunuz harhangi bir kod satirinda  problem olabiliecegini dusunuyorsaniz
   try-catch block icine koymalisiniz
7) catch block parantezi icerisine olmasi muhtemel exception class ismi yazilir
8) e.getmessage(), methodunu kullanarak teknik mesajlar elde edebiliriz.
   System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir
   e.printStackTrace(); methodu Exception ile ilgili detaylica teknik mesaj verir. kod calismaya devam eder
   System.err.println("burasi renkli"); hata mesajini renkli olarak verir bu sayede cansolda diger mesajlardan ayırmak icin kullaniriz
9) Eger try body icindeki kod sorunsuz calisirsa catch blok devreye girmez
* *

        //Compile Time Error == Kodlarin yazim asamasinda olusan hatalardir CTE
        // Run Time Error == Kodlari calistirdiktan sonra olusan hata tipi  RTE


        /*
        1) NumberFormatException
         */

        // Bir String'i alip int'a ceviren kodu yaziniz

        String str= "123";//happyScenario positive Scenario

        int result =convertStringToInteger(str);//Stringi integer'a cevir
        System.out.println("result+5 = " +( result+5));//128  1235

        String st ="123a";//Negative Scenario
        int result2 = convertStringToInteger(st);
        System.out.println("(result2+10) = " + (result2+10));



    }//main

    private static int convertStringToInteger(String str) {
        //ctrl +alt+t
        int i=0;

        try {
            i = Integer.valueOf(str);
            System.out.println("Burasi try Bolumu : "+i);
        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan karakter iceren String'ler Integer'a cevrilemez");
        }
        return i;
    }
}//class