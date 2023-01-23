package day06stringmanipulationsifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Bir String'in bas ve sonunda space caharacter'i varsa siliniz.
        //             "   Ali Can   "     ==>      "Ali Can"
        String s = "   Ali Can  ";
        System.out.println(s);

        //trim() method'u bir String'in bas ve sonundaki space character'lerini siler, aradaki space'lere dokunmaz
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$", "");
        System.out.println(tv2);// 456.99==>ondalık sayılar java da otomatik olarak double kabul edılır

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2);// 875.99

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);//1332.98

        //example 3 : verilen ismin ilk isminin ilk harfini ve soy ısmının ılk harfını ekrana yazdırınız
        //             "Ali Can" ==> AC

        String name = "   ali cAN  ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);

        System.out.println("" + first + second);

        //example 4: bir stringin hiç karakter içermediğini (boş string) kontrol eden kodu yazınız

        String str = "";

        //1.yol: length kullan

        boolean result1 = str.length() == 0;
        System.out.println("string boş mu ?" + result1);

        //2.yol: isEmpty() kullan. Java bir konuda method uretmişse o methodu kullanmak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("string boş mu?" + result2);

        //Example5 : bir stringin space hariç hiçbir karakter içermediğini kontrol eden kodu yazınız

        //1.yol
        String t = "           ";
        boolean resul3 = t.replace(" ", "").length() == 0;
        System.out.println("sadece space mi var?" + resul3);

        //2.yol
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("sadece space mi var?" + result4);

        //3.yol
        //isBlank() methodu sadece space içeren stringler için true verir, space dısında bir character içerirse false verir
        //isBlank() methodu boş Stringler için de true verir.
        //isBlank() ==> space+ hiçbirsey için true     isEmpty==> hiçbirşey için true

        boolean result5 = t.isBlank();
        System.out.println("sadece space mi var?" + result5);






        String r = "Java is easy to learn";

        int idxA = r.indexOf('a');
        System.out.println(idxA);

        int idxI = r.indexOf("i");
        System.out.println(idxI);

        int idxE = r.indexOf('e');
        System.out.println(idxE);


        //example 7 : bir Stringde java kelimesinin ilk olarak kaçıncı indexte  kullanıldıgını gösteren kodu yaznınz.
        //       " ah java vah java sensiz oluyor java"==> 3

        //indexOf("Java") kullaniminda ssiz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index'ini almis olursunuz

        String u = " ah java vah java sensiz oluyor java";
        int idxjava = u.indexOf("java");
        System.out.println(idxjava);
        //indexs of methodu olmayan karakterler ıcın kullanılırsa her zaman -1 verir.
        int idxOfXyz=u.indexOf("xyz");
        System.out.println(idxOfXyz);


        //example 8: bir String de  a,e,i characterlerinin son görünümlerinin indexleri toplamını ekrana yazdırın
        //           "Java is easy to learn"==>18+5+17=40

        String v = "Java is easy to learn";
        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);

        System.out.println("Toplamlari " + (idxOfA + idxOfE + idxOfI));

        //Note: lastIndexOf() String olmayan bir character icin kullanilirsa her zaman "-1" verir

        //example 9: bir string deki tekrarsız karakterleri ekrana yazdırınız
        // abbccdc==> ad

        String y = "aac";

        char ch1 = y.charAt(0);

        if (y.indexOf(ch1) == y.lastIndexOf(ch1)) {
            System.out.println(ch1);//c
        }

        char ch2 = y.charAt(1);
        if (y.indexOf(ch2) == y.lastIndexOf(ch2)) {
            System.out.println(ch2);//c
        }

        char ch3 = y.charAt(2);
        if (y.indexOf(ch3) == y.lastIndexOf(ch3)) {
            System.out.println(ch3);//C

        }


        //Example 10: Sayi pozitif ise ekrana pozitif yazdirin.
        int num = 12;

        if (num > 0) {
            System.out.println("Pozitif");
        }

        //Example 11: Sayi -1 ile 10 arasinda ekrana "Rakam" yazdirin
        int number = 30;

        if (number > -1 && number < 10) {
            System.out.println("Rakam");
        }

        //Example 12: Sayi uc basamakli ise ekrana "Wooow!" yazdirin.
        int n = 123;

        n = Math.abs(n);

        if (n > 99 && n < 1000) {
            System.out.println("Wooow!");

            int a = 2;
            int b = 3;

            if (a > b) {
                System.out.println(a + b);
            }
            if (a == b) {
                System.out.println(a * b);
            }
        }
    }


}






