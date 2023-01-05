package mentorgrupcalismasi;

import java.util.Scanner;

public class Soru4_IfStatement {
    public static void main(String[] args) {

        //example:/Kullanıcıdan 2 tane sayı aldıktan sonra tekrardan kullanıcıya hangi
        // islemi yapmasını isteyecegini soralım.Kullanıcının secimine göre sayılar
        // üzerinde islemler yapınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz: ");
        int sayi1= scan.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        int sayi2= scan.nextInt();
        System.out.print("İslemi seçiniz: ");
        int islem= scan.nextInt();


        System.out.println("\n1.Toplama");
        System.out.println("2.Çıkarma");
        System.out.println("3.Bölme");
        System.out.println("4.Çarpma");

        if(islem == 1) {
            System.out.println("Toplama işleminin sonucu " + (sayi1 + sayi2));
        }
        else if(islem == 2) {
            System.out.println("Çıkarma işleminin sonucu " + (sayi1 - sayi2));
        }
        else if(islem == 3) {
            System.out.println("Bölme işleminin sonucu " + ((float)sayi1 / sayi2));
        }
        else if(islem == 4) {
            System.out.println("Çarpma işleminin sonucu " + (sayi1 * sayi2));
        }
        else {
            System.out.println("Seçiminiz doğru değil !!");
        }
    }
}


