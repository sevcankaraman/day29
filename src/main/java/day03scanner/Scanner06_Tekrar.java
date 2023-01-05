package day03scanner;

import java.util.Scanner;

public class Scanner06_Tekrar {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz

        //bir sayının son rakamını alabilmek için o sayıyı 10 a bolun kalana bakın
        //bir tamsayıyı bir tamsayıya bölerseniz java sonucu kesinlikle tam sayı yapar.
        //java sonucu nasıl tamsayı yapar?
        //ondalıklı kısmı iptal eder.


        Scanner input= new Scanner(System.in);
        System.out.println("bes basamaklı bir sayı gırınız");
        int sayi=input.nextInt();

        // son rakamı al
        int sonRakam= sayi%10;
        sayi=sayi/10;

        //sondan ikinci rakamı al

        int sondanIkinciRakam=sayi%10;
        sayi=sayi/10;

        //sondan üçüncü rakamı al

        int sondanUcuncuRakam=sayi%10;
        sayi=sayi/10;

        //sondan dördüncü rakamı al

        int sondanDorduncuRakam=sayi%10;
        sayi=sayi/10;

        //sondan besinci rakamı al

        int sondanBesinciRakam=sayi%10;
        sayi=sayi/10;

        System.out.println(sonRakam+sondanIkinciRakam+sondanDorduncuRakam+sondanBesinciRakam);







    }
}
