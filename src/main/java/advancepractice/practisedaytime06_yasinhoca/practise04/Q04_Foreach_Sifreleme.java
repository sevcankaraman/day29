package advancepractice.practisedaytime06_yasinhoca.practise04;

import java.util.Scanner;

public class Q04_Foreach_Sifreleme {
    public static void main(String[] args) {
         /*Kullanıcıdan alınan bir String'de bulunan her bir karakteri alfabetik sırada bir sonraki
         karakter ile değiştirerek şifreleyen bir method ve şifreli ismi çözen ayrı bir method yazınız.
         (foreach loop kullanınız)*/
        System.out.println(sifreleme());
        System.out.println(sifreCoz());

    }

    public static String sifreleme() {
        Scanner input = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String[] arr = input.nextLine().split("");// // {".", ".", "." ... } array e dönuyor bueda
        String sifreliString = "";


        for (String w : arr) {
            if (w.equals("z")) {
                sifreliString += "a";
            } else if (w.equals("Z")) {
                sifreliString += "A";
            } else {
                sifreliString += (char) (w.charAt(0) + 1);
            }
        }
        return sifreliString;
    }
    public static String sifreCoz() {
        Scanner input = new Scanner(System.in);
        System.out.println("sifreli stringi giriniz");
        String[] arr = input.nextLine().split("");// // {".", ".", "." ... } array e dönuyor bueda
        String sifresizString = "";


        for (String w : arr) {
            if (w.equals("a")) {
                sifresizString += "z";
            } else if (w.equals("A")) {
                sifresizString += "Z";
            } else {
                sifresizString += (char) (w.charAt(0) - 1);
            }
        }
        return sifresizString;
    }

}
