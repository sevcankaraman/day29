package day05typecastinstringmanipulations;

public class StringManipulations01 {

// String bir non primitive data type dır ve aynı zamanda class dır.

    public static void main(String[] args) {

        String s="Java is easy";

        //example1= "s" Stringindeki tüm karakterleri büyük harf yapınız1

        String sUpper=s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY

        //EXAMPLE = S STRİNGİNDEKİ TÜM HARFLERİ KUCUK HARFE CEVİRİN

        String sLower=s.toLowerCase();
        System.out.println(sLower);

        //example 3:s stringindeki ilk caharacteri alınız

       char firstChar= s.charAt(0);
        System.out.println(firstChar);

        //example 4: s stringindeki 2. ve sondan ıkıcı karakteri alınız ve ekrana
        //           yan yana yazdırınız.

        char secondChar=s.charAt(1);

        char secondLastChar=s.charAt(10);

        //1.yol aynı satırda  yazdırmak için

        System.out.print(secondChar);
        System.out.println(secondLastChar);

        //2.yol

        System.out.println(""+secondChar+secondLastChar);

        //example :s stringindeki kullanılan caharacter sayısını bulunuz

        int slenghth=s.length();
        System.out.println(slenghth);

        //example: "s" stringindeki ilk 4 charcteri alınız.

        //substring (0,4)==> "0" yani ilk index dahil , " 4" yani ikinci index hariçtir.

        String sub1=s.substring(0,4);
        System.out.println(sub1);

        //example : "s" stringindeki "is" kelimesini alınız.

        String sub2=s.substring(5,7);
        System.out.println(sub2);

        //example : s stringindeki easy kelimesini alınız

        String sub3=s.substring(8,12);
        System.out.println(sub3);

        //bir character den baslayıp string in sonuna kadar alamak isterseniz,
        // ikinci index i yazmaynız.s.substring(8,12); yerine s.substring(8) yazınız.

        String sub4=s.substring(8);
        System.out.println(sub4);

        // example: s stringinde "money" kelimesinin olup olmadıgını kontrol ediniz

       boolean isExist= s.contains("money");
        System.out.println(isExist);

        //bir methodu öğrenirken 3 seyi mutlaka ögrenin:
        //1==>bu method ne iş yapar?
        //2==>bu methodun farklı kullanımları nasıl?
        //3==>bu method size ne return(sonuç) eder?

        //example : "s" stringinin belli bir harfle baslayıp başlamadıgını  kontrol ediniz.

        boolean isStart=s.startsWith("Java");
        System.out.println(isStart);

        //example: "s" stringinin6. characterden itibaren belli bir harfle baslayıp
        // başlamadıgını kontrol ediniz.

        boolean isBegin=s.startsWith("i",5);
        System.out.println(isBegin);








    }
}
