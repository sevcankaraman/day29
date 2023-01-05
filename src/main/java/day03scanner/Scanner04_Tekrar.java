package day03scanner;

import java.util.Scanner;

public class Scanner04_Tekrar {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input= new Scanner(System.in);

        System.out.println("iki sayı giriniz..");

        double ilkSayi=input.nextDouble();
        double ikinciSayi=input.nextDouble();

        System.out.println(ilkSayi+ikinciSayi);
        System.out.println(ilkSayi-ikinciSayi);
        System.out.println(ilkSayi*ikinciSayi);
        System.out.println(ilkSayi/ikinciSayi);
        }


    }

