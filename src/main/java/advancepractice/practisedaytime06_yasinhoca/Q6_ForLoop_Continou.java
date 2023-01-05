package advancepractice.practisedaytime06_yasinhoca;

import java.util.Scanner;

public class Q6_ForLoop_Continou {
    public static void main(String[] args) {
        /*
      Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
      Not: 5 ve 10 dahil değil.
      */

        Scanner input = new Scanner(System.in);
        int toplam=0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Bir tamsayı giriniz");
            int sayi = input.nextInt();// for loopun dısında kullanmayacagım ıcın for loopun ıcınde kullandım

            if(sayi>5 && sayi<10){
                System.out.println("girdiğiniz sayi 5 ile 10 arasındadır.Toplama dahil olamayacaktır");
                continue;// calısırsa loop basa döner
            }
            toplam+=sayi;
        }
        System.out.println("toplam="+toplam);

    }
}
