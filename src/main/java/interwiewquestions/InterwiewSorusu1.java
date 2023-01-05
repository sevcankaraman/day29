package interwiewquestions;

import java.util.Scanner;

public class InterwiewSorusu1 {
    /*
    Interwiew Questions
     Kullanicidan toplanmak uzere sayilar isteyin
     sayi adedi 10'u gecerse veya toplam 500 'u gecerse
     bu kadar sayi yeter
     ".... adet sayi girdiniz , toplami..." yazdirin
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int sayac = 0;

        while (sayac < 11 && toplam < 501) {
            sayac++;
            System.out.println("Lutfen toplanmak uzere " + sayac + ". sayiyi giriniz..");

            int sayi = input.nextInt();
            toplam += sayi;
        }
        if (toplam>500){
            System.out.println(sayac+"adet sayı girdiniz.Toplamı = "+toplam);
        }else{
            System.out.println("bu kadar sayı yeter " +sayac+ " adet sayı girdiniz " +toplam);
        }
    }
}