package day08nestedif;

import java.util.Scanner;

public class C05_Ternary {

    //kullanıcıdan bir sayi alin ve mutlak değerini yazdırın

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi= input.nextInt();

        System.out.println(sayi<=0 ? sayi*-1:sayi );


        //kullanıcıdan bir sayi aliniz pozitifse "pozitif" negatifse " negatif" yazdırın


        System.out.println(sayi>=0 ? "pozitif": "negatif");


        String sonuc =sayi>=0 ? "pozitif": "negatif";
        System.out.println(sonuc);

        //Kullanicidan bir sayi aliniz Pozitifse Pozitif Negatifse sayinin karesini yazdirin

        System.out.println(sayi>=0 ? "pozitif": sayi*sayi);
    }
}
