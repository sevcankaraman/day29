package day11forloop;

public class ForLoops03 {
    public static void main(String[] args) {
        ////Example 1: Size verilen bir String'i tersten yazdiriniz(interwiew sorusu)
        ////           "Germany" ==> ynamreG

        String s = "Java";
        String t = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);

        }
        System.out.print(t);//sout u for un  içine koyarsak dongunun her adımını yazdırır

        //example 2: size verilen bir stringin palindrom olup olmadıgını kontrol eden kodu yazınız.
        // civic,nalan,kucuk,11211 ==> palindrome

        //Logic: Stringi ters cevir sonra da duz hali ile ters halini karşılastır,aynı ise "palindrome"de.

        String duz = "civic";
        String ters = "";

        for (int i = duz.length() - 1; i >= 0; i--) {
            ters = ters + duz.charAt(i);
        }
        if (duz.equalsIgnoreCase(ters)) {
            System.out.println(duz + ":Bu String Palindrome'dur");
        } else {
            System.out.println(duz + ":Bu String Palindrome degildir");

        }
    }}
