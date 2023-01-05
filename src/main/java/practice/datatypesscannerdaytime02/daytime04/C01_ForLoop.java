package practice.datatypesscannerdaytime02.daytime04;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        //example: kullanıcıdan aldıgınız bir string degerde kucuk "c" den önceki "a"
        // harfinin String deger içerisinde kac kez gectiğini bulan kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen string bir ifade giriniz");
        String str = input.nextLine().toLowerCase();
        int sayac = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                sayac++;
            } else if (str.charAt(i) == 'c') {
                break;
            }
        }
        System.out.println("c öncesi a ların sayısı = " + sayac);
    }
}