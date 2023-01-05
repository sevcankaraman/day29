package day07ifstatement;

import java.util.Scanner;

public class If02_Tekrar {
    public static void main(String[] args) {

        //example2) kullanıcıdan alınan bir sayının tek mı cıft mı oldugunu yazdıran kodu oluşturunız

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz...");
        int sayi = input.nextInt();

        if( sayi%2==0  ) {
            System.out.println("çift sayi");

        }else  {
            System.out.println("tek sayi");


        }

        }


    }

