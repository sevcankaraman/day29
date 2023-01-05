package advancepractice.practisedaytime06_yasinhoca;

import java.util.Scanner;

public class C03_DoWhile_TahminOyunu {
    public static void main(String[] args) {
       // /0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?

        Scanner input = new Scanner(System.in);
        int rastgeleSayi = (int)(Math.random()*101);
        int sayi;
        int sayac = 10;
        System.out.println("0-100 arası(dahil) bir tamsayı giriniz.");

        do {
            sayac--;
            sayi = input.nextInt();
            if(sayi<rastgeleSayi){
                System.out.println(sayac+" hakkınız kaldı");
                System.out.println("Daha büyük bir sayı giriniz");

            } else if (sayi>rastgeleSayi) {
                System.out.println(sayac+" hakkınız kaldı");
                System.out.println("Daha küçük bir sayı giriniz");
            } else {
                System.out.println("Tebrikler!!!"+ (10-sayac)+" tahminde buldunuz");
                System.out.println("Puanınız: "+(sayac+1)*10);
            }
            //Ödev: Yeniden oynama hakkı...

            if(sayac==0){

                System.out.println("Hakkınız bitti, yeniden başlamak için 'R' tusuna basiniz, oyunda çıkmak için 'Q' tuşuna basınız");
                String r = input.next();
                if (r.equalsIgnoreCase("r")) {
                    sayac = 0;
                } else if (r.equalsIgnoreCase("q")) {
                    System.out.println("Oyun bitti");
                    break;
                }
            }
        } while (sayi != rastgeleSayi);
    }

    }

