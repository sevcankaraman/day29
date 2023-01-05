package day07ifstatement;

import java.util.Scanner;

public class IStatement02 {
    public static void main(String[] args) {
        //example2) kullanıcıdan alınan bir sayının tek mı cıft mı oldugunu yazdıran kodu oluşturunız

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz...");
        int num= input.nextInt();

        if (num%2==0){
            System.out.println("cift sayı");
        }
        if(num%2!=0){
            System.out.println("tek sayı");

            //2.yol:
            if (num%2==0) {
                System.out.println("cift sayı");

            }else{
                System.out.println("tek sayı");
            }
        }
    }
}
