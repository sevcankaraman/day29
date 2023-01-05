package mentorgrupcalismasi;

import java.util.Scanner;

public class tasemrebey {
    public static void main(String[] args) {
        // Kullanıcı ve bilgisayarın başlangıç puanları
        int pointOfComp=10;
        int pointOfUser=10;



        do {

            System.out.println("=====Taş-Kagit-Makas Oyununa Hosgeldiniz=====");

            System.out.println("Seçiminizi Giriniz:\n1.Tas\n2.Kagit\n3.Makas");
            //Kullanicidan deger alıyoruz...
            Scanner input = new Scanner(System.in);
            int userSelect = input.nextInt();

            //Kullanicinin secimini String'e ceviriyoruz...
            String userSelectString;
            if (userSelect==1){
                userSelectString="Tas";
            } else if (userSelect==2) {
                userSelectString="Kagit";
            } else if (userSelect==3) {
                userSelectString="Makas";
            } else{
                System.out.println("Gecersiz Secim.Lutfen Tekrar Giris Yapiniz...");
                continue;
            }

            //Bilgisayarin secimini String'e ceviriyoruz...
            int compSelect = (int)((Math.random()*3)+1);
            String compSelectString="";
            if (compSelect==1){
                compSelectString="Tas";
            } else if (compSelect==2) {
                compSelectString="Kagit";
            }else if (compSelect==3){
                compSelectString="Makas";
            }



            System.out.println("Kullanicinin Secimi :"+userSelectString + "\n" +  //Önce secimleri ekranda gösterelim
                    "Bilgisayarin Secimi :"+compSelectString);

            //Kazananı belirliyoruz

            if (userSelect==compSelect){
                System.out.println("Berabere...");
                continue;
            } else if (userSelect==1 && compSelect==2||
                    userSelect==2 && compSelect==3||
                    userSelect==3 && compSelect==1){
                System.out.println("Bu Turu Bilgisayar kazandi...");
                pointOfUser-=10;
            }else {
                System.out.println("Bu Turu Siz Kazandiniz...");
                pointOfComp-=10;
            }
            System.out.println("Kullanicinin kalan puani :"+pointOfUser+" ======== Bilgisayarin kalan puani :"+pointOfComp);

            if (pointOfComp==0||pointOfUser==0){
                if (pointOfComp==0){
                    System.out.println("Tebrikler.Bilgisayarin puani bitti ve siz kazandiniz...");
                }else
                    System.out.println("Üzgünüm puaniniz bitti ve oyunu kaybettiniz...");
            }

            //Kullanıcıya tekrar oynamak isteyip istemediğini soralım...
            System.out.println("Tekrar Oynamak Ister misiniz?\n1.Evet(E)\n2.Hayir(H)");
            String tekrarOyna =input.next();

            if (tekrarOyna.equalsIgnoreCase("e")){
                pointOfComp=100;
                pointOfUser=100;
            }else {
                System.out.println("Oyunu Oynadiginiz Icin Tesekkür Ederiz...Gule Gule...");
                break;
            }



        }while (true);

    }
}