package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("dikdortgenin kısa kenar uzunlugunu giriniz..");
        float shortSide = input.nextFloat();
        System.out.println("dikdortgenin uzun kenarını girin..");
        float longSide = input.nextFloat();
        System.out.println("Alan="+(shortSide*longSide));
        System.out.println("cevre=" +(2*shortSide+2*longSide));
    }
}
