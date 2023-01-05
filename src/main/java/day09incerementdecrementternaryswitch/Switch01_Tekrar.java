package day09incerementdecrementternaryswitch;

import java.util.Scanner;

public class Switch01_Tekrar {
    public static void main(String[] args) {
        //example 1 : gün isimlerini verince kacıncı gun oldugunu yazdıran kodu yazınız
        //                sunday==>1.....saturday==>7

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String gunIsmi= input.next();

        switch (gunIsmi){
            case "pazartesi":
                System.out.println(1);
                break;
            case "sali":
                System.out.println(2);
                break;
            case "carsamba":
                System.out.println(3);
                break;
            case "persembe":
                System.out.println(4);
                break;
            case "cuma":
                System.out.println(5);
                break;
            case "cumartesi":
                System.out.println(6);
                break;
            case "pazar":
                System.out.println(7);
                break;
            default:
                System.out.println("lütfen gecrli bir gun ismi giriniz");


        }


    }
}
