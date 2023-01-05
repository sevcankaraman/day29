package day05typecastinstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s="Learn Java earn money";

        //example1:"s" stringi nin "money" ile bitip bitmediğini kontrol ediniz.

       boolean isEnd= s.endsWith("money");
        System.out.println(isEnd);

        //example 2: "s" Stringindeki "money" kelimesini "dolar" kelimesine ceviriniz.

        String s1=s.replace("money","dolar");
        System.out.println(s1);

        //example 3 : "s" String indeki "earn" kelimesini "win" kelimesine ceviriniz.

        String s2 =s.replace("earn","win");
        System.out.println(s2);


        //example 4 :"s" stringindeki "a" harflerini "*" ceviriniz.

        // Note : replace methodunda coklu karakter ile calısırsanız mecbur
        // çift tırnak kullanacaksınız.
        // tek karakterle calısırsanız cift tırnak veya tek tırnak kullanabılırsınız


        String s3=s.replace("a","*");
        System.out.println(s3);

        // Note : ya ıkısı cift tırnak yada ıkısıde tek tırnak olmalıdır.

        // Example 5 :"s" stringindeki "n" harflerini "xxx" a ceviriniz.

        String s4=s.replace("n","xxx");
        System.out.println(s4);

        // example 6 : "s" stringindeki tüm "e" harflerini siliniz.

        // note : "hiçbir sey"  char data tipinde yok bu yuzden replace() kullanarak
        //silme işlemi yaparsanız mutlaka çift tırnak kulllanınız

        String s5=s.replace("e","");
        System.out.println(s5);

        String t= "Ali 13 yasindadir";

        //example 7: "t" stringindeki tüm rakamları(0,1,2,3,4,5,6,7,8,9,) "*" a ceviriniz.

        // note : bir grup datayı degiştirmek için replaceAll() kullanılır.
        // note : bir grup datayı ifade etmek için "Regular Expressions"(Regex) kullanırız

        String t1=t.replaceAll("[0-9]","*");
        System.out.println(t1);

        /*
             meshur Regexler:
             1) tüm rakamlar==> [0-9]
             2) tüm küçük harfler==> [a-z]
             3) tüm büyük harfler==> [A-Z]
             4) tüm küçük harfler ve büyük harfler==> [a-zA-Z]
             5) tüm harfler ve rakamlar ==>[a-zA-Z0-9]
             6) tüm noktalama işaretleri==>\\p{Puncth}
             7) tüm sesli harfler ==>[aeiouAEIOU]
                 x,  q, w harfleri==>[xqw]

           8) Küçük harflerden farklı tüm karakterler ==> [^a-z] "^" sembol -den farklı demek
           9) Tüm harflerden farklı tüm karakterler ==> [^a-zA-Z]
           10)Space dısındaki tüm characterler ==< \\S



         */

        // example 8 : "t" stringindeki tüm rakamları ve harfleri "!" ceviriniz

        String t2=t. replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);

        //example 9 : "t" stringindeki tüm sesli harfleri "?" cevirin

        String t3= t.replaceAll("[aeiouAEIOU]","?");
        System.out.println(t3);

        //// example 10 : "t" stringindeki küçük harfler dısındaki
        // tüm character'leri"<>"ceviriniz

        String t4=t.replaceAll("[^a-z]","<>");
        System.out.println(t4);

        //Example 11: "t" String'indeki tüm harfler dışındaki tüm karakterleri "+" çeviriniz

        String t5 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);// Ali++++yasindadir++++

        //example 12: "t" stringindeki  spaceler dısındaki tüm
        // karakterleri "+" ceviriniz.

        String t6=t.replaceAll("[^ ]","+");
        System.out.println(t6);

        //example 13: "t" stringindeki  sesli harfler dısındaki tüm
        // karakterleri "&" ceviriniz.

        String t7=t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(t7);




    }
}
