package day07ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        //example 3) verilen bir sayının pozitif negatif veya nötr
        // oldugunu kontrol eden kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz...");
        int num= input.nextInt();



        if(num>0){
            System.out.println("pozitif");
        }else if (num<0){
            System.out.println("negatif");
        }else{
            System.out.println("nötr");

        }


    }
}
