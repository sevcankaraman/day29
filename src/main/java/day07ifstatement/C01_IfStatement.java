package day07ifstatement;

import day03scanner.Scanner01;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        // if it rains , I will cancel the picnic
        // Eger yagmur yagarsa;piknigi iptal edecegim

        //Ex 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz

        char ch = 'a';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("buyuk harf");

        }
        char ch1 = '*';
        if (ch1 >= 'A' && ch1 <= 'Z') {
            System.out.println("buyuk harf");

        }//if body

        //Ex 2) Verilen ir sayi cift sayi ise ekrana cift sayi yazdiran kodu olusturunuz

        int sayi = 5;
        if (sayi % 2 == 0) {
            System.out.println("cift sayı");
        }//if body

        //ex 3)verilen bir sayı 300 den kuçuk veya 1200 den buyuk ise ekrana "harika sayı" yazdıran kodu olusturunuz

        int sayi5 = 200;
        if (sayi5 < 300 || sayi5 > 1200) {
            System.out.println("harika sayı");
        }

        //ex 4)kullanıcıdan alınan bır sayının tek mi çift mi oldugunu yazdıran kodu yazınız.

        //1.yol

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi7 = scan.nextInt();

        if (sayi7 % 2 == 0) {
            System.out.println("çift");
        }
        if (sayi7 % 2 != 0) {
            System.out.println("tek");
        }

        //2.yol

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi6 = input.nextInt();

        if (sayi6 % 2 == 0) {
            System.out.println("cift");
        } else
            System.out.println("tek");

        //ex 5) verilen birsayının negatif, pozitif yada nötr oldugunu söyleyen kodu yazınız

        int sayi8 = -100;

        if (sayi8 < 0) {
            System.out.println("negatif sayı");
        } else if (sayi8 == 0) {
            System.out.println("nötr sayı");
        }
        else {
            System.out.println("pozitif sayı");
        }

    }//main
}//class body