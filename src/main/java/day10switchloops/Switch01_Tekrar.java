package day10switchloops;

import java.util.Scanner;

public class Switch01_Tekrar {
    public static void main(String[] args) {
        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        // yazdiran kodu yaziniz.
        // 8 ==> August - September - October - November - December

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bi ay numarası giriniz");
        int ayNum= input.nextInt();
        String ay="";

        switch (ayNum){
            case 1:
                System.out.println("ocak");

            case 2:
                System.out.println("subat");
            case 3:
                System.out.println("mart");
            case 4:
                System.out.println("nisan");
            case 5:
                System.out.println("mayıs");
            case 6:
                System.out.println("haziran");
            case 7:
                System.out.println("temmuz");
            case 8:
                System.out.println("ağustos");
            case 9:
                System.out.println("eylül");
            case 10:
                System.out.println("ekim");
            case 11:
                System.out.println("kasım");
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("lütfen gecerli bir ay numarası veriniz...!");

        }



    }
}
