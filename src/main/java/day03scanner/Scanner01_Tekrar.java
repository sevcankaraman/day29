package day03scanner;

import java.util.Scanner;

public class Scanner01_Tekrar {

    //kullaıcıdan data alıp kodlarımızda kullanıcaz

    public static void main(String[] args) {

        //1. adım : scanner class dan object olustur

        Scanner input = new Scanner(System.in);

        //2.Adım : kullanıcıya ne ıstediğinize dair mesaj veriv

        System.out.println("lütfen yasınız girin" );

        //3. Adım : uygun methodu kullanarak kullanıcının verdiği datayı memory e yerlesştiriniz

        byte age=input.nextByte();
        System.out.println(age);


    }



}

