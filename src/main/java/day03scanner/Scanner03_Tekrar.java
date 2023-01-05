package day03scanner;

import java.util.Scanner;

public class Scanner03_Tekrar {
    public static void main(String[] args) {

        //kullanıcıdan adresini alınız ve ekrana yazdırınız

        Scanner input= new Scanner(System.in);
        System.out.println("adresinizi giriniz..");

        //nextln() method kullanıcıdan cok kelimeli string almak için kullanılır.

        String adress =input.nextLine();
        System.out.println(adress);
    }
}
