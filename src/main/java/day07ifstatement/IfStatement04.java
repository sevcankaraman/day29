package day07ifstatement;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {
        //example 1: gun sayısını verdiğinizde gun ismini yazan kodu yazınız
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz...\n 1 : Pazar 2 : Pazartesi  3: Sali  4 : Carsamba  5: Persembe  6 : Cuma  7 : Cumartesi");
        byte gunNo = input.nextByte();

        if(gunNo==1){
            System.out.println("pazar");
        } else if (gunNo==2) {
            System.out.println("pazartesi");
        } else if (gunNo==3) {
            System.out.println("sali");
        } else if (gunNo==4) {
            System.out.println("carsamba");
        } else if (gunNo==5) {
            System.out.println("persembe");
        } else if (gunNo==6) {
            System.out.println("cuma");
        } else if (gunNo==7) {
            System.out.println("cumartesi");
        }else {
            System.out.println("Hatalı giris yaptiniz. Lutfen 1 ile 7 arasinda bir sayi giriniz..");
        }




        }

    }

