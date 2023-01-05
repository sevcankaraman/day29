package day11loops;

import java.util.Scanner;

public class C03_ForLoop {

    // interwiew questions

    //String karakterleri teker teker azdiran;
    //Eger 'a' karakterini gorurse yazdirmayi durduran kodu yaziniz

    public static void main(String[] args) {

        String cumle = "0grenmek yasamın tek kanıtıdır";

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == 'a') {
                break;
            }
            System.out.print(cumle.charAt(i)+"  ");
        }
    }
}
