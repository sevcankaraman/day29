package practice.datatypesscannerdaytime02.daytime04;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        // kullanıcıdan string bi ifade alınız.
        // harflerini alt alta alacak sekılde "" veya 'a' harfi geldiginde
        // yazdırmayan diğer karakterleri yazdıran kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen string bir ifade giriniz");
        String str = input.nextLine().toLowerCase();// gazi antep

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='a' ||  str.charAt(i)==' '){
                continue;
            }
            System.out.println(str.charAt(i));
        }
    }
}
