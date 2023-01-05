package day03scanner;

import java.util.Scanner;

public class Scanner02_Tekrar {
    public static void main(String[] args) {

        //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz
        Scanner input=new Scanner(System.in);

        System.out.println("adınızı girinizi...");

        //next method kullanıcıdan tek kelimeli string almak için kullanılır.

        String isim= input.next();

        System.out.println("soyadınızı giriniz...");
        String soyad=input.next();

        System.out.println(isim+"  "+soyad);

    }

}
