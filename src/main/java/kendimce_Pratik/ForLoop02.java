package kendimce_Pratik;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {

        //kullanıcıdan ıkı sayı alıp aradakı tum sayılaı yazdıran kodu yazınız(interwiew sorusu)

        Scanner input= new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int toplam = 0;

        for (int i = a ; i<=b;i++){
            toplam +=i;

        }
        System.out.println(toplam);

    }
}
