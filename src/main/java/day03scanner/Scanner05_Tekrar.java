package day03scanner;

import java.util.Scanner;

public class Scanner05_Tekrar {
    public static void main(String[] args) {

        // kullanıcıdan bir dikdörtgenin ıkı kenar uzunlugunu alınız
        //1)alanını hesaplayın (kısa kenar* uzun kenar)
        //2)cevresini hesaplayın(2*kısa kenar 2*uzun kenar)

        Scanner input=new Scanner(System.in);
        System.out.println("kısa kenarı giriniz...");
        Float kisaKenar=input.nextFloat();

        System.out.println("uzun kenarı giriniz...");
        Float uzunKenar=input.nextFloat();

        System.out.println("alan ="+ (kisaKenar*uzunKenar));
        System.out.println("çevre="+ (2*kisaKenar+2*uzunKenar));
    }
}
