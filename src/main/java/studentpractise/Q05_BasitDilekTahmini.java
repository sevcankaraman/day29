package studentpractise;

import java.util.Locale;
import java.util.Scanner;

public class Q05_BasitDilekTahmini {
    //Q05_BasitDilekTahmini

        /*

        10 tane String bir dilek olusturunuz ve kullanicidan bir den 10 a kadar
        rakamla sayiyi aliniz ve bir sans oyunu olusturunuz

         */
        public static void main(String[] args) {
            String bir   = "Araba";
            String iki   = "Ev";
            String uc    = "Is";
            String dort  = "Kariyer";
            String bes   = "Son model bir telefon";
            String alti  = "Biraz daha calismak";
            String yedi  = "Son model bir bilgisayar";
            String sekiz = "Cok buyuk bir sirkette lead'lik";
            String dokuz = "Cok fazla uyku";
            String on    = "Saglikli bir hayat";

            Scanner input =new Scanner(System.in);
            System.out.println("lütfen isminizi girin...");
            String isim=input.next();

            System.out.println("******************süprizleri görmek için********************\n"+
                    "*** Lütfen 1 ile 10 arası bir sayiyi harflerle yazınız ***");
            String sayi=input.next().toLowerCase();

            switch (sayi){
                case "bir":
                    System.out.println(isim+ " yeni yılda seni " +bir+ " bekliyor");
                    break;
                case"iki":
                    System.out.println();
            }


        }

}
