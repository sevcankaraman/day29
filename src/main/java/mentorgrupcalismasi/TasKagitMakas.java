package mentorgrupcalismasi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {

     /* TASK:
         tas >makas ==>
         makas >kagit
         kagit >tas

    Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
    Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
    While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
    Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
    Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
    Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
    En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
    dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.

     */

        Scanner input = new Scanner(System.in);
        System.out.println("oyunumuza hosgeldiniz...");
        System.out.println("oyundan cıkmak içic q ya basınız...");

        int kullanicipuan = 100;
        int pcpuan = 100;
        int secim;


        do {
            System.out.println("oyun baslıyor...\n 1.tas\n 2.kağıt \n 3.makas\n");
            secim = input.nextInt();
            //kullanıcı secımı
            switch (secim){
                case 1:
                    System.out.println("tas");
                    break;
                case 2:
                    System.out.println("kağıt");
                    break;
                case 3:
                    System.out.println("makas");
                break;
                default:
                    System.out.println("gecerli bir giriş yapınız");
            }
            //pc secimi
            int pcsecim = (int)((Math.random()*3)+1);
            String pc="";
            switch (pcsecim){
                case 1:
                    System.out.println("tas");
                    break;
                case 2:
                    System.out.println("kağıt");
                    break;
                case 3:
                    System.out.println("makas");
                    break;
                default:
                    System.out.println("gecerli bir girş yapınız");
            }
            //karsılastırma
            System.out.println("Kullanicinin Secimi :"+secim + "\n" + "Bilgisayarin Secimi :"+pcsecim);
            if (secim==pcsecim){
                System.out.println("berabere...puan alamadınız");
                continue;
            } else if (secim==1 && pcsecim==2 || secim==3 && pcsecim==2 || secim==3 && secim==1) {
                System.out.println(" bu turu pc kazandı...");
                kullanicipuan-=10;

            }else{
                System.out.println("bu turu siz kazandınız...");
                pcpuan-=10;
            }
            System.out.println("kullanıcı puanı : " +kullanicipuan+ "   "+"pc puanı : "+ pcpuan);
            //puanlama
            if (kullanicipuan==pcpuan) {
                if (pcpuan == 0) {
                    System.out.println("bilgisayarın puanı bitti ... siz kazandınız...tebrikler");
                }else{
                    System.out.println("puanınız bitti... bilgisayar kazandı...Tekrar bekleriz");
                }
                System.out.println("Tekrar Oynamak Ister misiniz?\n1.Evet(E)\n2.Hayir(H)");
                String tekrarOyna =input.next();

                if (tekrarOyna.equalsIgnoreCase("e")){
                    pcpuan=100;
                    kullanicipuan=100;
                }else {
                    System.out.println("Oyunu Oynadiginiz Icin Tesekkür Ederiz...Gule Gule...");
                    break;
                }
            }


        } while (true);

    }}