package advancepractice.practisedaytime01;

import java.util.Scanner;

public class Q04_Regex_AdSoyad {
    public static void main(String[] args) {
        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen ad ve soyadınızı arada bır bosluk olacak sekılde gırınız");
        String adSoyad=input.nextLine().replaceAll("[^a-zA-Z ]","").replaceAll("\\s+"," ").trim().toLowerCase();
        System.out.println("adSoyad = " + adSoyad);

        String ad=adSoyad.split(" ")[0];
        String soyad=adSoyad.split(" ")[1];
        String ilkHarf = ad.substring(0,1).toUpperCase();
        String soyadilkHarf = soyad.substring(0,1).toUpperCase();

        String adFormat=ilkHarf+ad.substring(1);
        String soyadFormat=soyadilkHarf+soyad.substring(1);

        System.out.println( "Ad : "+ adFormat);
        System.out.println( "Soyad : "+ soyadFormat);





        
    }
}
