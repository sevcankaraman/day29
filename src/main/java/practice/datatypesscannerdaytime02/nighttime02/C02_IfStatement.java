package practice.datatypesscannerdaytime02.nighttime02;

import java.awt.*;
import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        /*kullanıcıdan alacagınız 2 sayıyı yine kullanıcıya sectirecegniz
        dört işlemden biri ile işlemekoyup yazdırınız
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen\n toplama yapmak icin 1\n cikarma yapamk icin " +
                "2\n carpma yapma icin 3 \n bolme yapmak icin 4\n giriniz");//kullaniciya secmesi icin menu olusturdum

        int islem=input.nextInt();
        System.out.println("lütfen ıkı tam sayı gırınız");
        double num1=input.nextDouble();
        double num2= input.nextDouble();

        if (islem==1){
            System.out.println("Toplama isleminin sonucu:"+ num1 + "+" + num2 + "=" + (num1+num2));
        }else if (islem==2){
            System.out.println("Cikarma isleminin sonucu:"+ num1 + "-" + num2 + "=" + (num1-num2));
        }else if (islem==3){
            System.out.println("Carpma isleminin sonucu:"+ num1 + "*" + num2 + "=" + (num1*num2));
        }else if (islem==4){
            System.out.println("Bolme isleminin sonucu:"+ num1 + "/" + num2 + "=" + (num1/num2));
        }else{
            System.out.println("hatalı secim yaptınız");
        }









    }
}
